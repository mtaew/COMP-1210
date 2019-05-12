/** 
 * InventoryItem class that represents an inventory item in a store.
 *
 * @author Tae Myles
 * @version 11/02/18
 */

public class InventoryItem {

   /** Instance variable. **/
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
    * Constructor.
    *
    * @param nameIn as string.
    * @param priceIn as double.
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
    * Returns name of the item.
    * 
    * @return name
    */
   public String getName() {
      return name;
   }
   /**
    * Calculates the cost with the tax.
    * 
    * @return total price
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   /**
    * Sets the tax rate.
    * 
    * @param taxRateIn double.
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   /**
    * toString, includes name and the cost.
    * 
    * @return string
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
}