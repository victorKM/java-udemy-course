package application;

import entities.Contract;
import entities.Installment;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import services.ContractService;
import services.PayPalService;

public class Program {
  public static void main(String[] args) {
      
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println("Entre os dados do contrato");
    System.out.printf("Numero: ");
    int number = sc.nextInt();
    System.out.printf("Data (dd/MM/yyyy): ");
    LocalDate date = LocalDate.parse(sc.next(), fmt);
    System.out.printf("Valor do contrato: ");
    double totalValue = sc.nextDouble();
    System.out.printf("Entre com o numero de parcelas: ");
    int months = sc.nextInt();

    Contract obj = new Contract(number, date, totalValue);

    ContractService service = new ContractService(new PayPalService());

    service.processContract(obj, months);

    System.out.println("Parcelas: ");
    for (Installment i : obj.getInstallments()) {
      System.out.println(i);
    }

    sc.close();
  }
}
