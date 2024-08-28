package Secao_6.ExFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
   
    int N = sc.nextInt();
    
    double num1, num2;

    for (int i = 0; i < N; i++) {
      num1 = sc.nextInt();
      num2 = sc.nextInt();

      if (num2 == 0) {
        System.out.println("divisao impossivel");
      } else {
        System.out.printf("%.1f\n", num1/num2);
      }
    }

    sc.close();
  }
}
