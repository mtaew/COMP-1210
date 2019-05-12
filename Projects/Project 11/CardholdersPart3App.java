import java.io.FileNotFoundException;  
/** 
 * The CardholderProcessor part 3 app. Generates all reports. 
 *
 * @author Tae Myles
 * @version 12/02/18
 **/
public class CardholdersPart3App {
/** 
  * Main method. 
  *
  * @param args not used.
  * @throws FileNotFoundException if error occurs.
  **/
   public static void main(String[] args) throws
      FileNotFoundException {
      
      if (args.length <= 0) {
         System.out.println("File name expected as command line argument.\n"
            + "Program ending.");
      }
      else {
         try {
            String fileName = args[0];
            CardholderProcessor processor = new CardholderProcessor();
            processor.readCardholderFile(fileName);
            System.out.print(processor.generateReport());
            System.out.print(processor.generateReportByName());
            System.out.print(processor.generateReportByCurrentBalance());
            System.out.print(processor.generateInvalidRecordsReport());
         }
         catch (FileNotFoundException fileException) {
            System.out.println(" *** Attempted to read file: "
               + args[0] + " (No such file or directory)");
         }
      }
   
   }
}