package Secao_6.ExFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
   
    int N = sc.nextInt();
    double num1, num2, num3;

    for (int i = 0; i<N; i++) {
      num1 = sc.nextDouble();
      num2 = sc.nextDouble();
      num3 = sc.nextDouble();

      System.out.printf("%.1f\n", (num1*2+num2*3+num3*5)/10);
    }

    sc.close();
  }
}
