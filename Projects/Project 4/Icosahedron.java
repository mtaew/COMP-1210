import java.text.DecimalFormat;
   /** 
    * Computes return values for the respective methods in the Icosahedron
    * class described in this project.
    *
    * @author Tae Myles
    * @version 09/16/18
    */
public class Icosahedron {
    
    // Fields (Instance variable)
   private String label = "";
   private String color = "";
   private double edge = 0;
      
    /**
     * Constructor.
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
     * Method.
     *
     * @return returns label.
     */
   public String getLabel() {
      return label;
   }
    /**
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
     * @return returns color.
     */
   public String getColor() {
      return color;
   }
    /**
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
     * @return returns edge.
     */
   public double getEdge() {
      return edge;
   }
    /**
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
     * @param surfaceArea.
     * @return returns calculated surfaceArea.
     */
   public double surfaceArea() {
      double surfaceAreaCalculated = 5 * Math.sqrt(3) * Math.pow(edge, 2);
      return surfaceAreaCalculated;
   }
    /**
     * @param volume.
     * @return returns calculated volume.
     */
   public double volume() {
      double volumeCalculated = ((5 * (3 
         + Math.sqrt(5)) * Math.pow(edge, 3)) / 12);
      return volumeCalculated;
   }
    /**
     * @param surfaceToVolumeRatio.
     * @return returns calculated surfaceVolume.
     */
   public double surfaceToVolumeRatio() {
      double surfaceVolumeCalculated = surfaceArea() / volume();
      return surfaceVolumeCalculated;
   }
    /**
     * Output of example.
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
         + form1.format(surfaceToVolumeRatio()) + "\n"; 
         
      return output;
   }
   
}