package Secao_5.Exercicios;

import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);

      int num = sc.nextInt();

      if (num < 0) {
        System.out.println("NEGATIVO");
      } else {
        System.err.println("NAO NEGATIVO");
      }

      sc.close();
  }
}
