package br.com.FinanceFlow.domain.vo;

import br.com.FinanceFlow.domain.entity.Bill;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoryStatusTest {
  public Bill bill;

  @BeforeEach
  public void beforeEach() {
    bill = new Bill();
  }

  @Test
  @DisplayName("Should be able to create rent category")
  public void should_be_able_to_create_rent_category() {
    CategoryStatus sut = CategoryFactory.create(bill, "rent");
    assertInstanceOf(RentCategory.class, sut);
    assertEquals("RENT", sut.getCategory());
  }

  @Test
  @DisplayName("Should be able to create electricity category")
  public void should_be_able_to_create_electricity_category() {
    CategoryStatus sut = CategoryFactory.create(bill, "electricity");
    assertInstanceOf(ElectricityCategory.class, sut);
    assertEquals("ELECTRICITY", sut.getCategory());
  }

  @Test
  @DisplayName("Should be able to create water category")
  public void should_be_able_to_create_water_category() {
    CategoryStatus sut = CategoryFactory.create(bill, "water");
    assertInstanceOf(WaterCategory.class, sut);
    assertEquals("WATER", sut.getCategory());
  }

  @Test
  @DisplayName("Should be able to create internet category")
  public void should_be_able_to_create_internet_category() {
    CategoryStatus sut = CategoryFactory.create(bill, "internet");
    assertInstanceOf(InternetCategory.class, sut);
    assertEquals("INTERNET", sut.getCategory());
  }

  @Test
  @DisplayName("Should be able to create gas category")
  public void should_be_able_to_create_gas_category() {
    CategoryStatus sut = CategoryFactory.create(bill, "gas");
    assertInstanceOf(GasCategory.class, sut);
    assertEquals("GAS", sut.getCategory());
  }

  @Test
  @DisplayName("Should be able to create phone category")
  public void should_be_able_to_create_phone_category() {
    CategoryStatus sut = CategoryFactory.create(bill, "phone");
    assertInstanceOf(PhoneCategory.class, sut);
    assertEquals("PHONE", sut.getCategory());
  }

  @Test
  @DisplayName("Should be able to create groceries category")
  public void should_be_able_to_create_groceries_category() {
    CategoryStatus sut = CategoryFactory.create(bill, "groceries");
    assertInstanceOf(GroceriesCategory.class, sut);
    assertEquals("GROCERIES", sut.getCategory());
  }

  @Test
  @DisplayName("Should not be able to create a category")
  public void should_not_be_able_to_create_a_category() {
    assertThrows(IllegalArgumentException.class, () -> CategoryFactory.create(bill, "invalid category"));
  }
}
