package Secao_6;

import java.util.Scanner;

public class Aula50 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int num;
    int sum = 0;

    for (int i = 0; i < N; i++) {
      num = sc.nextInt();
      sum += num;
    }

    System.out.println(sum);

    sc.close();
  }
}
