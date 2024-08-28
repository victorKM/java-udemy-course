package Secao_4.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      double r, pi;

      pi = 3.14159;
      r = sc.nextDouble();

      double area = pi*Math.pow(r,2);

      System.out.printf("A=%.4f", area);
  }
}

