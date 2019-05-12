import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * IcosahedronList2 class that stores the name of the list and
 * an Array of Icosahedron objects. It also includes methods
 * that return the name of the list, number of Icosahedron objects
 * in the IcosahedronList2, total surface area, total volume, average
 * surface area,average volume, and average surface to volume ratio
 * for all Icosahedron objects in the IcosahedronList2. The toString
 * method returns a String containing the name of the list followed
 * by each Icosahedron in the Array of Icosahedrons,and a summaryInfo method
 * returns summary information about the list
 *
 * @author Tae Myles
 * @version 11/12/18
 */

public class IcosahedronList2 {

// Fields (Instance variable)
   private String list;
   private Icosahedron[] icosObj;
   private int count; 
/**
 * List of constructors.
 * 
 * Accepts a parameter of type String representing the name of the list, 
 * a parameter of type Icosahedron[], representing the list of
 * Icosahedronobjects, and a parameter of type int representing the number
 * of Icosahedron objects in the Icosahedron array. 
 * 
 * @param listIn is String
 * @param icosObjIn is Icosahedron[]
 * @param countIn is int
 */
   public IcosahedronList2(String listIn, Icosahedron[] icosObjIn, int countIn)
   {
      list = listIn;
      icosObj = icosObjIn;
      count = countIn;
   }
/**
 * List of methods.
 *
 * Returns a String representing the name of the list.
 *
 * @return returns list
 */
   public String getName() {
      return list;
   }
/**
 * Returns an int representing the number of Icosahedron objects in
 * the IcosahedronList. If there are zero Icosahedron objects in the
 * list, zero is returned. 
 *
 * @return number of icosahedrons
 */      
   public int numberOfIcosahedrons() {
      return count;
   }
/**
 * Returns a double representing the total surface areas for all
 * Icosahedron objects in the list.  If there are zero Icosahedron objects
 * in the list, zero is returned. 
 *
 * @return total surface area
 */            
   public double totalSurfaceArea() {
      double sum = 0;
      for (int i = 0; i < numberOfIcosahedrons(); i++) {
         if (icosObj[i] != null) {
            sum += icosObj[i].surfaceArea();
         }
      }
      return sum;
   }
/**
 * Returns a double representing the total volumes for all Icosahedron objects
 * in the list.  If there are zero Icosahedron objects in the list, zero
 * int returned. 
 *
 * @return total volume
 */            
   public double totalVolume() {
      double surface = 0;
      for (int i = 0; i < numberOfIcosahedrons(); i++) {
         if (icosObj[i] != null) {
            surface += icosObj[i].volume();
         }
      }
      return surface;
   }
/**
 * Returns a double representing the average surface areafor all
 * Icosahedronobjects in the list.  If there are zero Icosahedron objects
 * in the list, zero should be returned.
 *
 * @return averageSurfaceArea
 */        
   public double averageSurfaceArea() {
      if (numberOfIcosahedrons() == 0) {
         return 0;
      }
      else {
         return totalSurfaceArea() / numberOfIcosahedrons();
      }
   }   
/**
 * Returns a double representing the average volume for all Icosahedron objects
 * in the list.  If there are zero Icosahedronobjects in the
 * list, zero should be returned.
 * 
 * @return averageVolume
 */       
   public double averageVolume() {
      if (numberOfIcosahedrons() == 0) {
         return 0;
      }
      else {
         return totalVolume() / numberOfIcosahedrons();
      }
   }   
/**
 * Returns a double representing the average surface to volume ratio for all
 * Icosahedron objects in the list.  If there are zero Icosahedron objects
 * in the list, zero is returned.
 *
 * @return averageVolume
 */      
   public double averageSurfaceToVolumeRatio() {
      double total = 0.0;
      if (numberOfIcosahedrons() == 0) {
         return 0;
      }
      else {
         for (int i = 0; i < numberOfIcosahedrons(); i++) {
            if (icosObj[i] != null) {
               total += icosObj[i].surfaceToVolumeRatio();
            }
         }
         return total / numberOfIcosahedrons();
      }
   }
/**
 * Returns a String containing the name of the list followed by each
 * Icosahedron in the ArrayList. In the process of creating the return result,
 * toString() method includes a while loop that calls the toString() method
 * for each Icosahedron object in the list
 *
 * @return totalOutput
 */   
   public String toString() {
      String icosahedronListName = list + "\n";
      for (int i = 0; i < numberOfIcosahedrons(); i++) {
         icosahedronListName += "\n" + icosObj[i] + "\n";
         
      }
      return icosahedronListName;
   }
/**
 * Returns a String containing the name of the list followed
 * by various summary items:  number of Icosahedrons, total surface
 * area, total volume, average surface area, average volume,
 * and average surface to volume ratio.
 *
 * @return result
 */         
   public String summaryInfo() {
      DecimalFormat form2 = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Icosahedrons: " + (numberOfIcosahedrons());
      result += "\nTotal Surface Area: " 
         + form2.format(totalSurfaceArea());
      result += "\nTotal Volume: " + form2.format(totalVolume()); 
      result += "\nAverage Surface Area: " 
         + form2.format(averageSurfaceArea());
      result += "\nAverage Volume: "  + form2.format(averageVolume());
      result += "\nAverage Surface/Volume Ratio: "  
         + form2.format(averageSurfaceToVolumeRatio());
      
      return result;
   }
/**
 * Returns the ArrayList of Icosahedron objects.
 *
 * @return icosObj
 */         
   public Icosahedron[] getList() {
      return icosObj;
   }
/**
 * Takes a String parameter representing the file name, reads in the file,
 * storing the list name and creating an ArrayList of Icosahedronobjects,
 * uses the listname and the ArrayList to create an icosahedronList object,
 * and then returns the IcosahedronListobject.
 *
 * @return Icos
 * @param fileName fileName for the readfile
 * @throws FileNotFoundException if file does not open
 */      
   public IcosahedronList2 readFile(String fileName)
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileName));
      int icoCount = 0;
      Icosahedron[] newIcos = new Icosahedron[100];
      list = scanFile.nextLine();
      while (scanFile.hasNext()) {
         String icosList = "";
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         String edgeStr = scanFile.nextLine();
         double edge = Double.parseDouble(edgeStr);
         Icosahedron newObj = new Icosahedron(label, color, edge);
         newIcos[icoCount] = newObj;
         icoCount++;
      }
      scanFile.close();
      IcosahedronList2 ico = new IcosahedronList2(list, newIcos, icoCount);
      return ico;
   }
