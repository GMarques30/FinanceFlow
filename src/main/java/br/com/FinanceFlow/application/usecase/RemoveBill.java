package br.com.FinanceFlow.application.usecase;

import br.com.FinanceFlow.application.dto.RemoveBillInput;
import br.com.FinanceFlow.application.exception.BillNotFoundException;
import br.com.FinanceFlow.application.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RemoveBill {
  private final BillRepository billRepository;

  @Autowired
  public RemoveBill(BillRepository billRepository) {
    this.billRepository = billRepository;
  }

  public void execute(RemoveBillInput input) {
    System.out.println(input.billId());
    this.billRepository.findById(input.billId()).orElseThrow(() -> new BillNotFoundException());
    this.billRepository.deleteById(input.billId());
  }
}
