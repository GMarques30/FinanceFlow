package br.com.FinanceFlow.application.usecase;

import br.com.FinanceFlow.application.dto.CreateBillInput;
import br.com.FinanceFlow.application.repository.BillRepository;
import br.com.FinanceFlow.domain.entity.Bill;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
public class CreateBillTest {

  @Autowired
  private CreateBill sut;

  @Autowired
  private BillRepository billRepository;

  @Test
  @Transactional
  @DisplayName("Should be able to create a bill")
  public void should_be_able_to_create_a_bill() {
    CreateBillInput input = new CreateBillInput(new BigDecimal("10.204"), "PIX", "RENT","10-2024");
    this.sut.execute(input);
    List<Bill> result = this.billRepository.findAll();
    assertThat(result.isEmpty()).isFalse();
    assertNotNull(result.get(0).getBillId());
    assertEquals(new BigDecimal("10.20"), result.get(0).getAmount());
    assertEquals("PIX", result.get(0).getDescription());
    assertEquals("RENT", result.get(0).getCategory());
    assertNotNull(result.get(0).getCreatedAt());
    assertEquals("10-2024", result.get(0).getOccurredAt());
  }
}
