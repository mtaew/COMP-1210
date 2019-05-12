import java.util.Scanner;

   /** 
    * Uses user input to calculate midpoint line segment.
    *
    * @author Tae Myles
    * @version 09/05/18
    */
public class MidpointOfLineSegment {

 /**
   * Prints midpoint line segment.
   *
   * @param args Command line arguments (not used).
   */

   public static void main(String[]args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      double x1;
      double x2;
      double y1;
      double y2;
      double midpoint1;
      double midpoint2;
      
      System.out.println("Enter the coordinates for endpoint 1: ");
      
      System.out.print("\tx1 = ");
      x1 = userInput.nextDouble();
          
      System.out.print("\ty1 = ");
      y1 = userInput.nextDouble();
      
      System.out.println("Enter the coordinates for endpoint 2: ");
      
      System.out.print("\tx2 = ");
      x2 = userInput.nextDouble();
      
      System.out.print("\ty2 = ");
      y2 = userInput.nextDouble();
      
      midpoint1 = ((x1 + x2) / 2);
      midpoint2 = ((y1 + y2) / 2);
     
      System.out.println("For endpoints (" + x1 + ", " + y1
         + ") and (" + x2 + ", " + y2 + "), the midpoint is ("
         + midpoint1 + ", " + midpoint2 + ").");
   }
}