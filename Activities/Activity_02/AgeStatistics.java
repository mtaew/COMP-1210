import java.util.Scanner;

   /** 
    * Uses user input to calculate their max heart beat rate.
    *
    * @author Tae Myles
    * @version 08/30/18
    */

public class AgeStatistics {

  /**
   * Prints course information to std output.
   *
   * @param args Command line arguments (not used).
   */
   
   public static void main(String[]args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
     
     //prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
     
     //prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
     //prompt the user for their age:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
     //convert age:
      System.out.println("\tYour age in minutes is "
           + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
           + (double) ageInYears / 100 + " centuries.");
           
      if (gender == 1) { //calculate female MHR
         maxHeartRate = 209 - (0.7 * ageInYears);
      } 
      else { //calculate male MHR
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
     
     //display max heart rate
      System.out.println("Your max heart rate is " 
         + maxHeartRate + " beats per minute.");
   }
}