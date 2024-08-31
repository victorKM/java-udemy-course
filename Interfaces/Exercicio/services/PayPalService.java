package services;

public class PayPalService implements OnlinePaymentService{
  
  public Double paymentFee(Double amount) {
    return amount*0.02;
  }

  public Double interest(Double amount, Integer months) {
    return (double)amount*0.01*months;
  }
}
