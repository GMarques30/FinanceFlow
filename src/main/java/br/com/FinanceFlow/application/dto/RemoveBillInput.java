package br.com.FinanceFlow.application.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public record RemoveBillInput(UUID billId) {
  @JsonCreator
  public RemoveBillInput(@JsonProperty("billId") String billIdString) {
    this(UUID.fromString(billIdString));
  }
}
