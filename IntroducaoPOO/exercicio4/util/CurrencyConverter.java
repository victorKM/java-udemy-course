package IntroducaoPOO.exercicio4.util;

public class CurrencyConverter {
  public static double IOF = 0.06;

  public static double amount(double dollarPrice, double quantity) {
    return 1.06*(dollarPrice*quantity);
  }
}
