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

    System.out.println("NUMEROS NEGATIVOS:");

    for(int i = 0; i < vect.length; i++) {
      if(vect[i] < 0) {
        System.out.println(vect[i]);
      }
    }

    sc.close();
  }
}