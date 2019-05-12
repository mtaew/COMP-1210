import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/** 
 * Test for DiamondCardholder class.
 *
 * @author Tae Myles
 * @version 11/26/18
 **/
public class DiamondCardholderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test for getDiscountRate() method. **/
   @Test public void getDiscountRateTest() {
      DiamondCardholder pArray = new DiamondCardholder("10001", "Smith, Sam");
      pArray.addPurchases(34.5, 100.0, 63.50, 350.0);
      pArray.setPrevBalance(1200.0);
      pArray.setPayment(200);
      Assert.assertEquals(.05, pArray.getDiscountRate(), .0005);
   }
   
      /** Test for setDiscountRate() method. **/
   @Test public void setDiscountRateTest() {
      DiamondCardholder pArray = new DiamondCardholder("10001", "Smith, Sam");
      pArray.addPurchases(34.5, 100.0, 63.50, 350.0);
      pArray.setPrevBalance(1200.0);
      pArray.setPayment(200);
      pArray.setDiscountRate(.015);
      Assert.assertEquals(.015, pArray.getDiscountRate(), .0005);
   }
   
      /** Test for getDiscountRate() method. **/
   @Test public void purchasePointsTest() {
      DiamondCardholder pArray = new DiamondCardholder("10001", "Smith, Sam");
      pArray.addPurchases(34.5, 100.0, 63.50, 350.0);
      pArray.setPrevBalance(1200.0);
      pArray.setPayment(200);
      Assert.assertEquals(1560, pArray.purchasePoints(), .0005);
   }
   /** Test for totalPurchases() method. **/
   @Test public void totalPurchasesTest() {
      DiamondCardholder pArray = new DiamondCardholder("10001", "Smith, Sam");
      pArray.addPurchases(34.5, 100.0, 63.50, 350.0);
      pArray.setPrevBalance(1200.0);
      pArray.setPayment(200);
      Assert.assertEquals(520.6, pArray.totalPurchases(), .00005);
   }
   /** Test for toString() method. **/
   @Test public void toStringTest() {
      DiamondCardholder pArray = new DiamondCardholder("10002", "Jones, Pat");
      pArray.addPurchases(34.5, 100.0, 63.50, 300.0);
      pArray.setPrevBalance(1200.0);
      
      String str = "Diamond Cardholder\nAcctNo/Name: 10002 Jones, Pat"
               + "\nPrevious Balance: $1,200.00\nPayment: ($0.00)"
               + "\nInterest: $12.00\nNew Purchases: $473.10"
               + "\nCurrent Balance: $1,685.10"
               + "\nMinimum Payment: $50.55\nPurchase Points: 1,419"
               + "\n(includes 5.0% discount rate applied to New Purchases)";
      Assert.assertEquals(str, pArray.toString());
   }
}
