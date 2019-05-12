import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
   /** 
    * An IcosahedronTest class that contains a set of testmethods to test 
    * each of the methods in Icosahedron.
    *
    * @author Tae Myles
    * @version 10/25/18
    */
public class IcosahedronTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test for getLabel(). **/
   @Test public void getLabelTest() {
      Icosahedron i = new Icosahedron("Small", "blue", 3);
      Assert.assertEquals("Labels doesn't match", "Small", i.getLabel());
   }
   
   /** Test for setLabel(). **/
   @Test public void setLabelTest() {
      Icosahedron i = new Icosahedron("Small", "blue", 3);
      i.setLabel("Medium");
      Assert.assertEquals("Not true", true, i.getLabel().contains("Medium"));
      
      Icosahedron i2 = new Icosahedron("Small", "blue", 3);
      i2.setLabel(null);
      Assert.assertEquals("Not false", false, i2.getLabel().contains("Medium"));
   }
   
   /** Test for getColor(). **/
   @Test public void getColorTest() {
      Icosahedron i = new Icosahedron("Small", "blue", 3);
      Assert.assertEquals("Color doesn't match", "blue", i.getColor());
   }
   
   /** Test for setcolor(). **/
   @Test public void setColorTest() {
      Icosahedron i = new Icosahedron("Small", "blue", 3);
      i.setColor("black");
      Assert.assertEquals("Not true", true, i.getColor().contains("black"));
      
      Icosahedron i2 = new Icosahedron("Small", "blue", 3);
      i2.setColor(null);
      Assert.assertEquals("Not false", false, i2.getColor().contains("yellow"));
   }
   
   /** Test for getEdge(). **/
   @Test public void getEdgeTest() {
      Icosahedron i = new Icosahedron("Small", "blue", 3);
      Assert.assertEquals("Edge doesn't match", 3, i.getEdge(), .000001);
   }
   
   /** Test for setEdge(). **/
   @Test public void setEdgeTest() {
      Icosahedron i = new Icosahedron("Small", "blue", 3);
      i.setEdge(2.5);
      Assert.assertEquals("Edge doesn't match", 2.5, i.getEdge(), .000001);
      
      Icosahedron i2 = new Icosahedron("Small", "blue", 5);
      i2.setEdge(0);
      Assert.assertEquals("Edge doesn't match", false, i2.setEdge(0));
   }
   
   /** Test for volumeTest(). **/
   @Test public void volumeTest() {
      Icosahedron i = new Icosahedron("Small", "blue", 3);
      Assert.assertEquals("SurfaceArea doesn't match",
         58.90576474687264, i.volume(), .000001);
   }
   
   /** Test for surfaceToVolumeRatio(). **/
   @Test public void surfaceTovolumeRatioTest() {
      Icosahedron i = new Icosahedron("Small", "blue", 3);
      Assert.assertEquals("SurfaceArea doesn't match",
          1.3231690764992146, i.surfaceToVolumeRatio(), .000001);
   }
   
   /** Test for toString(). **/
   @Test public void toStringTest() {
      Icosahedron i = new Icosahedron("Small", "blue", .01);
      String b = "Icosahedron \"Small\" is \"blue\" with 30 edges "
         + "of length 0.01 units.\n\tsurface area = 0.000866 square units" 
         + "\n\tvolume = 0.000002 cubic units"
         + "\n\tsurface/volume ratio = 396.950723";
      Assert.assertEquals("Not true", b, i.toString());
   }
   
   /** Test for getCount(). **/
   @Test public void getCountTest() {
      Icosahedron.resetCount();
      Icosahedron i = new Icosahedron("Small", "blue", 3);
      Assert.assertEquals("Incorrect value", 1, i.getCount());
   }
   
   /** Test for resetCount(). **/
   @Test public void resetCountTest() {
      Icosahedron i = new Icosahedron("Small", "blue", 3);
      i.resetCount();
      Assert.assertEquals("Incorrect value", 0, i.getCount());
   }
   
   /** Test for equalsTest(). **/
   @Test public void equalsTest() {
      Icosahedron i = new Icosahedron("Small", "blue", 3);
      Icosahedron d2 = new Icosahedron("Small", "blue", 3);
      Assert.assertEquals("Error", true, i.equals(d2));
      
      d2 = new Icosahedron("Medium", "blue", 3);
      Assert.assertEquals("Error", false, i.equals(d2));
        
      d2 = new Icosahedron("Small", "yellow", 3);
      Assert.assertEquals("Error", false, i.equals(d2));
        
      d2 = new Icosahedron("Small", "blue", 5);
      Assert.assertEquals("Error", false, i.equals(d2));
      
      Assert.assertEquals("Error",
                        false, i.equals("obj"));
   }
   
   /** Test for hashCode(). **/
   @Test public void hashCodeTest() {
      Icosahedron i = new Icosahedron("Small", "blue", 3);
      Assert.assertEquals("Edge doesn't match", 0, i.hashCode());
   }
   
}


