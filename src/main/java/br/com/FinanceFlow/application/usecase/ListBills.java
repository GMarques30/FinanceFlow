package br.com.FinanceFlow.application.usecase;

import br.com.FinanceFlow.application.dto.ListBillsOutput;
import br.com.FinanceFlow.application.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListBills {
  private final BillRepository billRepository;

  @Autowired
  public ListBills(BillRepository billRepository) {
    this.billRepository = billRepository;
  }

  public List<ListBillsOutput> execute() {
    return this.billRepository.findAll().stream().map((bill) -> new ListBillsOutput(bill.getBillId(), bill.getAmount(), bill.getDescription(), bill.getCategory(), bill.getCreatedAt(), bill.getOccurredAt())).toList();
  }
}
