package services;

import java.security.InvalidParameterException;

public interface InterestService {
  
  Double getInterestRate();

  default Double payment(Double amount, int months) {
    if (months < 1) {
      throw new InvalidParameterException("Months must be greater than zero");
    }

    double value = 1.0+ getInterestRate()/100.00;
    double payment = amount * Math.pow(value, months);
    return payment;
  }

}
