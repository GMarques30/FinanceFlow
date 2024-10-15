package br.com.FinanceFlow.application.usecase;

import br.com.FinanceFlow.application.dto.CreateBillInput;
import br.com.FinanceFlow.application.repository.BillRepository;
import br.com.FinanceFlow.domain.entity.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateBill {
  private final BillRepository billRepository;

  @Autowired
  public CreateBill(BillRepository billRepository) {
    this.billRepository = billRepository;
  }

  public void execute(CreateBillInput input) {
    Bill bill = new Bill(input.amount(), input.description(), input.category(), input.occurredAt());
    this.billRepository.save(bill);
  }
}
