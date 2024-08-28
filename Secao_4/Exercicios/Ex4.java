package Secao_4.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      int number;
      double horas, valor;

      number = sc.nextInt();
      horas = sc.nextDouble();
      valor = sc.nextDouble();

      System.out.println("NUMBER = " + number);
      System.out.printf("SALARY = U$ %.2f", horas*valor);
  }
}

