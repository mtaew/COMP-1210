import java.util.ArrayList;
import java.util.Scanner;
/**
 * TemperatureInfo will allow users to interact with the 
 * Temperaturesclass.
 *
 * @author Tae Myles
 * @version 10/07/18
 */   
public class TemperatureInfo {
 /**
  * Main method for the input.
  *
  * @param args not used.
  */   
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      String tempInput = "";
      
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
   
      Temperatures temps = new Temperatures(tempsList);
      
      char choice = 'E';
      do {
         System.out.print("Enter choice =  - [L]ow temp, " 
            + "[H]igh temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
               
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
               
            case 'P':
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;   
           
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }
}