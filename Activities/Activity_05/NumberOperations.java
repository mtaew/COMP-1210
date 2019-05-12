/** 
 * This class will hold an integer value and 
 * provide methods to perform arious operations on that value. 
 *
 * @author Tae Myles
 * @version 09/30/18
 */
public class NumberOperations {
   private int number;

   /**
    * The constructor takes an int parameter called numberIn.
    *
    * @param numberIn takes int.
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   /**
    * Get value is set to int.
    *
    * @return returns number.
    */
   public int getValue()
   {
      return number;
   }
   /**
    * Checks to see if i is smaller than number.
    *
    * @return returns output.
    */
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /**
    * checks if output is bigger than number.
    *
    * @return returns output.
    */
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   /**
    * Takes isGreater to series of tests.
    *
    * @param compareNumber takes int.
    * @return returns values.
    */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
    * Total calculations with string.
    *
    * @return returns number with string.
    */
   public String toString()
   {
      return number + "";
   }

}