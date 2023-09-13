package Entities;

public class Product {

   public String name;
   public double price;
   public int quantity;
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public int getQuantity() {
      return quantity;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }



   public double totalValueInStock(){
      return price*quantity;
   }
   public void addProduct(int quantity){
      this.quantity += quantity;

   }
   public void removeProduct(int quantity){
      this.quantity -= quantity;

   }

   public String toString(){
      return name + " , $ " + price + " , " + quantity + " units , Total: $ " + totalValueInStock();

   }


}