/**
 * Returns nothing but takes three parameters (label, color, and edge),
 * creates a new Icosahedron object,and adds it to the IcosahedronListobject.
 *
 * @param label icosahedron label
 * @param color icosahedron color
 * @param edge icosahedron edge
 */             
   public void addIcosahedron(String label, String color, double edge) {
      Icosahedron newObj = new Icosahedron(label, color, edge);
      icosObj[count] = newObj;
      count++;
   }
/**
 * Takes a label of an icosahedron as the String parameter and returns
 * the corresponding Icosahedron object if found in the IcosahedronList
 * object; otherwise returns null. 
 *
 * @param label icosahedron label
 * @return confirmIcosList if confirmed found label else, null
 */                  
   public Icosahedron findIcosahedron(String label) {
      for (int i = 0; i < numberOfIcosahedrons(); i++) {
         if (icosObj[i].getLabel().equalsIgnoreCase(label)) {
            return icosObj[i];
         }
      }
      return null;
   }

/**
 * Takes a String as a parameter that represents the label of the Icosahedron
 * and returns the Icosahedron if it is found in the IcosahedronList object
 * and deleted; otherwise returns null.
 *
 * @param label icosahedron label
 * @return newIcosObj if removed label else, null
 */                 
   public Icosahedron deleteIcosahedron(String label) {
      int indexFound = 0;
      Icosahedron newIcosObj = findIcosahedron(label); 
      
      for (int i = 0; i < numberOfIcosahedrons(); i++) {
         if (icosObj[i].getLabel().equalsIgnoreCase(label)) {
            for (int j = i; j < numberOfIcosahedrons() - 1; j++) {
               icosObj[j] = icosObj[j + 1];
            }
         
            icosObj[count - 1] = null;
            count--;
            break;
         }
      }
      return newIcosObj;
      
   }
   
/**
 * Takes three parameters (label, color, and edge), uses the label
 * to find the corresponding the Icosahedron object.
 * If found, sets the color and edge to the values passed in as parameters,
 * and returns true. If not found, returns false.
 *
 * @param label icosahedron label
 * @param color icosahedron color
 * @param edge icosahedron edge 
 * @return true if sucessful, else false
 */       
   public boolean editIcosahedron(String label, String color, double edge) {
      Icosahedron newIcosObj = new Icosahedron(label, color, edge);
      for (int i = 0; i < numberOfIcosahedrons(); i++) {
         if (label.equalsIgnoreCase(icosObj[i].getLabel())) {
            icosObj[i].setColor(color);
            icosObj[i].setEdge(edge);
            return true;
         }
      }
      return false;
   }
/**
 * Finds the shortest edge of an icosahedron.
 *
 * @return icosObj
 */
   public Icosahedron findIcosahedronWithShortestEdge() {
      if (numberOfIcosahedrons() == 0) {
         return null;
      }
      double largest = 0;
      int indexOfLargest = 0;
      for (int i = 0; i < numberOfIcosahedrons(); i++) {
         if (icosObj[indexOfLargest].getEdge() > icosObj[i].getEdge()) {
            indexOfLargest = i;
         }
      }
      return icosObj[indexOfLargest];
   }
/**
 * Finds the Longest edge of an icosahedron.
 *
 * @return icosObj
 */
   public Icosahedron findIcosahedronWithLongestEdge() {
      if (numberOfIcosahedrons() == 0) {
         return null;
      }
      double smallest = 0;
      int indexOfSmallest = 0;
      for (int i = 0; i < numberOfIcosahedrons(); i++) {
         if (icosObj[indexOfSmallest].getEdge() < icosObj[i].getEdge()) {
            indexOfSmallest = i;
         }
      }
      return icosObj[indexOfSmallest];
   }
/**
 * Finds the smallest volume of an icosahedron.
 *
 * @return icosObj
 */
   public Icosahedron findIcosahedronWithSmallestVolume() {
      if (numberOfIcosahedrons() == 0) {
         return null;
      }
      double smallest = 0;
      int indexOfSmallest = 0;
      for (int i = 0; i < numberOfIcosahedrons(); i++) {
         if (icosObj[indexOfSmallest].volume() > icosObj[i].volume()) {
            indexOfSmallest = i;
         }
      }
      return icosObj[indexOfSmallest];
   }
/**
 * Finds the largest volume of an icosahedron.
 *
 * @return icosObj
 */
   public Icosahedron findIcosahedronWithLargestVolume() {
      if (numberOfIcosahedrons() == 0) {
         return null;
      }
      double largest = 0;
      int indexOfLargest = 0;
      for (int i = 0; i < numberOfIcosahedrons(); i++) {
         if (icosObj[indexOfLargest].volume() < icosObj[i].volume()) {
            indexOfLargest = i;
         }
      }
      return icosObj[indexOfLargest];
   }
}