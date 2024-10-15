package br.com.FinanceFlow.domain.vo;

import br.com.FinanceFlow.domain.entity.Bill;

public class CategoryFactory {
  public static CategoryStatus create(Bill bill, String category) {
    if(category.equalsIgnoreCase("rent")) return new RentCategory(bill);
    if(category.equalsIgnoreCase("electricity")) return new ElectricityCategory(bill);
    if(category.equalsIgnoreCase("water")) return new WaterCategory(bill);
    if(category.equalsIgnoreCase("internet")) return new InternetCategory(bill);
    if(category.equalsIgnoreCase("gas")) return new GasCategory(bill);
    if(category.equalsIgnoreCase("phone")) return new PhoneCategory(bill);
    if(category.equalsIgnoreCase("groceries")) return new GroceriesCategory(bill);
    throw new IllegalArgumentException("Invalid category");
  }

}
