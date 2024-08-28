import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.printf("Quantos numeros voce vai digitar? ");
    Integer n = sc.nextInt();
    Double[] vect = new Double[n];
    Double sum = 0.0;
    Double average = 0.0;

    for (int i = 0; i < vect.length; i++) {
      System.out.printf("Digite um numero: ");
      vect[i] = sc.nextDouble();
      sum += vect[i];
    }

    average = sum/(double)vect.length;

    System.out.printf("VALORES = ");
    for (int i = 0; i < vect.length; i++) {
      System.out.printf("%.2f  ", vect[i]);
    }
    System.out.println();
    System.out.printf("SOMA = %.2f\n", sum);
    System.out.printf("MEDIA = %.2f\n", average);


    sc.close();
  }
}