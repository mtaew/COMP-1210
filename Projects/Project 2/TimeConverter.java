import java.util.Scanner;

   /** 
    * It accepts a raw time measurement in seconds(of type int)
    * and then then displays the timeas a combination of 
    * days, hours, minutes, and seconds.
    *
    * @author Tae Myles
    * @version 09/05/18
    */
public class TimeConverter {

  /**
   * Takes raw input and prints out time.
   *
   * @param args Command line arguments (not used).
   */
   public static void main(String[]args) {
      Scanner userInput = new Scanner(System.in);
      int input;
      int days;
      int hours;
      int minutes;
      int seconds;
      
      System.out.print("Enter the raw time measurement in seconds: ");
      input = userInput.nextInt();
      
      days = input / 86400;
      hours = (input % 86400) / 3600;
      minutes = ((input % 86400) % 3600) / 60;
      seconds = ((input % 86400) % 3600) % 60;
      
      if (input < 0) {
         System.out.println("Measurement must be non-negative!");
      }
      else {
         System.out.println();
         System.out.println("Measurement by combined " 
            + "days, hours, minutes, seconds:");
      
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + seconds);
         System.out.println();
         System.out.println(input + " seconds = " 
            + days + " days, " + hours + " hours, "
            + minutes + " minutes, " + seconds + " seconds");
         
      }
   }
}