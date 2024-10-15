package br.com.FinanceFlow.domain.vo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MonthYearTest {
  @Test
  @DisplayName("Should be able to create a valid month and year")
  public void should_be_able_to_create_a_valid_month_and_year() {
    assertDoesNotThrow(() -> new MonthYear("01-2023"));
    assertDoesNotThrow(() -> new MonthYear("05-1999"));
    assertDoesNotThrow(() -> new MonthYear("12-2020"));
    assertDoesNotThrow(() -> new MonthYear("08-1987"));
  }

  @Test
  @DisplayName("Should not be able to create invalids month and year")
  public void should_not_be_able_to_create_invalids_month_and_year() {
    assertThrows(IllegalArgumentException.class, () -> new MonthYear("00-2020"));
    assertThrows(IllegalArgumentException.class, () -> new MonthYear("13-2020"));
    assertThrows(IllegalArgumentException.class, () -> new MonthYear("5-2020"));
    assertThrows(IllegalArgumentException.class, () -> new MonthYear("01-20"));
    assertThrows(IllegalArgumentException.class, () -> new MonthYear("01-202"));
    assertThrows(IllegalArgumentException.class, () -> new MonthYear("0321-2024"));
    assertThrows(IllegalArgumentException.class, () -> new MonthYear("01-20234"));
    assertThrows(IllegalArgumentException.class, () -> new MonthYear("0132-20234"));
    assertThrows(IllegalArgumentException.class, () -> new MonthYear("dsadsa"));
  }
}
