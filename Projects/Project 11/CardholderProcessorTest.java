import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/** 
 * Tests for CardholderProcessor class.
 *
 * @author Tae Myles
 * @version 11/26/18
 **/

public class CardholderProcessorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** getCardholdersArray() Test. **/
   @Test public void getCardholdersArrayTest() {
      CardholderProcessor processor = new CardholderProcessor();
      Assert.assertEquals(new Cardholder[0], processor.getCardholdersArray());
   }
   
   /** getInvalidRecordsArray() Test. **/
   @Test public void getInvalidRecordsArrayTest() {
      CardholderProcessor processor = new CardholderProcessor();
      String[] string = new String[0];
      Assert.assertEquals(string, processor.getInvalidRecordsArray());
   }
   
   /** addInvalidRecordsArray() Test. **/
   @Test public void addInvalidRecordTest() {
      CardholderProcessor processor = new CardholderProcessor();
      String[] string = new String[1];
      processor.addInvalidRecord(null);
      Assert.assertEquals(string, processor.getInvalidRecordsArray());
   }
   /** 
    * readCardholderFile() Test. 
    *
    * @throws IOException error.
    **/
   @Test public void readCardholderFileTest() throws IOException {
      CardholderProcessor processor = new CardholderProcessor();
      processor.readCardholderFile("cardholder_data_3_exceptions.txt");
      Cardholder holder1 = new DiamondCardholder("10002", "Jones, Pat");
      processor.addCardholder(holder1);
      Assert.assertEquals(holder1.getName(), 
         processor.getCardholdersArray()[0].getName());
   }
   /** compator() Test1. **/
   @Test public void currentBalanceComparatorTest1() {
      CardholderProcessor processor = new CardholderProcessor();
      
      Cardholder holder1 = new SapphireCardholder("10002", "Jones, Pat");
      holder1.setPrevBalance(9900000.00);
      holder1.setPayment(1000.00);
      holder1.addPurchases(5);
      processor.addCardholder(holder1);
      Cardholder holder2 = new SapphireCardholder("10004", "Sentis, Mane");
      holder2.setPrevBalance(500);
      holder2.setPayment(500.00);
      holder2.addPurchases(5);
      processor.addCardholder(holder2);
      CurrentBalanceComparator comparator = new CurrentBalanceComparator();
      int a = comparator.compare(holder1, holder2);
      Assert.assertEquals(-1, a); 
   }

   /** compator() Test2. **/
   @Test public void currentBalanceComparatorTest2() {
      CardholderProcessor processor = new CardholderProcessor();
      
      Cardholder holder1 = new SapphireCardholder("10002", "Jones, Pat");
      holder1.setPrevBalance(500.00);
      holder1.setPayment(1000.00);
      holder1.addPurchases(5);
      processor.addCardholder(holder1);
      Cardholder holder2 = new SapphireCardholder("10004", "Sentis, Mane");
      holder2.setPrevBalance(500);
      holder2.setPayment(1000.00);
      holder2.addPurchases(5);
      processor.addCardholder(holder2);
      CurrentBalanceComparator comparator = new CurrentBalanceComparator();
      int a = comparator.compare(holder1, holder2);
      Assert.assertEquals(0, a); 
   }
    
   /** compator() Test3. **/
   @Test public void currentBalanceComparatorTest3() {
      CardholderProcessor processor = new CardholderProcessor();
      
      Cardholder holder1 = new SapphireCardholder("10002", "Jones, Pat");
      holder1.setPrevBalance(5044.00);
      holder1.setPayment(1000000.00);
      holder1.addPurchases(5);
      processor.addCardholder(holder1);
      Cardholder holder2 = new SapphireCardholder("10004", "Sentis, Mane");
      holder2.setPrevBalance(100);
      holder2.setPayment(102.00);
      holder2.addPurchases(5);
      processor.addCardholder(holder2);
      CurrentBalanceComparator comparator = new CurrentBalanceComparator();
      int a = comparator.compare(holder1, holder2);
      Assert.assertEquals(1, a); 
   }
}