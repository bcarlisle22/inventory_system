import java. util. Scanner;


// inventory class

public class Inventory{
   protected String itemName;
   protected Double itemPrice;
   protected Boolean itemAvailability;
   protected Integer itemID;


    // creates inventory report

    public void setItemName(String userItemName){
        itemName = userItemName;
    }
    public void getItemName(){
        return itemName;
    }

    public void setItemPrice(Double userItemPrice){
        itemPrice = userItemPrice;
    }

    public Double getItemPrice(){
        return itemPrice;
    }

    public void setItemAvailability(Boolean userItemAvailability){
        itemAvailability = userItemAvailability;
    }
    public Boolean getItemAvailability(){
        return itemAvailability;
    }


    // prints inventory report 

    public void printInventoryReport(){
        System.out.println("Inventory Report");
        System.out.println("Item: " + itemName);
        System.out.println("Item price: " + itemPrice);
        System.out.println("Availability: " + itemAvailability);
    }

}

