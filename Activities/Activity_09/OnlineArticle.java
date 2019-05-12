/** 
 * Online article that is a subclass of OnlineTextItem.
 *
 * @author Tae Myles
 * @version 11/02/18
 */
 
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
/**
 * Constructor. 
 *
 * @param nameIn set as String
 * @param priceIn set as double
 */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
/**
 * Sets the word count.
 *
 * @param wordCountIn set to int
 * @return wordCountIn
 */
   public int setWordCount(int wordCountIn) {
      return wordCountIn;
   }
}