package services;

import entities.Contract;
import entities.Installment;

public class ContractService {
  
  private OnlinePaymentService onlinePaymentService;

  public ContractService(OnlinePaymentService onlinePaymentService) {
    this.onlinePaymentService = onlinePaymentService;
  }

  public void processContract(Contract contract, int months) {
    double amount = contract.getTotalValue()/months;
    for (int i = 1; i <= months; i++) {
      double interest = onlinePaymentService.interest(amount, i);
      double paymentFee = onlinePaymentService.paymentFee(amount+interest); 
      contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), interest+paymentFee+amount));
    }
  }

}
