import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/** 
 * Test for SapphireCardholder class.
 *
 * @author Tae Myles
 * @version 11/26/18
 **/
public class SapphireCardholderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test for purchasePoints() method. **/
   @Test public void purchasePointsTest() {
      SapphireCardholder pArray = new SapphireCardholder("10001", "Smith, Sam");
      pArray.addPurchases(34.5, 100.0, 63.50, 350.0);
      pArray.setPrevBalance(1200.0);
      pArray.setPayment(200);
      Assert.assertEquals(548, pArray.purchasePoints());
   }
   /** Test for setAcctNumber() method. **/
   @Test public void setAcctNumberTest() {
      SapphireCardholder pArray = new SapphireCardholder("10001", "Smith, Sam");
      pArray.addPurchases(34.5, 100.0, 63.50, 350.0);
      pArray.setPrevBalance(1200.0);
      pArray.setPayment(200);
      pArray.setAcctNumber("10042");
      Assert.assertEquals("10042", pArray.getAcctNumber());
   }
   /** Test for setName() method. **/
   @Test public void setNameTest() {
      SapphireCardholder pArray = new SapphireCardholder("10001", "Smith, Sam");
      pArray.addPurchases(34.5, 100.0, 63.50, 350.0);
      pArray.setPrevBalance(1200.0);
      pArray.setPayment(200);
      pArray.setName("Myles, Tae");
      Assert.assertEquals("Myles, Tae", pArray.getName());
   }
   /** Test for getPurchases() method. **/
   @Test public void getPurchasesTest() {
      SapphireCardholder pArray = new SapphireCardholder("10001", "Smith, Sam");
      pArray.addPurchases(34.5, 100.0, 63.50, 350.0);
      pArray.setPrevBalance(1200.0);
      pArray.setPayment(200);
      double[] a = {34.5, 100.0, 63.50, 350.0};
      Assert.assertArrayEquals(a, pArray.getPurchases(), .00005);
   }
   /** Test for setPurchases() method. **/
   @Test public void setPurchasesTest() {
      SapphireCardholder pArray = new SapphireCardholder("10001", "Smith, Sam");
      pArray.addPurchases(34.5, 100.0, 63.50, 350.0);
      pArray.setPrevBalance(1200.0);
      pArray.setPayment(200);
      double[] a = {25.5, 200.0, 64.50, 450.0};
      pArray.setPurchases(a);
      Assert.assertArrayEquals(a, pArray.getPurchases(), .00005);
   }
   /** Test for payment() method. **/
   @Test public void paymentTest() {
      SapphireCardholder pArray = new SapphireCardholder("10001", "Smith, Sam");
      pArray.addPurchases(34.5, 100.0, 63.50, 350.0);
      pArray.setPrevBalance(1200.0);
      pArray.setPayment(200);
      Assert.assertEquals(560.0, pArray.balance(), .00005);
   }
   /** Test for addPurchases1() method. **/
   @Test public void addPurchasesTest1() {
      SapphireCardholder pArray = new SapphireCardholder("10001", "Smith, Sam");
      pArray.addPurchases(24.5, 52.4, 45.2);
      double[] a = {24.5, 52.4, 45.2};
      Assert.assertArrayEquals(a, pArray.getPurchases(), .00005);
   }
   /** Test for addPurchases2() method. **/
   @Test public void addPurchasesTest2() {
      SapphireCardholder pArray = new SapphireCardholder("10001", "Smith, Sam");
      pArray.addPurchases(24.5, 52.4, 45.2);
      pArray.addPurchases(55.5, 22.4);
      double[] a = {24.5, 52.4, 45.2, 55.5, 22.4};
      Assert.assertArrayEquals(a, pArray.getPurchases(), .00005);
   }
   /** Test for deletePurchases() method. **/
   @Test public void deletePurchasesTest() {
      SapphireCardholder exArray = new 
         SapphireCardholder("10001", "Smith, Sam");
      exArray.addPurchases(24.5, 52.4, 45.2);
      double[] a = {24.5, 52.4, 45.2};
      exArray.deletePurchases(24.5);
      double[] b = {52.4, 45.2};
      Assert.assertArrayEquals(b, exArray.getPurchases(), .00005);
   }

   
}