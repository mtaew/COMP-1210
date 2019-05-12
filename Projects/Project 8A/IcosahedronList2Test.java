import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/** 
 * Series of test for IcosahedronList2.
 *
 * @author Tae Myles
 * @version 10/29/18
 */
public class IcosahedronList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test for getName() method. **/
   @Test public void getNameTest() {
      Icosahedron[] iArray = new Icosahedron[3];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 2);
      Assert.assertEquals("Error: ", "Test List", iList.getName());
   }
   /** A test for numberOfIcosahedron() method. **/
   @Test public void numberOfIcosahedronsTest() {
      Icosahedron[] iArray = new Icosahedron[3];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 2);
      Assert.assertEquals("Error: ", 2, iList.numberOfIcosahedrons());
   }
   
   /** A test for totalSurfaceArea() method. **/
   @Test public void totalSurfaceAreaTest1() {
      Icosahedron[] iArray = new Icosahedron[3];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 2);
      Assert.assertEquals("Error: ", 1310.210699410881,
          iList.totalSurfaceArea(), .000001);
   }
      /** A test for totalSurfaceArea() method. **/     
   @Test public void totalSurfaceAreaTest2() {
      Icosahedron[] iArray2 = new Icosahedron[4];
      iArray2[0] = new Icosahedron("Small", "blue", 0.01);
      iArray2[1] = null;
      iArray2[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray2, 2);
      Assert.assertEquals("Error: ", 8.660254037844386E-4,
         iList2.totalSurfaceArea(), .000001); 
   }
   
   /** A test for totalVolume() method. **/
   @Test public void totalVolumeTest1() {
      Icosahedron[] iArray = new Icosahedron[3];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 2);
      Assert.assertEquals("Error: ", 4059.8442143009047,
          iList.totalVolume(), .000001);
   }
    /** A test for totalVolume() method. **/     
   @Test public void totalVolumeTest2() {
      Icosahedron[] iArray2 = new Icosahedron[4];
      iArray2[0] = new Icosahedron("Small", "blue", 0.01);
      iArray2[1] = null;
      iArray2[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray2, 2);
      Assert.assertEquals("Error: ", 2.181694990624913E-6,
         iList2.totalVolume(), .000001); 
   }
   /** A test for averageSurfaceArea() method. **/
   @Test public void averageSurfaceAreaTest1() {
      Icosahedron[] iArray = new Icosahedron[3];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 2);
      Assert.assertEquals("Error: ", 655.1053497054405,
          iList.averageSurfaceArea(), .000001);
   }
   /** A test for averageSurfaceArea() method. **/
   @Test public void averageSurfaceAreaTest2() {
      Icosahedron[] iArray2 = new Icosahedron[3];
      iArray2[0] = new Icosahedron("Small", "blue", 0.01);
      iArray2[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray2[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", null, 0);
      Assert.assertEquals("Error: ", 0,
          iList2.averageSurfaceArea(), 0.000001);
   }
   /** A test for averageVolumeTest() method. **/
   @Test public void averageVolumeTest1() {
      Icosahedron[] iArray = new Icosahedron[3];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 2);
      Assert.assertEquals("Error: ", 2029.9221071504523,
          iList.averageVolume(), .000001);
   }
   /** A test for averageVolumeTest() method. **/
   @Test public void averageVolumeTest2() {
      Icosahedron[] iArray2 = new Icosahedron[3];
      iArray2[0] = new Icosahedron("Small", "blue", 0.01);
      iArray2[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray2[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", null, 0);
      Assert.assertEquals("Error: ", 0, iList2.averageVolume(), 0.000001);
   }
   /** A test for averageSurfaceToVolumeRatio() method. **/
   @Test public void averageSurfaceToVolumeRatioTest1() {
      Icosahedron[] iArray = new Icosahedron[3];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 2);
      Assert.assertEquals("Error: ", 198.63672355738208,
          iList.averageSurfaceToVolumeRatio(), .000001);
   }
   /** A test for averageSurfaceToVolumeRatio() method. **/
   @Test public void averageSurfaceToVolumeRatioTest2() {
      Icosahedron[] iArray2 = new Icosahedron[4];
      iArray2[0] = new Icosahedron("Small", "blue", 0.01);
      iArray2[1] = null;
      iArray2[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray2, 2);
      Assert.assertEquals("Error: ", 198.4753614748822,
         iList2.averageSurfaceToVolumeRatio(), .000001);
   }
   /** A test for averageSurfaceToVolumeRatio() method. **/
   @Test public void averageSurfaceToVolumeRatioTest3() {
      Icosahedron[] iArray3 = new Icosahedron[3];
      iArray3[0] = new Icosahedron("Small", "blue", 0.01);
      iArray3[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray3[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList3 = new IcosahedronList2("Test List", null, 0);
      Assert.assertEquals("Error: ", 0,
          iList3.averageSurfaceToVolumeRatio(), 0.000001);
   }
   /** A test for toString() method. **/
   @Test public void toStringTest() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 2);
      String b = "Test List" + "\n\n" 
                  + "Icosahedron \"Small\" is \"blue\" with 30 edges "
                  + "of length 0.01 units.\n\tsurface area"
                  + " = 0.000866 square units" 
                  + "\n\tvolume = 0.000002 cubic units"
                  + "\n\tsurface/volume ratio = 396.950723" + "\n\n"
                  + "Icosahedron \"Medium\" is \"orange\" with 30 edges "
                  + "of length 12.3 units.\n\tsurface area ="
                  + " 1,310.209833 square units" 
                  + "\n\tvolume = 4,059.844212 cubic units"
                  + "\n\tsurface/volume ratio = 0.322724" + "\n";
         
      Assert.assertEquals("Error: ", b, iList.toString());
   }
   /** A test for summaryInfo() method. **/
   @Test public void summaryInfoTest() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      String b = "----- Summary for Test List -----" + "\n"
         + "Number of Icosahedrons: 3" + "\n" 
         + "Total Surface Area: 133,184.749" + "\n"
         + "Total Volume: 4,103,641.239" + "\n"
         + "Average Surface Area: 44,394.916" + "\n"
         + "Average Volume: 1,367,880.413" + "\n"
         + "Average Surface/Volume Ratio: 132.435";
         
      Assert.assertEquals("Error: ", b, iList.summaryInfo());
   }
   /** A test for getList() method. **/
   @Test public void getListTest() {
      Icosahedron[] iArray = new Icosahedron[3];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      Assert.assertArrayEquals("Error: ", iArray, iList.getList());
   }
   /**
    * A test for readFile() method. 
    *
    * @throws IOException if file does not open
    **/
   @Test public void readFileTest() throws IOException {
      Icosahedron[] iArray = new Icosahedron[3];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", null, 0);
      iList = iList.readFile("icosahedron_data_1.txt");
      Assert.assertEquals("Error: ", "Icosahedron Test List", iList.getName());
   }
   /** A test for addIcosahedron() method. **/
   @Test public void addIcosahedronTest() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      Icosahedron a = new Icosahedron("Small", "red", 4.4);
      iList.addIcosahedron("Small", "red", 4.4);
      Icosahedron[] aI = iList.getList();
      Assert.assertEquals("Error: ", a, aI[3]);
   }
   /** A test for findIcosahedron() method. **/
   @Test public void findIcosahedronTest() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      Icosahedron result = iList.findIcosahedron("Small");
      Assert.assertEquals("Error: ", iArray[0], result);
   }
   /** A test for deleteIcosahedron() method. **/
   @Test public void deleteIcosahedronTest1() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      Assert.assertEquals("Error: ", iArray[0],
          iList.deleteIcosahedron("Small"));
   }
   /** A test for deleteIcosahedron() method. **/
   @Test public void deleteIcosahedronTest2() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      Assert.assertEquals("Error: ", null, iList.deleteIcosahedron("Huge"));
   }
   /** A test for editIcosahedron() method. **/
   @Test public void editIcosahedronTest1() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      Assert.assertTrue("Error: ", iList.editIcosahedron("Small", "blue", 3));
   }
   /** A test for editIcosahedron() method. **/
   @Test public void editIcosahedronTest2() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      Assert.assertFalse("Error: ", iList.editIcosahedron("Huge", "blue", 3));
   }
   /** A test for findIcosahedronWithShortestEdgeTest() method. **/
   @Test public void findIcosahedronWithShortestEdgeTest1() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Small", "blue", 423);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      Icosahedron result = iList.findIcosahedronWithShortestEdge();
      Assert.assertEquals("Error: ", iArray[1], result);
   }
   /** A test for findIcosahedronWithShortestEdgeTest() method. **/
   @Test public void findIcosahedronWithShortestEdgeTest2() {
      Icosahedron[] iArray2 = new Icosahedron[0];
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray2, 0);
      iList2.numberOfIcosahedrons();
      Assert.assertEquals("Error: ", null,
          iList2.findIcosahedronWithShortestEdge());
   }
   
   /** A test for findIcosahedronWithLongestEdgeTest() method. **/
   @Test public void findIcosahedronWithLongestEdgeTest() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      Icosahedron result = iList.findIcosahedronWithLongestEdge();
      Assert.assertEquals("Error: ", iArray[2], result);
   }
   /** A test for findIcosahedronWithLongestEdgeTest() method. **/
   @Test public void findIcosahedronWithLongestEdgeTest2() {
      Icosahedron[] iArray2 = new Icosahedron[0];
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray2, 0);
      iList2.numberOfIcosahedrons();
      Assert.assertEquals("Error: ", null,
          iList2.findIcosahedronWithLongestEdge());
   }
     /** A test for findIcosahedronWithSmallestVolumeTest() method. **/
   @Test public void findIcosahedronWithSmallestVolume1() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Small", "blue", 423);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      Icosahedron result = iList.findIcosahedronWithSmallestVolume();
      Assert.assertEquals("Error: ", iArray[1], result);
   }
   /** A test for findIcosahedronWithSmallestVolumeTest() method. **/
   @Test public void findIcosahedronWithSmallestVolume2() {
      Icosahedron[] iArray2 = new Icosahedron[0];
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray2, 0);
      iList2.numberOfIcosahedrons();
      Assert.assertEquals("Error: ", null,
          iList2.findIcosahedronWithSmallestVolume());
   }
     /** A test for findIcosahedronWithLargestVolumeTest() method. **/
   @Test public void findIcosahedronWithLargestVolume1() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Small", "blue", 0.01);
      iArray[1] = new Icosahedron("Medium", "orange", 12.3);
      iArray[2] = new Icosahedron("Large", "white", 123.4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      Icosahedron result = iList.findIcosahedronWithLargestVolume();
      Assert.assertEquals("Error: ", iArray[2], result);
   }
   /** A test for findIcosahedronWithLargestVolumeTest() method. **/
   @Test public void findIcosahedronWithLargestVolume2() {
      Icosahedron[] iArray2 = new Icosahedron[0];
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray2, 0);
      iList2.numberOfIcosahedrons();
      Assert.assertEquals("Error: ", null,
          iList2.findIcosahedronWithLargestVolume());
   }
}