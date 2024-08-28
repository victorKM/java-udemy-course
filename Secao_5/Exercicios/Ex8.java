package Secao_5.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      double valor = sc.nextDouble();
      double imposto;

      if(valor >= 0.00 && valor < 2000.00) {
        System.out.println("Isento");
      } else if (valor > 2000.00 && valor < 3000.00) {
          imposto = (valor-2000)*0.08;
          System.out.printf("R$ %.2f", imposto);
      } else if (valor > 3000.00 && valor < 4500.00) {
          imposto = (valor-3000)*0.18 + (1000)*0.08;
          System.out.printf("R$ %.2f", imposto);
      } else if (valor > 4500.00) {
          imposto = (1000)*0.08 + (1500)*0.18 + (valor-4500)*0.28;
          System.out.printf("R$ %.2f", imposto);
      } else {
        System.out.println("Valor negativo!");
      }

      sc.close();
  }
}

