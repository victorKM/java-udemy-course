import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.printf("Quantos elmentos vai ter o vetor? ");
    Integer n = sc.nextInt();
    Integer[] vect = new Integer[n];
    Integer numEven = 0;
    Integer sum = 0;

    for(int i = 0; i < n; i++) {
      System.out.printf("Digite um numero: ");
      vect[i] = sc.nextInt();
      if(vect[i]%2 == 0) {
        numEven += vect[i];
        sum++;
      }
    }

    if(sum == 0) {
      System.out.println("NENHUM NUMERO PAR");
    } else {
      System.out.printf("MEDIA DOS PARES = %.2f", (double)numEven/(double)sum);
    }

    sc.close();
  }
}
