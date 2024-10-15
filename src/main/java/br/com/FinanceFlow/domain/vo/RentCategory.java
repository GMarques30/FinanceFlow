package br.com.FinanceFlow.domain.vo;

import br.com.FinanceFlow.domain.entity.Bill;
import jakarta.persistence.Embeddable;

@Embeddable
public class RentCategory extends CategoryStatus{
  public RentCategory(Bill bill) {
    super(bill, Category.RENT);
  }
}
