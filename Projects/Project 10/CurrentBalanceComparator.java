import java.util.Comparator;
/** 
 * The Current balance comparator compares the balance of card holders.
 *
 **/
public class CurrentBalanceComparator implements Comparator<Cardholder> {
/** 
  * Compares the current balance.
  *
  * @param c1 takes Cardholder
  * @param c2 takes Cardholder
  * @return -1, 1, 0 according to their balance 
  **/
   public int compare(Cardholder c1, Cardholder c2) {
   
      if (c1.currentBalance() > c2.currentBalance()) {
         return -1;
      }
      else if (c1.currentBalance() < c2.currentBalance()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}