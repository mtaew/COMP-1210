/**
 * Division class divides numberator by denominator. Catches errors as well.
 *
 * @author Tae Myles
 * @version 11/26/18
 **/
public class Division {
 /**
 * Divide method.
 *
 * @param num takes int
 * @param denom takes int
 * @return divided value
 **/ 
   public static int intDivide(int num, int denom) {
      try {
         return num / denom;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
 /**
 * Divide by decimal method.
 *
 * @param num takes int
 * @param denom takes int
 * @return divided value by decimal
 **/ 
   public static double decimalDivide(int num, int denom) {
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      double num1 = num;
      double denom2 = denom;
      return num1 / denom2;
      
      
   }
   
}