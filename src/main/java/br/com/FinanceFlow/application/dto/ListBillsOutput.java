package br.com.FinanceFlow.application.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record ListBillsOutput(UUID billId, BigDecimal amount, String description, String category, String createdAt, String occurredAt) {
}
