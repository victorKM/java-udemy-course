package IntroducaoPOO.exemplo2.entities;

public class Product {
  
    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock() {
      return price*quantity;
    }

    public void addProducts(int quantity) {
      this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
      this.quantity -= quantity;
    }

    public String toString() {
      String str = name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", TotalValueInStock());
      return str;
    }
}
