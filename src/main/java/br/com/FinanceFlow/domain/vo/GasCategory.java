package br.com.FinanceFlow.domain.vo;

import br.com.FinanceFlow.domain.entity.Bill;
import jakarta.persistence.Embeddable;

@Embeddable
public class GasCategory extends CategoryStatus{
  public GasCategory(Bill bill) {
    super(bill, Category.GAS);
  }
}
