package Secao_6;

import java.util.Scanner;

public class Aula45 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int num;

    num = sc.nextInt();

    while (num != 0) { 
        sum += num;
        num = sc.nextInt();
    }

    System.out.println(sum);

    sc.close();
  }
}
