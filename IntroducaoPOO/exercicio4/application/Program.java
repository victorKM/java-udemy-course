package IntroducaoPOO.exercicio4.application;

import IntroducaoPOO.exercicio4.util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      System.out.printf("What is the dollar price? ");
      double dollarPrice = sc.nextDouble();
      System.out.printf("How many dollars will be bought? ");
      double dollarQuantity = sc.nextDouble();
      System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.amount(dollarPrice, dollarQuantity));
  }
}
