package Secao_6.ExFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
   
    int N = sc.nextInt();

    int fat = 1;

    for (int i = 1; i <= N; i++) {
      fat *= i;
    }

    System.out.println(fat);

    sc.close();
  }
}
