package br.com.FinanceFlow.domain.vo;

import br.com.FinanceFlow.domain.entity.Bill;


public abstract class CategoryStatus {
  private Category category;
  public Bill bill;

  public CategoryStatus() {}

  public CategoryStatus(Bill bill, Category category) {
    this.category = category;
    this.bill = bill;
  }

  public String getCategory() {
    return this.category.name();
  }
}
