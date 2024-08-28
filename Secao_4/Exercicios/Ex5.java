package Secao_4.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      int cod1, cod2;
      double num1, num2, valor1, valor2, soma;

      cod1 = sc.nextInt();
      num1 = sc.nextDouble();
      valor1 = sc.nextDouble();

      sc.nextLine();

      cod2 = sc.nextInt();
      num2 = sc.nextDouble();
      valor2 = sc.nextDouble();

      soma = (num1*valor1) + (num2*valor2);

      System.out.printf("VALOR A PAGAR: R$ %.2f", soma);
  }
}

