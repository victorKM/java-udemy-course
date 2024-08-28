package Secao_5.Exercicios;

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);

      int A = sc.nextInt();
      int B = sc.nextInt();

      if (A%B == 0 || B%A == 0) {
        System.out.println("Sao Multiplos");
      } else {
        System.err.println("Nao sao Multiplos");
      }

      sc.close();
  }
}
