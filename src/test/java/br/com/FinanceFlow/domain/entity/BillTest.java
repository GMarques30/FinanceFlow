package br.com.FinanceFlow.domain.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class BillTest {

  @Test
  @DisplayName("Should be able to create bill entity")
  public void should_be_able_to_create_bill_entity() {
    Bill bill = new Bill(new BigDecimal("218.932"), "PIX", "RENT", "10-2024");
    assertNotNull(bill.getBillId());
    assertEquals(new BigDecimal("218.93"), bill.getAmount());
    assertEquals("PIX", bill.getDescription());
    assertEquals("RENT", bill.getCategory());
    assertNotNull(bill.getCreatedAt());
    assertEquals("10-2024", bill.getOccurredAt());
  }
}
