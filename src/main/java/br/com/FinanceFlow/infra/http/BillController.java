package br.com.FinanceFlow.infra.http;

import br.com.FinanceFlow.application.dto.CreateBillInput;
import br.com.FinanceFlow.application.dto.ListBillsOutput;
import br.com.FinanceFlow.application.dto.RemoveBillInput;
import br.com.FinanceFlow.application.dto.UpdateBillInput;
import br.com.FinanceFlow.application.usecase.CreateBill;
import br.com.FinanceFlow.application.usecase.ListBills;
import br.com.FinanceFlow.application.usecase.RemoveBill;
import br.com.FinanceFlow.application.usecase.UpdateBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillController {
  private final CreateBill createBill;
  private final ListBills listBills;
  private final RemoveBill removeBill;
  private final UpdateBill updateBill;

  @Autowired
  public BillController(CreateBill createBill, ListBills listBills, RemoveBill removeBill, UpdateBill updateBill) {
    this.createBill = createBill;
    this.listBills = listBills;
    this.removeBill = removeBill;
    this.updateBill = updateBill;
  }

  @PostMapping
  public ResponseEntity<Void> createBill(@RequestBody CreateBillInput input) {
    this.createBill.execute(input);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @GetMapping
  public ResponseEntity<List<ListBillsOutput>> listBills() {
    List<ListBillsOutput> output = this.listBills.execute();
    return ResponseEntity.ok(output);
  }

  @DeleteMapping("/{billId}")
  public ResponseEntity<Void> removeBill(@PathVariable("billId") RemoveBillInput input) {
    this.removeBill.execute(input);
    return ResponseEntity.noContent().build();
  }

  @PutMapping
  public ResponseEntity<Void> updateBill(@RequestBody UpdateBillInput input) {
    this.updateBill.execute(input);
    return ResponseEntity.noContent().build();
  }
}
