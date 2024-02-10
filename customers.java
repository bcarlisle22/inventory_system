import java. util. Scanner;
import java.util. ArrayList;

// Customer class
public class Customers{
   protected String customerName;
   protected Boolean openOrders;
   protected Integer numOrders;

   public static void main(String[] args){
      ArrayList <String> customers = new ArrayList <String> ();
      customers.add(customerName);
      customers.add(openOrders);
      customers.add(numOrders);
      System.out.println(customers);
   }

   public void setCustomerName(String userCustomer){
      customerName = userCustomer;
   }

   public String getCustomerName(){
      return customerName;
   }

   public void deleteCustomerName(String customer){
      System.out.println("Customer name: ");
      String deleteName = scanner.nextLine();
      scanner.nextLine()
      this.customer.remove(deleteName);
   }

   public void setOpenOrders(Boolean userOpenOrders){
      openOrders = userOpenOrders;
   }

   public Boolean getOpenOrders(){
      return openOrders;
   }

   public void setNumOrders(Integer userNumOrders){
      numOrders = userNumOrders;
   }

   public Integer getNumOrders(){
      return numOrders;
   }
   // print customer's information
   public void printCustomerInfo(){
      System.out.println("Customer Information");
      System.out.println("Customer name: " + customerName);
      System.out.println("Open orders: " + openOrders);
      System.out.println("Number of orders: " + numOrders);
      }
}