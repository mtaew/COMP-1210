/**
 * Scores that will hold an array of numerical values and provide methods
 * that allow users to interact with the Scores class.
 *
 * @author Tae Myles
 * @version 10/14/18
 */
public class Scores {
   // instance variable
   private int[] numbers;
   
   /**
    * Constructor.
    *
    * @param numbersIn takes int
    */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   /**
    * Methods.
    *
    * No parameter, returns an array of int.
    *
    * @return evens even numbers
    */
   public int[] findEvens() {
      int numberEvens = 0;
     
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int [numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   /**
    * No parameter, returns an array of int.
    *
    * @return odds odd numbers
    */
   public int[] findOdds() {
      int numberOdds = 0;
     
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      
      int[] odds = new int [numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   /**
    * No parameters; returns a double.
    *
    * @return sum / numbers.length
    */
   public double calculateAverage() {
      double sum = 0;
      for (int i = 0; i < numbers.length; i++) {
         sum = sum + numbers[i];
      }
      return sum / numbers.length;
   }
   /**
    * No parameters; returns a String containing all scores.
    *
    * @return result 
    */
   public String toString() {
   
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   /**
    * No parameters; returns a String containing all scores in reverse order.
    *
    * @return result 
    */
   public String toStringInReverse() {
   
      String result = "";
      
      for (int i = numbers.length - 1; 0 <= i; i--) {
         result += numbers[i] + "\t";
      }
      return result;
    
   }
}