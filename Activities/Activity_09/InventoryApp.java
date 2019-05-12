/** 
 * Driver app for InventoryItem.
 *
 * @author Tae Myles
 * @version 11/02/18
 */
public class InventoryApp {
/** 
 * Prints out certain items in the inventory.
 *
 * @param args not used
 */
   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05);
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      System.out.println("name: " + item1.name + ";" + " price: " 
         + "$" + item1.price);
      
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      System.out.println("name: " + item2.name + ";" + " price: "
         + "$" + item2.price + ";" + " weight: " + item2.weight);
      
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      System.out.println("name: " + item3.name + ";" + " price: "
         + "$" + item3.price + ";" + " wordcount: " + item3.setWordCount(700) 
         + " words");
      
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
      System.out.println("name: " + item4.name + ";" + " price: "
         + "$" + item4.price + ";" + " author: " + item4.author);
   }
}