package Secao_6.ExFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
   
    int N = sc.nextInt();

    for (int i = 1; i <= N; i++) {
      if (N%i == 0) {
        System.out.println(i);
      }
    }

    sc.close();
  }
}
