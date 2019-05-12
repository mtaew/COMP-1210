import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/** 
 * Test for SapphireCardholder class.
 *
 * @author Tae Myles
 * @version 11/08/18
 **/
public class BlueDiamondCardholderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test for getDiscountRate() method. **/
   @Test public void getDiscountRateTest() {
      BlueDiamondCardholder pArray = new 
         BlueDiamondCardholder("10003", "King, Kelly");
      pArray.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      pArray.setPrevBalance(1200.0);
      
      Assert.assertEquals(2500.0, pArray.getBonusPurchasePoints(),
          .0005);
   }
   /** Test for setBonusPurchasePoints() method. **/
   @Test public void setBonusPurchasePointsTest() {
      BlueDiamondCardholder pArray = new 
         BlueDiamondCardholder("10003", "King, Kelly");
      pArray.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      pArray.setPrevBalance(1200.0);
      pArray.setBonusPurchasePoints(400);
      
      Assert.assertEquals(400, pArray.getBonusPurchasePoints(), .0005);
   }
   /** Test for purchasePoints1() method. **/
   @Test public void purchasePointsTest1() {
      BlueDiamondCardholder pArray = new 
         BlueDiamondCardholder("10003", "King, Kelly");
      pArray.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      pArray.setPrevBalance(1200.0);
      
      Assert.assertEquals(2690.0, pArray.purchasePoints(), .0005);
   }
   /** Test for purchasePoints2() method. **/
   @Test public void purchasePointsTest2() {
      BlueDiamondCardholder pArray = new 
         BlueDiamondCardholder("10003", "King, Kelly");
      pArray.addPurchases(34.5, 10000.0, 63.50, 300.0, 100.0);
      pArray.setPrevBalance(1200.0);
      
      Assert.assertEquals(49740.0, pArray.purchasePoints(), .0005);
   }
   /** Test for toString()1 method. **/
   @Test public void toStringTest1() {
      BlueDiamondCardholder pArray = new 
         BlueDiamondCardholder("10003", "King, Kelly");
      pArray.addPurchases(5000.0, 1000.0, 4000.0);
      pArray.setPrevBalance(1200.0);
      
      String str = "Blue Diamond Cardholder\nAcctNo/Name: 10003 King, Kelly"
         + "\nPrevious Balance: $1,200.00\nPayment: ($0.00)\nInterest: $12.00"
         + "\nNew Purchases: $9,000.00\nCurrent Balance: $10,212.00"
         + "\nMinimum Payment: $306.36\nPurchase Points: 47,500"
         + "\n(includes 10.0% discount rate applied to New Purchases)"
         + "\n(includes 2500 bonus points added to Purchase points)";
      Assert.assertEquals(str, pArray.toString());
   }
   /** Test for toString2() method. **/
   @Test public void toStringTest2() {
      BlueDiamondCardholder pArray = new 
         BlueDiamondCardholder("10003", "King, Kelly");
      pArray.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      pArray.setPrevBalance(1200.0);
      
      String str = "Blue Diamond Cardholder\nAcctNo/Name: 10003 King, Kelly"
         + "\nPrevious Balance: $1,200.00\nPayment: ($0.00)\nInterest: $12.00"
         + "\nNew Purchases: $538.20\nCurrent Balance: $1,750.20"
         + "\nMinimum Payment: $52.51\nPurchase Points: 2,690"
         + "\n(includes 10.0% discount rate applied to New Purchases)";
      Assert.assertEquals(str, pArray.toString());
   }
}
