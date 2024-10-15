package br.com.FinanceFlow.domain.vo;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CategoryStatusConverter implements AttributeConverter<CategoryStatus, String> {

  @Override
  public String convertToDatabaseColumn(CategoryStatus categoryStatus) {
    return categoryStatus != null ? categoryStatus.getCategory() : null;
  }

  @Override
  public CategoryStatus convertToEntityAttribute(String category) {
    return category != null ? CategoryFactory.create(null, category) : null;
  }
}
