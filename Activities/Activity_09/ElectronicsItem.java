/** 
 * Electronics items that is a subclass of inventory item.
 *
 * @author Tae Myles
 * @version 11/02/18
 */
public class ElectronicsItem extends InventoryItem {

   protected double weight;
   /** Shipping cost set to static final double. **/
   
   public static final double SHIPPING_COST = 1.5;
   /** 
    * Contructor.
    *
    * @param nameIn set to String
    * @param priceIn set to double
    * @param weightIn set to double
    */
   
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   /**
    * Calculates the cost with tax and shipping cost.
    *
    * @return total cost with shipping and tax.
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}