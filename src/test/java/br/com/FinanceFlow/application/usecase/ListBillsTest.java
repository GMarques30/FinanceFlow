package br.com.FinanceFlow.application.usecase;

import br.com.FinanceFlow.application.dto.ListBillsOutput;
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

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
public class ListBillsTest {

  @Autowired
  private BillRepository billRepository;

  @Autowired
  private ListBills sut;

  @Test
  @Transactional
  @DisplayName("Should be able to list all bills")
  public void should_be_able_to_list_all_bills() {
    Bill bill1 = new Bill(new BigDecimal("10.00"), "PIX", "RENT","10-2024");
    Bill bill2 = new Bill(new BigDecimal("100.00"), "INTERNET", "INTERNET","09-2024");
    this.billRepository.save(bill1);
    this.billRepository.save(bill2);
    List<ListBillsOutput> result = this.sut.execute();
    assertFalse(result.isEmpty());
    assertNotNull(result.get(0).billId());
    assertEquals(new BigDecimal("10.00"), result.get(0).amount());
    assertEquals("PIX", result.get(0).description());
    assertEquals("RENT", result.get(0).category());
    assertEquals("10-2024", result.get(0).occurredAt());
    assertNotNull(result.get(1).billId());
    assertEquals(new BigDecimal("100.00"), result.get(1).amount());
    assertEquals("INTERNET", result.get(1).description());
    assertEquals("INTERNET", result.get(1).category());
    assertEquals("09-2024", result.get(1).occurredAt());
  }
}
