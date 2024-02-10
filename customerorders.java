import java. util. Scanner;

// customer order class
public class CustomerOrders extends Customer{

   private String customerOrder;

    public void setCustomerOrder(String userCustomerOrder){
        this.customerOrder = userCustomerOrder;
    }

    public String getCustomerOrder(){
        return customerOrder;
    }

    public void printCustomerOrder(){
        System.out.println(customerOrder)
    }

}