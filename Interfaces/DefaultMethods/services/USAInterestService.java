package services;

public class USAInterestService implements InterestService{

  private Double interestRate;

  public USAInterestService(){
  }

  public USAInterestService(Double interestRate) {
    this.interestRate = interestRate;
  }

  @Override
  public Double getInterestRate() {
    return interestRate;
  }
}