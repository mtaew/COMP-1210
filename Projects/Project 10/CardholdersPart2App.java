import java.io.FileNotFoundException;
/** 
 * Reads in file. Then, prints out report, report by name, and by balance.
 *
 * @author Tae Myles
 * @version 11/26/18
 **/
public class CardholdersPart2App {
/** 
  * Main method that prints out according to card holders data.
  * 
  * @param args not used.
  * @throws FileNotFoundException shows error  
  **/
   public static void main(String[] args) throws 
      FileNotFoundException {         
   
   
      if (args.length <= 0) {
         System.out.println("File name expected as command line argument."
              + "\nProgram ending.");
      }
          
      else {
       
         String fileName = "cardholder_data_1.txt";
         CardholderProcessor processor = new CardholderProcessor();
         processor.setArray(fileName);
         processor.readCardholderFile(fileName);
         System.out.println(processor.generateReport());
         System.out.println(processor.generateReportByName());
         System.out.println(processor.generateReportByCurrentBalance());
      }
   
   }
}