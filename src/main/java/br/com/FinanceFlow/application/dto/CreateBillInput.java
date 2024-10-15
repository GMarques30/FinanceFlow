package br.com.FinanceFlow.application.dto;

import java.math.BigDecimal;

public record CreateBillInput(BigDecimal amount, String description, String category, String occurredAt) {
}
