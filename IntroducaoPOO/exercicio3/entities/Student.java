package IntroducaoPOO.exercicio3.entities;

public class Student {
  public String name;
  public double nota1;
  public double nota2;
  public double nota3;

  public double grade() {
    return nota1+nota2+nota3;
  }

  public void pass() {
    if (grade() >= 60.00) {
      System.out.println("PASS");
    } else {
      System.out.println("FAILED");
      System.out.printf("MISSING %.2f POINTS", 60.00-grade());
    }
  }
}
