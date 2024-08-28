import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    int lines = sc.nextInt();
    int columns = sc.nextInt();
    Integer[][] matrix = new Integer[lines][columns];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    int number = sc.nextInt();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if(matrix[i][j] == number){
          System.out.println("Position " + i + "," + j + ":");
          if(j > 0) {
            System.out.println("Left: " + matrix[i][j-1]);
          }

          if(j < matrix[i].length-1) {
            System.out.println("Right: " + matrix[i][j+1]);
          }

          if(i > 0) {
            System.out.println("Up: " + matrix[i-1][j]);
          }

          if(i < matrix.length) {
            System.out.println("Down: " + matrix[i+1][j]);
          }
        }
      }
    }

  }
}