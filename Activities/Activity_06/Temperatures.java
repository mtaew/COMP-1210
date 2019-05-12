import java.util.ArrayList;
/**
 * Temperatures will hold a set of integer values representing
 * daily temperatures in this class.
 *
 * @author Tae Myles
 * @version 10/07/18
 */
public class Temperatures {

// Fields
   private ArrayList<Integer> temperatures
      = new ArrayList<Integer>();

/**
 * The constructor takes an ArrayList of integer values.
 *
 * @param temperaturesIn stored back into temperature.
 */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
/**
 * Takes no parameters; returns an integer value.
 *
 * @return returns low.
 */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
/**
 * Takes no parameters; returns an integer value.
 *
 * @return returns high. 
 */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }      
      }
      return high; 
   }
/**
 * Takes an int parameter; returns an integer value.
 *
 * @param lowIn is set to int
 * @return lowIn if true, else getLowTemp is returned. 
 */       
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
/**
 * Takes an int parameter; returns an integer value.
 *
 * @param highIn is set to int
 * @return highIn if true, else getHighTemp is returned. 
 */       
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
/**
 * No parameters; returns a String.
 *
 * @return toString is returned with collected data. 
 */         
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}