package br.com.FinanceFlow.domain.vo;

import br.com.FinanceFlow.domain.entity.Bill;
import jakarta.persistence.Embeddable;

@Embeddable
public class InternetCategory extends CategoryStatus{
  public InternetCategory(Bill bill) {
    super(bill, Category.INTERNET);
  }
}
