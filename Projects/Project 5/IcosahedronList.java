import java.util.ArrayList;
import java.text.DecimalFormat;
/** 
 * IcosahedronList class that stores the name of the list and
 * an ArrayList of Icosahedron objects. It also includes methods
 * that return the name of the list, number of Icosahedron objects
 * in the IcosahedronList, total surface area, total volume, average
 * surface area,average volume, and average surface to volume ratio
 * for all Icosahedron objects in the IcosahedronList. The toString
 * method returns a String containing the name of the list followed
 * by each Icosahedron in the ArrayList,and a summaryInfo method
 * returns summary information about the list
 *
 * @author Tae Myles
 * @version 10/05/18
 */

public class IcosahedronList {

// Fields (Instance variable)
   private String list = "";
   private ArrayList<Icosahedron> icosList 
            = new ArrayList<Icosahedron>();
/**
 * List of constructors.
 * 
 * Contains a constructor that accepts a parameter of type String
 * representing the name of the list and a parameter of type
 * ArrayList <Icosahedron> representing the list of Icosahedron objects.
 * @param listIn uses String
 * @param icosListIn uses ArrayList
 */
   public IcosahedronList(String listIn, ArrayList<Icosahedron> icosListIn) {
      list = listIn;
      icosList = icosListIn;
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
 * @return returns icosList
 */      
   public int numberOfIcosahedrons() {
      return icosList.size();
   }
/**
 * Returns a double representing the total surface areas for all
 * Icosahedron objects in the list.  If there are zero Icosahedron objects
 * in the list, zero is returned. 
 *
 * @return returns total
 */            
   public double totalSurfaceArea() {
      int index = 0;
      double total = 0.0;
      while (index < icosList.size()) {
         total += icosList.get(index).surfaceArea();
         index++;  
      }
      return total;
   }
/**
 * Returns a double representing the total volumes for all Icosahedron objects
 * in the list.  If there are zero Icosahedron objects in the list, zero
 * int returned. 
 *
 * @return total
 */            
   public double totalVolume() {
      int index = 0;
      double total = 0.0;
      while (index < icosList.size()) {
         total += icosList.get(index).volume();
         index++;  
      } 
      return total;
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
      int index = 0;
      double total = 0.0;
      if (numberOfIcosahedrons() == 0) {
         return 0;
      }
      else {
         while (index < icosList.size()) {
            total += icosList.get(index).surfaceToVolumeRatio();
            index++;
         }
      }
      return total / icosList.size();
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
      String totalOutput = "";
      int index = 0;
      while (index < icosList.size()) {
         totalOutput += icosList.get(index).toString();
         index++;
      }
      return totalOutput;
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
}