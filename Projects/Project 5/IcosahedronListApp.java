import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * An IcosahedronListApp class with a main method that reads in the
 * name of the data file entered by the user and then reads list name
 * and Icosahedron data from the file, createsIcosahedronobjects, stores
 * them in a local ArrayList of Icosahedron objects, creates a IcosahedronList 
 * object with the name of the list and the ArrayList of Icosahedron objects,
 * and then prints the Icosahedron List object followed summary information
 * about the IcosahedronList object.
 *
 * @author Tae Myles
 * @version 10/05/18
 */
public class IcosahedronListApp {
/**
 * Takes user input for the file name and prints data.
 *
 * @param args not used
 * @throws FileNotFoundException  
 */
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<Icosahedron> icosList = new ArrayList<Icosahedron>();
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
   
      String icosahedronListName = scanFile.nextLine();
      
      System.out.println("\n" + icosahedronListName + "\n");
      
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         String edgeStr = scanFile.nextLine();
         double edge = Double.parseDouble(edgeStr);
         Icosahedron t = new Icosahedron(label, color, edge);
         icosList.add(t);
      }
      scanFile.close();
      
      IcosahedronList myIcosahedronList 
         = new IcosahedronList(icosahedronListName, icosList);
   
      System.out.println(myIcosahedronList);
      
      System.out.println(myIcosahedronList.summaryInfo());                     
   }
   

}