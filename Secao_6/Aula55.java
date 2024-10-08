package Secao_6;

import java.util.Locale;
import java.util.Scanner;

public class Aula55 {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    char resp;
    
    do { 
      System.out.printf("Digite a temperaturea em Celsius: ");
      double C = sc.nextDouble();
      double F = 9.0 * C / 5.0 + 32.0;
      System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
      System.out.printf("Deseja repetir (s/n)? ");
      resp = sc.next().charAt(0);
    } while (resp == 's');

    sc.close();
  }
}
