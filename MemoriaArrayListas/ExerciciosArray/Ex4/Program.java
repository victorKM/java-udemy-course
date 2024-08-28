import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.printf("Quantos numeros voce vai digitar? ");
    Integer n = sc.nextInt();

    Integer[] vect = new Integer[n];

    for(int i = 0; i < vect.length; i++) {
      System.out.printf("Digite um numero: ");
      vect[i] = sc.nextInt();
    }

    Integer count = 0;

    System.out.println("\nNUMEROS PARES:");
    for(int i = 0; i < vect.length; i++) {
      if(vect[i] % 2 == 0) {
        count++;
        System.out.printf("%d  ", vect[i]);
      }
    }

    System.out.printf("\n\nQUANTIDADE DE PARES = %d", count);

    sc.close();
  }
}