import java.text.DecimalFormat;
/** 
 * BlueDiamondCardholder class is derived from the DiamondCardholder class.
 * An Object of this class will receive five purchase points per dollar
 * spent as well as a 10% discount on the subtotal.  Also, if the new
 * purchases exceed $2,500.00, a bonus of 2,500 purchasepoints is earned.  
 *
 * @author Tae Myles
 * @version 11/26/18
 **/
public class BlueDiamondCardholder extends DiamondCardholder {

   private int bonusPurchasePoints = 2500;
/** 
 * Constructor.
 *
 * @param acctNumberIn takes String
 * @param nameIn takes String
 **/
   BlueDiamondCardholder(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Blue Diamond Cardholder";
      discountRate = 0.10;
   }
/** 
 * Gets bonus purchase points.
 *
 * @return bonus purchase points
 **/
   public int getBonusPurchasePoints() {
      return bonusPurchasePoints;
   }
/** 
 * Sets bonus purchase points.
 *
 * @param bonusPurchasePointsIn takes int
 **/
   public void setBonusPurchasePoints(int bonusPurchasePointsIn) {
      bonusPurchasePoints = bonusPurchasePointsIn;
   }
/** 
 * Overrided purchase points. If totalPurchases() is bigger it adds
 * bonus purchase point.
 *
 * @return purchase points
 **/
   public int purchasePoints() {
      if (super.totalPurchases() > 2500.00) {
         return (int) totalPurchases() * 5 + getBonusPurchasePoints();
      }
      return (int) totalPurchases() * 5;
   }
/** 
 * toString with customers information.
 *
 * @return blueDiamond
 **/
   public String toString() {
      DecimalFormat f2 = new DecimalFormat("#,##0");
      String blueDiamond = super.toString();
      if (super.totalPurchases() > 2500.00) {
         blueDiamond += "\n(includes " + f2.format(getBonusPurchasePoints())
            + " bonus points added to Purchase Points)";
      }
      return blueDiamond;
   }
}
