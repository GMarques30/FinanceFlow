package br.com.FinanceFlow.application.usecase;

import br.com.FinanceFlow.application.dto.UpdateBillInput;
import br.com.FinanceFlow.application.exception.BillNotFoundException;
import br.com.FinanceFlow.application.repository.BillRepository;
import br.com.FinanceFlow.domain.entity.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UpdateBill {
  private final BillRepository billRepository;

  @Autowired
  public UpdateBill(BillRepository billRepository) {
    this.billRepository = billRepository;
  }

  public void execute(UpdateBillInput input) {
    Bill bill = this.billRepository.findById(input.billId()).orElseThrow(() -> new BillNotFoundException());
    if(input.amount() != null) {
      bill.setAmount(input.amount());
    }
    if(input.description() != null) {
      bill.setDescription(input.description());
    }
    if(input.category() != null) {
      bill.setCategory(input.category());
    }
    if(!Objects.equals(input.occurredAt(), "")) {
      bill.setOccurredAt(input.occurredAt());
    }
    this.billRepository.save(bill);
  }
}
