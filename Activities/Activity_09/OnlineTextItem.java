/** 
 * Electronics items that is a subclass of inventory item.
 *
 * @author Tae Myles
 * @version 11/02/18
 */
 
public abstract class OnlineTextItem extends InventoryItem {
/**
 * Constructor. 
 *
 * @param nameIn set as String
 * @param priceIn set as double
 */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
/**
 * Returns the cost, since there is no tax. 
 *
 * @return price
 */
   public double calculateCost() {
      return price;
   }
}