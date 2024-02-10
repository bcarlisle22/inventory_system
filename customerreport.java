
public class CustomerReport extends Customer{

    private String customerName;
    private String iventoryItems;


    public void setCustomerName(String userCustomerName){
      this.customerName = userCustomer;
    }
    public String getCustomerName(){
        return customerName;
    }

    public void setInventoryItems(String userIventoryItems){
        this.iventoryItems = userIventoryItems;
    }

     public String getInventoryItems(){
        return iventoryItems;
    }
    public void printCustomerReport(){
        System.out.println("Customer Report");
        System.out.println("Customer name: " + customerName);
        System.out.println("Customer order:  " + iventoryItems);
    }


    
    


}