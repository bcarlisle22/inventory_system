import java. util. Scanner;
import java.util. ArrayList;

public class InventoryItems extends Inventory{

    public static void main(String[] args){
      ArrayList <String> iventoryItems = new ArrayList <String> ();
      iventoryItems.add(itemName);
      iventoryItems.add(itemPrice);
      iventoryItems.add(itemAvailability);
      iventoryItems.add(itemID);

      System.out.println(iventoryItems);
   }

    public void deleteIventoryItem(String iventoryItems){
      System.out.println("Iventory Item: ");
      String deleteIventoryItem = scanner.nextLine();
      scanner.nextLine()
      this.customer.remove(deleteIventoryItem);
      
   }
}