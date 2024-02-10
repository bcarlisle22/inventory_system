
//CUSTOMER CLASS

// class Customer{  
//     int custID;  
//     String customerName;  

// public void addCustomerName(String customer){ 
//      // code to add customer name  
//      customerName=customer;  
//     }  

// public void deleteCustomerName(int customerID){  
//          //code to delete customer name  
//     }

// public void modifyCustomerName(String customer){  
//     //code to modify customer name.  
//     }  

// public String getCustomerName(){  
//     return customerName;  //code to get customer name  
//     }  
    
// public Integer getCustID(){  
//     return custID;  
//     }  
        
// }  

//INVENTORY CLASS 

// class InventoryItems{  
//     int itemID;  
//     int itemName;  
            
//     public void addInventoryItem(String inventoryItem){  
//         // code to add inventory item  
//         itemName=inventoryItem;  
//         }  
    
//     public void delete InventoryItem(int itemID){  
//         //code to delete inventoryItem  
//         }  
//     public void modifyInventoryItem(String itemName){  
//         //code to modify inventory item.  
//         }  //create customer order class  
// }
        
//CUSTOMER ORDER CLASS

class CustomerOrder extends Customer{  
    private int itemSize;  
    private String orderHeader;  
    private Customer customer;  

    printAllCustomerOrder();  
    
public Integer getItemSize(){  
    return itemSize;  
    } 

public void setItemSize(int itemSize){  
    this.itemSize=itemSize;  
    }  

public void setOrderHeader(String orderHeader){  
    this.orderHeader=orderHeader;  
    }  

public String getOrderHeader(){  
    return orderHeader;  
    }  
    
public void setCustomer(Customer customer){  
    this.customer=customer;  
    }  
    
public Customer getCustomer(){  
    return customer;  
    }  
}  

class DistributorApplication {  
    public static void main(String[] args){  
        //code to enter customer order along with customer details  
        Customer c1=new Customer();  
        c1.custID=12;  
        c1.addCustomerName("ravi");  
        CustomerOrder co=new CustomerOrder();  
        co.setItemSize(10);  
        co.setOrderHeader("header1");  
        co.setCustomer(c1);  
        List<CustomerOrder> orderList=new ArrayList<CustomerOrder>(); 
        
         // list to add individual customer orders 
        
        orderList.add(co);  
        
        //code to print individual customer order  
        
        System.out.println(co.getCustomer().getCustID);  
        
        System.out.println(co.getCustomer().getCustomerName());  
        
        System.out.println(co.getItemSize());  
        
        System.out.println(co.getOrderHeader());  
        }  //code to print inventory report  
        
        InventoryItems inventoryItems=new InventoryItems();  
        inventoryItems.addInventoryName("brick");  
        inventoryItems.itemID=1;  
        List<InventoryItems> itemList=new InventoryItems();  
        itemList.add( inventoryItems);  
        
        //for each loop to print all inventory items  
        //code to print all customer orders  
}  
