package br.com.FinanceFlow.domain.vo;

import br.com.FinanceFlow.domain.entity.Bill;
import jakarta.persistence.Embeddable;

@Embeddable
public class ElectricityCategory extends CategoryStatus{
  public ElectricityCategory(Bill bill) {
    super(bill, Category.ELECTRICITY);
  }
}
