import java.util.Scanner;
import java.io.FileNotFoundException;
/** 
 * The main method should print a list of options with the action code and
 * a short description followed by a line with justthe action codes prompting
 * the user to select an action. After the user enters an action code, the
 * action is performed, including output if any. Then the line with just the
 * action codes prompting the user to select an action is printed again to
 * accept the next code.  The first action a user would normally perform is
 * ‘R’ to read in the file and create an icosahedronList object.
 * The user may continue to perform actions until ‘Q’ is entered to
 * quit(or end) the program.
 *
 * @author Tae Myles
 * @version 10/17/18
 */
public class IcosahedronList2MenuApp {
   /**
    * User interaction with menu to choose options to observe
    * and modify with Icosahedron objects.
    *
    * @param args not used
    * @throws FileNotFoundException if file does not open
    */
   public static void main(String[] args) throws FileNotFoundException {
      Scanner scan = new Scanner(System.in);
      String fileName = "*** no file name ***";
      String list = "*** no listname assigned ***";
      String code = "";
      Icosahedron[] icosObj = new Icosahedron[100];
      IcosahedronList2 icosList = new IcosahedronList2(list, icosObj, 0);
      System.out.println("Icosahedron List System Menu"
            + "\nR - Read File and Create Icosahedron List"
            + "\nP - Print Icosahedron List" + "\nS - Print Summary"
            + "\nA - Add Icosahedron" + "\nD - Delete Icosahedron"
            + "\nF - Find Icosahedron" + "\nE - Edit Icosahedron"
            + "\nQ - Quit");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char choice = code.charAt(0);
         switch (choice) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               icosList = icosList.readFile(fileName);
               System.out.println("\tFile read in and "
                  + "Icosahedron List created\n");
               break;
               
            case 'P':
               System.out.println(icosList);
               break;
               
            case 'S':
               System.out.println("\n" + icosList.summaryInfo() + "\n");
               break;
               
            case 'A':
            
               System.out.print("\tLabel: ");
               String label = scan.nextLine();
               System.out.print("\tColor: ");
               String color = scan.nextLine();
               System.out.print("\tEdge: ");
               double edge = Double.parseDouble(scan.nextLine());
            
               icosList.addIcosahedron(label, color, edge);
               System.out.println("\t*** Icosahedron added ***\n");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               Icosahedron result = icosList.deleteIcosahedron(label);
               if (result == null) {
                  System.out.println("\t\"" + label + "\" not found" + "\n");
               }
               else {
                  System.out.println("\t\"" + result.getLabel() 
                     + "\" deleted" + "\n");
               }
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (icosList.findIcosahedron(label) != null) {
                  System.out.println(icosList.findIcosahedron(label) + "\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found" + "\n");
               }
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tColor: ");
               color = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               
               if (icosList.editIcosahedron(label, color, edge)) {
                  System.out.println("\t\"" + label + "\" successfully edited"
                     + "\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found" + "\n");
               }
               break;
               
            case 'X':
               Icosahedron shortest = findIcosahedronWithShortestEdge();
               System.out.println("\n" + shortest + "\n");
               break;
               
            case 'Q':
               break;
            
            default:
               System.out.println("\t*** invalid code ***\n");
         }
      } while (!code.equalsIgnoreCase("Q")); 
   }
}

