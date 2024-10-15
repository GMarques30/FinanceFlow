package br.com.FinanceFlow.application.usecase;


import br.com.FinanceFlow.application.dto.RemoveBillInput;
import br.com.FinanceFlow.application.exception.BillNotFoundException;
import br.com.FinanceFlow.application.repository.BillRepository;
import br.com.FinanceFlow.domain.entity.Bill;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@ActiveProfiles("test")
public class RemoveBillTest {

  @Autowired
  private RemoveBill sut;

  @Autowired
  private BillRepository billRepository;

  @Test
  @Transactional
  @DisplayName("Should be able to remove a bill")
  public void should_be_able_to_remove_a_bill() {
    Bill bill = new Bill(new BigDecimal("10.00"), "PIX", "RENT","10-2024");
    this.billRepository.save(bill);
    this.sut.execute(new RemoveBillInput(bill.getBillId()));
    List<Bill> result = this.billRepository.findAll();
    assertThat(result.isEmpty()).isTrue();
  }

  @Test
  @Transactional
  @DisplayName("Should not be able to remove a unexisting bill")
  public void should_not_be_able_to_remove_a_unexisting_bill() {
    assertThrows(BillNotFoundException.class, () -> this.sut.execute(new RemoveBillInput(UUID.randomUUID())));
  }
}
