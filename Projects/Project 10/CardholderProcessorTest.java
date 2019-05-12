import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

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
      Assert.assertEquals(null, processor.getCardholdersArray());
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
   
}
