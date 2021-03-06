import java.text.DecimalFormat;

/** 
 * The SapphireCardholder class is derived from the Cardholder class.
 * Objects of this class will receive one purchase point per dollar spent.  
 *
 * @author Tae Myles
 * @version 11/26/18
 **/
public class SapphireCardholder extends Cardholder {
/** 
 * Constructor.
 *
 * @param acctNumberIn takes String
 * @param nameIn takes String
 **/
   public SapphireCardholder(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Sapphire Cardholder";
   }
/** 
 * Overrided purchase points.
 *
 * @return bonus points
 **/
   public int purchasePoints() {
      return (int) totalPurchases();
   }
/** 
 * toString method.
 *
 * @return sapphire
 **/
   public String toString() {
      DecimalFormat f3 = new DecimalFormat("0.0%");
      String sapphire = super.toString() + "\n\n";
   
      return sapphire;
         
      
   }
}
