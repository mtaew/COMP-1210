/** 
 * Online book that is a subclass of OnlineTextItem.
 *
 * @author Tae Myles
 * @version 11/02/18
 */
public class OnlineBook extends OnlineTextItem {
   protected String author;
   
/**
 * Constructor. 
 *
 * @param nameIn set as String
 * @param priceIn set as double
 */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
/**
 * toString method. 
 *
 * @return string
 */
   public String toString() {
      return name + " - " + author + ": $" + calculateCost();
   }
/**
 * setAuthor method.
 *
 * @param authorIn set as author.
 */ 
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}