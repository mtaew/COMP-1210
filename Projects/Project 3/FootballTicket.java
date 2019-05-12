import java.util.Scanner;
import java.text.DecimalFormat;

   /** 
    * Accepts coded football ticket information as input that includes
    * the ticket price, category, time, date, seat, row, section, followed
    * by the descriptionof the game. 
    *
    * @author Tae Myles
    * @version 09/12/18
    */
    
public class FootballTicket {

  /**
   * Prints information from football ticket.
   *
   * @param args Command line arguments (not used).
   */
   public static void main(String[]args) {
      Scanner userInput = new Scanner(System.in);
      String code = "";
      System.out.print("Enter your ticket code: ");
      code = userInput.nextLine();
      String newCode = code.trim();
      int codeLength = newCode.length();
      System.out.println();
      
      if (codeLength < 25) {
         System.out.println("Invalid Ticket Code.");
         System.out.println("Ticket code must have at least 25 characters.");
      }
      else {
         String game = newCode.substring(24);
         String category = newCode.substring(0, 1);
         String month = newCode.substring(10, 12);
         String day = newCode.substring(12, 14);
         String year = newCode.substring(14, 18);
         String time1 = newCode.substring(6, 8);
         String time2 = newCode.substring(8, 10);
         String section = newCode.substring(22, 24);
         String row = newCode.substring(20, 22);
         String seat = newCode.substring(18, 20);
         String price = newCode.substring(1, 6);
         int newSection = Integer.parseInt(section);
         newSection = newSection * 1;
         
         double priceFormat = Double.parseDouble(price);
         priceFormat = priceFormat / 100;
         double studentDiscount = Double.parseDouble(price);
         studentDiscount = (studentDiscount - studentDiscount * .67) / 100;
         double facultyDiscount = Double.parseDouble(price);
         facultyDiscount = (facultyDiscount - facultyDiscount * .20) / 100;
         
         double prizeNumber = (Math.random() * 9999998) + 1;
         int prizeNumberInt = (int) prizeNumber;
         
         DecimalFormat reg = new DecimalFormat("$###.00");
         DecimalFormat stu = new DecimalFormat("$###.00");
         DecimalFormat fac = new DecimalFormat("$###.00");
         char newCategory = category.charAt(0);
      
         if (newCategory == 'r') {
         
            System.out.println("Game: " + game + "   Date: " + month
               + "/" + day + "/" + year + "   Time: " + time1 
               + ":" + time2);
            System.out.println("Section: " + newSection + "   Row: " + row 
               + "   Seat: " + seat);
            System.out.println("Price: " + reg.format(priceFormat) 
               + "   Category: " + category
               + "   Cost: " + reg.format(priceFormat));
            System.out.println("Prize Number: " + prizeNumberInt);
         }
         else if (newCategory == 's') {
           
            System.out.println("Game: " + game + "   Date: " + month
               + "/" + day + "/" + year + "   Time: " + time1 
               + ":" + time2);
            System.out.println("Section: " + newSection + "   Row: " + row 
               + "   Seat: " + seat);
            System.out.println("Price: " + reg.format(priceFormat) 
               + "   Category: " + category
               + "   Cost: " + stu.format(studentDiscount));
            System.out.println("Prize Number: " + prizeNumberInt);
         }
         else if (newCategory == 'f') {
           
            System.out.println("Game: " + game + "   Date: " + month
               + "/" + day + "/" + year + "   Time: " + time1 
               + ":" + time2);
            System.out.println("Section: " + newSection + "   Row: " + row 
               + "   Seat: " + seat);
            System.out.println("Price: " + reg.format(priceFormat) 
               + "   Category: " + category
               + "   Cost: " + fac.format(facultyDiscount));
            System.out.println("Prize Number: " + prizeNumberInt);
         }
      }   
   }
}