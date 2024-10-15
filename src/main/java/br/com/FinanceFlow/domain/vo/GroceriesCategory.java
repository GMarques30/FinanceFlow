package br.com.FinanceFlow.domain.vo;

import br.com.FinanceFlow.domain.entity.Bill;
import jakarta.persistence.Embeddable;

@Embeddable
public class GroceriesCategory extends CategoryStatus{
  public GroceriesCategory(Bill bill) {
    super(bill, Category.GROCERIES);
  }
}
