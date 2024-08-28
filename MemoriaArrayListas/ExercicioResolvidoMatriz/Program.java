import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in) ;

    int n = sc.nextInt();
    Integer[][] matrix = new Integer[n][n];
    int count = 0;

    for(int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = sc.nextInt();
        if(matrix[i][j] < 0) {
          count++;
        }
      }
    }

    System.out.println("Main diagonal: ");
    for(int i = 0; i < matrix.length; i++) {
      System.out.printf(matrix[i][i] + " ");
    }

    System.out.println();
    System.out.println("Negative numbers = " + count);
  }
}