import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
/** 
 * Tests for CardholderPart2App.
 *
 * @author Tae Myles
 * @version 11/12/18
 **/
public class CardholdersPart2AppTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test without the file. **/
   @Test public void mainTest1() {
      CardholdersPart2App app = new CardholdersPart2App();
      String[] args1 = {};
      try {
         CardholdersPart2App.main(args1);
         Assert.assertTrue(Cardholder.INTEREST_RATE == 0.01);
      }
      catch (FileNotFoundException fnfe) {
         System.out.println(fnfe);
      }  
   }
   
    /** Test with the file. **/
   @Test public void mainTest2() {
      CardholdersPart2App app = new CardholdersPart2App();
      String[] args2 = {"cardholder_data_1.txt"};
      try {
         CardholdersPart2App.main(args2);
         Assert.assertTrue(Cardholder.INTEREST_RATE == 0.01);
      }
      catch (FileNotFoundException fnfe) {
         System.out.println(fnfe);
      }      
   }
}
