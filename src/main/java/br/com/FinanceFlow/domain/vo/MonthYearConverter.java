package br.com.FinanceFlow.domain.vo;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class MonthYearConverter implements AttributeConverter<MonthYear, String> {
  @Override
  public String convertToDatabaseColumn(MonthYear monthYear) {
    return monthYear != null ? monthYear.getOccurredAt() : null;
  }

  @Override
  public MonthYear convertToEntityAttribute(String s) {
    return s != null ? new MonthYear(s) : null;
  }
}
