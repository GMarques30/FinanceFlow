package br.com.FinanceFlow.domain.entity;

import br.com.FinanceFlow.domain.vo.*;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Entity
@Table(name = "bills", schema = "financeflow")
public class Bill {
  @Id
  @Column(name = "bill_id")
  private UUID billId;
  @Column(name = "amount", nullable = false, precision = 10, scale = 2)
  private BigDecimal amount;
  @Column(name = "description")
  private String description;
  @Column(name = "category")
  @Convert(converter = CategoryStatusConverter.class)
  private CategoryStatus category;
  @Column(name = "created_at", nullable = false)
  private String createdAt;
  @Column(name = "occurred_at", nullable = false)
  @Convert(converter = MonthYearConverter.class)
  private MonthYear occurredAt;

  public Bill() {}

  public Bill(BigDecimal amount, String description, String category, String occurredAt) {
    this.billId = UUID.randomUUID();
    this.amount = amount.setScale(2, RoundingMode.HALF_EVEN);
    this.description = description;
    this.category = CategoryFactory.create(this, category);
    this.createdAt = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    this.occurredAt = new MonthYear(occurredAt);
  }

  public UUID getBillId() {
    return this.billId;
  }

  public BigDecimal getAmount() {
    return this.amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount.setScale(2, RoundingMode.HALF_EVEN);;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCategory() {
    return this.category.getCategory();
  }

  public void setCategory(String category) {
    this.category = CategoryFactory.create(this, category);
  }

  public String getCreatedAt() {
    return this.createdAt;
  }

  public String getOccurredAt() {
    return this.occurredAt.getOccurredAt();
  }

  public void setOccurredAt(String occurredAt) {
    this.occurredAt = new MonthYear(occurredAt);
  }
}
