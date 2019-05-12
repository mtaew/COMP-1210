import java.text.DecimalFormat;
   /** 
    * An Icosahedron class that stores the label, color, and edge.
    * The Icosahedron class also includes methods to set and get each
    * of these fields, as well as methods to calculate the surface area,
    * volume, and surface to volume ratio of an Icosahedron object, and
    * a method to provide a String value of an Icosahedron object 
    *
    * @author Tae Myles
    * @version 10/17/18
    */
public class Icosahedron {
    
    // Fields (Instance variable)
   private String label = "";
   private String color = "";
   private double edge = 0;
      
    /**
     * List of constructors.
     *
     * @param labelIn set method for each field.
     * @param colorIn set method for each field.
     * @param edgeIn set method for each field.
     */
   public Icosahedron(String labelIn, String colorIn, double edgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   }
    /**
     * List of methods.
     *
     * Accepts no parameters and returns a String representing the label field.
     *
     * @return returns label.
     */
   public String getLabel() {
      return label;
   }
    /**
     * Takes a String parameter and returns a boolean.
     *
     * @param labelIn set to a string.
     * @return returns depending on true or false.
     */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      } 
      return false;
   }
    /**
     * Accepts no parameters and returns a String representing the color field.
     *
     * @return returns color.
     */
   public String getColor() {
      return color;
   }
    /**
     * Takes a String parameter and returns a boolean.
     *
     * @param colorIn set to a string.
     * @return returns depending on true or false.
     */
   public boolean setColor(String colorIn) {
      if (colorIn != null) {
         color = colorIn.trim();
         return true;
      }
      return false;
   }
    /**
     * Accepts no parameters and returns a double representing the edge field.
     *
     * @return returns edge.
     */
   public double getEdge() {
      return edge;
   }
    /**
     * Accepts a double parameter and returns a boolean as follows.
     * If the edge is greater than zero, sets the edge field to the
     * double passed in and returns true.  Otherwise, the method returns
     * false and the edge is not set. 
     *
     * @param edgeIn set to a string.
     * @return returns depending on true or false.
     */ 
   public boolean setEdge(double edgeIn) {
      if (edgeIn > 0) {
         edge = edgeIn;
         return true;
      }
      return false;
   }
    /**
     * Accepts no parameters and returns the double value for the total
     * surface area calculated using the value for edge.
     *
     * @param surfaceArea.
     * @return returns calculated surfaceArea.
     */
   public double surfaceArea() {
      double surfaceAreaCalculated = 5 * Math.sqrt(3) * Math.pow(edge, 2);
      return surfaceAreaCalculated;
   }
    /**
     * Accepts no parameters and returns the double value
     * for the volume calculated using the value for edge.
     *
     * @param volume.
     * @return returns calculated volume.
     */
   public double volume() {
      double volumeCalculated = ((5 * (3 
         + Math.sqrt(5)) * Math.pow(edge, 3)) / 12);
      return volumeCalculated;
   }
    /**
     * Accepts no parameters and returns the double value calculated
     * by dividing the total surface area by the volume.
     *
     * @param surfaceToVolumeRatio.
     * @return returns calculated surfaceVolume.
     */
   public double surfaceToVolumeRatio() {
      double surfaceVolumeCalculated = surfaceArea() / volume();
      return surfaceVolumeCalculated;
   }
    /**
     * Returns a String containing the information about the Icosahedron object.
     *
     * @return multiple Strings and double.
     */
   public String toString() {
      DecimalFormat form1 = new DecimalFormat("#,##0.0#####"); 
   
      String output = "Icosahedron \"" + label + "\" is \"" + color   
         + "\" with 30 edges of length " + edge
         + " units.\n\tsurface area = " + form1.format(surfaceArea()) 
         + " square units\n\tvolume = " + form1.format(volume()) 
         + " cubic units\n\tsurface/volume ratio = " 
         + form1.format(surfaceToVolumeRatio()); 
         
      return output;
   }
   
}