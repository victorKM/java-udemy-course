package Secao_4;

import java.util.Locale;
import java.util.Scanner;

public class Aula26 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //Ler string
    String x;
    x = sc.next();
    System.out.println(x);

    // Ler int
    int y;
    y = sc.nextInt();
    System.out.println(y);
    
    // Ler double
    double z;
    z = sc.nextDouble();
    System.out.println(z);

    // Ler caractere
    char w;
    w = sc.next().charAt(0);
    System.out.println(w);

    // Ler varios dados na mesma linha
    x = sc.next();
    y = sc.nextInt();
    z = sc.nextDouble();
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

    sc.close();
  }
}
