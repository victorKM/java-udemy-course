import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.printf("Quantos elementos vai ter o vetor? ");
    Integer n = sc.nextInt();
    Double[] vect = new Double[n];
    Double sum = 0.0;

    for(int i = 0; i < vect.length; i++) {
      System.out.printf("Digite um numero: ");
      vect[i] = sc.nextDouble(); 
      sum += vect[i];
    }

    System.out.println();
    Double average = sum/(double)n;
    System.out.printf("MEDIA DO VETOR = %.3f", average);
    System.out.println();

    System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
    for(int i = 0; i < vect.length; i++) {
      if(vect[i] < average) {
        System.out.println(vect[i]);
      }
    }

    sc.close();
  }
}