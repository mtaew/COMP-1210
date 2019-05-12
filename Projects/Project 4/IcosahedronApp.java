import java.util.Scanner;
/** 
    * Calls in the method from Icosahedron then takes
    * user input to calculate the value.
    *
    * @author Tae Myles
    * @version 09/16/18
    */  
public class IcosahedronApp {
   /** 
    * Calling in method from Icosahedron.java.
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String label;
      String color;
      double edge;
      System.out.println("Enter label, color, and edge"
         + " length for an icosahedron.");
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
   
      System.out.print("\tcolor: ");
      color = userInput.nextLine();
   
      System.out.print("\tedge: ");
      edge = userInput.nextDouble();
      
      if (edge > 0) {
         System.out.println();
         Icosahedron comment = new Icosahedron(label, color, edge);
         System.out.println(comment);
      }
      else {
         System.out.println("Error: edge must be greater than 0.");    
      }
   }
}