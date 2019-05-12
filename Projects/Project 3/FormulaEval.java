import java.util.Scanner;
import java.text.DecimalFormat;

   /** 
    * Computes the value generated by a specified expression.
    *
    * @author Tae Myles
    * @version 09/12/18
    */
    
public class FormulaEval {

  /**
   * Evaluates formula and gives value.
   *
   * @param args Command line arguments (not used).
   */
   
   public static void main(String[]args) {
      Scanner userInput = new Scanner(System.in);
      double x;
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      double result = (1000 * x 
         + Math.sqrt(Math.abs(3.9 * Math.pow(x, 5)
         - Math.pow(x, 3) + 1))) 
         / (1.6 * Math.pow(x, 2)
         + 2.7 * x + 3.8);
         
      String converted = Double.toString(result);
   
      System.out.println("Result: " + converted);
      
      int length = converted.length();
      int index = converted.indexOf(".");
      int left;
      int right;
      left = index;
      right = (length - index) - 1;
      System.out.println("# of characters to left of decimal point: " + left);
      System.out.print("# of characters to right of decimal point: " + right);
      DecimalFormat decimal = new DecimalFormat("#,##0.0####");
      converted = decimal.format(result);
      System.out.print("\nFormatted Result: " + converted);
   }

}