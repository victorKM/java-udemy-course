package entities;

public class Product {

    // ENCAPSULAMENTO - IMPEDE QUE ACESSA DIRETAMENTE AS VARIAVEIS
    // VARIAVEIS DA CLASSE PODEM SER ACESSADAS SOMENTE PELO METODO
    private String name;
    private double price;
    private int quantity;

    // CONSTRUTOR PADRAO
    public Product(){
    }

    // OUTROS CONSTRUTORES
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // SOBRECARGA, POIS POSSUI MAIS DE UM CONSTRUTOR QUE PODE SER USADO
    public Product(String name, double price){
      this.name = name;
      this.price = price;
    }

    // ENCAPSULAMENTO
    public void setName(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void setPrice(double price) {
      this.price = price;
    }

    public double getPrice() {
      return price;
    }

    public int getQuantity() {
      return quantity;
    }

    // METODOS DA CLASSE
    public double totalValueInStock() {
      return price * quantity;
    }

    public void addProducts(int quantity) {
      this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
      this.quantity -= quantity;
    }

    public String toString() {
      return name
      + ", $ "
      + String.format("%.2f", price)
      + ", "
      + quantity
      + " units, Total: $ "
      + String.format("%.2f", totalValueInStock());
    }
}
