import java.text.DecimalFormat;
/** 
 * DiamondCardholder class is derived from the Cardholder class.
 * An Object of this class will receive three purchase points per dollar spent
 * as well as a 5% discount on the subtotal.
 *
 * @author Tae Myles
 * @version 11/26/18
 **/
public class DiamondCardholder extends Cardholder {

   protected double discountRate = .05;
/** 
 * Constructor.
 *
 * @param acctNumberIn takes String
 * @param nameIn takes String
 **/
   DiamondCardholder(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Diamond Cardholder";
   }
/** 
 * Gets discount rate.
 *
 * @return discount rate
 **/
   public double getDiscountRate() {
      return discountRate;
   }
/** 
 * Sets discount rate.
 *
 * @param discountRateIn takes double
 **/
   public void setDiscountRate(double discountRateIn) {
      discountRate = discountRateIn;
   }
/** 
 * Overrided purchase points. Multiplied by 3.
 *
 * @return purchase points.
 **/
   public int purchasePoints() {
      return (int) totalPurchases() * 3;
   }
/** 
 * Overrided total purchases. Calculates with discount rate. 
 *
 * @return total purchases
 **/
   public double totalPurchases() {
      return super.totalPurchases() - (super.totalPurchases() 
         * getDiscountRate());
   }
/** 
 * toString with customers information.
 *
 * @return diamond
 **/
   public String toString() {
      DecimalFormat f3 = new DecimalFormat("0.0%");
      String diamond = super.toString();
      diamond += "\n(includes " + f3.format(getDiscountRate()) 
         + " discount rate" + " applied to New Purchases)";
      return diamond;
   }
}
