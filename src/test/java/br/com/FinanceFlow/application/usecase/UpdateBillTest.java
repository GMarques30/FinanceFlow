package br.com.FinanceFlow.application.usecase;

import br.com.FinanceFlow.application.dto.UpdateBillInput;
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
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
public class UpdateBillTest {
  @Autowired
  private BillRepository billRepository;

  @Autowired
  private UpdateBill sut;

  @Test
  @Transactional
  @DisplayName("Should be able to update a bill existing")
  public void should_be_able_to_update_a_bill_existing() {
    Bill bill = new Bill(new BigDecimal("20.00"), "PIX", "RENT", "10-2024");
    this.billRepository.save(bill);
    this.sut.execute(new UpdateBillInput(bill.getBillId(), new BigDecimal("10.00"), "Groceries", "GROCERIES", "09-2024"));
    Optional<Bill> result = this.billRepository.findById(bill.getBillId());
    assertTrue(result.isPresent());
    assertNotNull(result.get().getBillId());
    assertEquals(new BigDecimal("10.00"), result.get().getAmount());
    assertEquals("Groceries", result.get().getDescription());
    assertEquals("GROCERIES", result.get().getCategory());
    assertEquals("09-2024", result.get().getOccurredAt());
  }

  @Test
  @Transactional
  @DisplayName("Should not be able to update a unexisting bill")
  public void should_not_be_able_to_update_a_unexisting_bill() {
    assertThrows(BillNotFoundException.class, () -> this.sut.execute(new UpdateBillInput(UUID.randomUUID(), new BigDecimal("100.953"), "PIX", "RENT", "01-2011")));
  }
}
