package br.com.FinanceFlow.application.exception;

import org.springframework.http.HttpStatus;

public class BillNotFoundException extends RuntimeException{
  public HttpStatus status;

  public BillNotFoundException() {
    super("Bill not found");
    this.status = HttpStatus.NOT_FOUND;
  }
}
