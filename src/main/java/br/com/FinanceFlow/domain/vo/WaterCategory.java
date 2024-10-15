package br.com.FinanceFlow.domain.vo;

import br.com.FinanceFlow.domain.entity.Bill;
import jakarta.persistence.Embeddable;

@Embeddable
public class WaterCategory extends CategoryStatus{
  public WaterCategory(Bill bill) {
    super(bill, Category.WATER);
  }
}
