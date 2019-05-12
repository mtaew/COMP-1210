/** 
 * ItemList class will hold an array of InventoryItem objects
 * (which includes objects of subclasses of InventoryItem).
 *
 * @author Tae Myles
 * @version 11/12/18
 */
public class ItemsList {

   private InventoryItem[] inventory;
   private int count;
   
/** Constructor. **/
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
/**
 * Adds item into inventory.
 *
 * @param itemIn takes InventoryItem
 **/  
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
/**
 * Calculates the total.
 *
 * @param electronicsSurcharge takes double
 * @return total
 **/ 
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
/**
 * Prints list of inventory items.
 *
 * @return output
 **/ 
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      
      return output;
   }
}