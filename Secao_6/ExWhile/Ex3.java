package Secao_6.ExWhile;

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;

    int num = sc.nextInt();

    while (num != 4) { 
        if (num == 1) {
          alcool++;
        } else if (num == 2) {
          gasolina++;
        } else if (num == 3) {
          diesel++;
        }
        num = sc.nextInt();
    }

    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: " + alcool);
    System.out.println("Gasolina: " + gasolina);
    System.out.println("Diesel: " + diesel);

    sc.close();
  }
}


