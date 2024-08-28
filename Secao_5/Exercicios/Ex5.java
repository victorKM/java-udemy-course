package Secao_5.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      int cod = sc.nextInt();
      double quant = sc.nextInt();

      if(cod == 1) {
        System.err.printf("Total: R$ %.2f", 4*quant);
      } 
      else if (cod == 2) {
        System.err.printf("Total: R$ %.2f", 4.5*quant);
      }
      else if (cod == 3) {
        System.err.printf("Total: R$ %.2f", 5*quant);
      }
      else if (cod == 4) {
        System.err.printf("Total: R$ %.2f", 2*quant);
      }
      else if (cod == 5) {
        System.err.printf("Total: R$ ", 1.5*quant);
      }

      sc.close();
  }
}

