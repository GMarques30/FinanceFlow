package br.com.FinanceFlow.domain.vo;

public class MonthYear {
  private final String occurredAt;

  public MonthYear(String occurredAt) {
    if(!occurredAt.matches("^(0[1-9]|1[0-2])-\\d{4}$")) {
      throw new IllegalArgumentException("Invalid month and year");
    }
    this.occurredAt = occurredAt;
  }

  public String getOccurredAt() {
    return this.occurredAt;
  }
}
