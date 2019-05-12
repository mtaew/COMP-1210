import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/** 
 * Test cases for CardholdersPart3App.
 *
 * @author Tae Myles
 * @version 12/02/18
 **/
public class CardholdersPart3AppTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** First test for main. **/
   @Test public void mainTest1() {
      CardholdersPart3App app = new CardholdersPart3App();
      String[] args1 = {};
      try {
         CardholdersPart3App.main(args1);
         Assert.assertTrue(Cardholder.INTEREST_RATE == 0.01);
      }
      catch (FileNotFoundException fnfe) {
         System.out.println(fnfe);
      } 
   }
   
   /** Second test for main. **/
   @Test public void mainTest2() {
      CardholdersPart3App app = new CardholdersPart3App();
      String[] args1 = {"cardholder_data_3_exceptions.txt"};
      try {
         CardholdersPart3App.main(args1);
         Assert.assertTrue(Cardholder.INTEREST_RATE == 0.01);
      }
      catch (FileNotFoundException fnfe) {
         System.out.println(fnfe);
      } 
   }
}
