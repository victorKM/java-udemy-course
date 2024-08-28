package Secao_4;

import java.util.Scanner;

public class Aula27 {
  public static void main(String[] args) {
      
    // Ler texto ate quebra de linha
    Scanner sc = new Scanner(System.in);

    int x;
    String s1, s2, s3;

    x = sc.nextInt();
    sc.nextLine(); // Permite que s1, s2 e s3 sejam lidos corretamente, e evitar que s1 leia espaco em branco
    s1 = sc.nextLine();
    s2 = sc.nextLine();
    s3 = sc.nextLine();

    System.out.println("DADOS DIGITADOS:");
    System.out.println(x);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }
}
