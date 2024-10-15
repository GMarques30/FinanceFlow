package br.com.FinanceFlow.application.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record UpdateBillInput(UUID billId, BigDecimal amount, String description, String category, String occurredAt) {
}
