import java.util.Arrays;
import java.text.DecimalFormat;
/** 
 * Cardholder class is an abstract class from which other cardholder classes
 * are derived. It contains fields and methods that will be inherited
 * by the classes derived from Cardholder.
 *
 * @author Tae Myles
 * @version 11/08/18
 */
public abstract class Cardholder {
   protected String category;
   protected String acctNumber;
   protected String name;
   protected double prevBalance;
   protected double payment;
   protected double[] newPurchases;
   /** INTEREST_RATE set to static final double.**/
   public static final double INTEREST_RATE = 0.01;
/** 
 * Constructor.
 *
 * @param acctNumberIn takes String
 * @param nameIn takes String
 **/
   public Cardholder(String acctNumberIn, String nameIn) {
      acctNumber = acctNumberIn;
      name = nameIn;
      double[] pArray = new double[0];
   } 
/** 
 * Gets account number.
 *
 * @return accountnumber
 **/
   public String getAcctNumber() {
      return acctNumber;
   }
/** 
 * Sets account number.
 *
 * @param acctNumberIn takes String
 **/
   public void setAcctNumber(String acctNumberIn) {
      acctNumber = acctNumberIn;
   }
/** 
 * Gets name.
 *
 * @return name
 **/
   public String getName() {
      return name;
   }
/** 
 * Sets name.
 *
 * @param nameIn takes String
 **/
   public void setName(String nameIn) {
      name = nameIn;
   }
/** 
 * Gets previous balance.
 *
 * @return prevBalance
 **/
   public double getPrevBalance() {
      return prevBalance;
   }
/** 
 * Sets previous balance.
 *
 * @param prevBalanceIn takes double
 **/
   public void setPrevBalance(double prevBalanceIn) {
      prevBalance = prevBalanceIn;
   }
/** 
 * Gets payment.
 *
 * @return payment
 **/
   public double getPayment() {
      return payment;
   }
/** 
 * Sets payment.
 *
 * @param paymentIn takes double
 **/
   public void setPayment(double paymentIn) {
      payment = paymentIn;
   }
/** 
 * Gets purchases.
 *
 * @return newPurchases
 **/
   public double[] getPurchases() {
      return newPurchases;
   }
/** 
 * Sets purchases.
 *
 * @param newPurchasesIn takes double array
 **/
   public void setPurchases(double[] newPurchasesIn) {
      newPurchases = newPurchasesIn;
   }
/** 
 * Adds purchases.
 *
 * @param newPurchasesIn takes double
 **/
   public void addPurchases(double...newPurchasesIn) {
      int originalLength;
      if (newPurchases == null) {
         originalLength = 0;
         newPurchases = newPurchasesIn;
      }
      
      else {
         originalLength = newPurchases.length; 
         newPurchases = Arrays.copyOf(newPurchases, 
            originalLength + newPurchasesIn.length);
               
         for (int i = 0; i < newPurchasesIn.length; i++) {
            newPurchases[i + originalLength] = newPurchasesIn[i];  
         }
      }
   }
/** 
 * Delete single purchase.
 *
 * @param single takes double
 **/
   private void deleteSingle(double single) {
      for (int i = 0; i < newPurchases.length; i++) {
         if (newPurchases[i] == single) {
            for (int j = i; j < newPurchases.length - 1; j++) {
               newPurchases[j] = newPurchases[j + 1];
            }
            newPurchases = Arrays.copyOf(newPurchases, 
               newPurchases.length - 1);  
         }
      }
   }
/** 
 * Deletes purchases.
 *
 * @param pArray takes double
 **/
   public void deletePurchases(double...pArray) {
      for (double i: pArray) {
         deleteSingle(i);
      }
   }
/** 
 * Gets interest.
 *
 * @return interest
 **/
   public double interest() {
      return (getPrevBalance() - payment) * INTEREST_RATE;
   }
/** 
 * Total purchases.
 *
 * @return sum
 **/
   public double totalPurchases() {
      double sum = 0;
      for (double purchase : newPurchases) {
         sum += purchase;
      }
      return sum;
   }
/** 
 * Gets balance.
 *
 * @return balance
 **/
   public double balance() {
      return getPrevBalance() * INTEREST_RATE + totalPurchases();
   }
/** 
 * Gets current balance.
 *
 * @return current balance
 **/
   public double currentBalance() {
      return getPrevBalance() - getPayment() + interest() + totalPurchases();
   }
/** 
 * Gets minimum payment.
 *
 * @return minimum payment
 **/
   public double minPayment() {
      return currentBalance() * 0.03;
   }
   
/** 
 * toString with customers information.
 *
 * @return sapphire
 **/
   public String toString() {
      DecimalFormat f1 = new DecimalFormat("$#,##0.00");
      DecimalFormat f2 = new DecimalFormat("#,##0");
      String sapphire = "";
      sapphire += category;
      sapphire += "\nAcctNo/Name: " + getAcctNumber() + " " + getName();
      sapphire += "\nPrevious Balance: " + f1.format(getPrevBalance());
      sapphire += "\nPayment: " + "(" + f1.format(getPayment()) + ")";
      sapphire += "\nInterest: " + f1.format(interest());
      sapphire += "\nNew Purchases: " + f1.format(totalPurchases());
      sapphire += "\nCurrent Balance: " + f1.format(currentBalance());
      sapphire += "\nMinimum Payment: " + f1.format(minPayment());
      sapphire += "\nPurchase Points: " + f2.format(purchasePoints());
      return sapphire;
   }
/** 
 * Purchase points.
 *
 * @return int 
 **/
   public abstract int purchasePoints();
}