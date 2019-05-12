/** 
 * Contains customers info, such as name,location, and amount they have.
 *
 * @author Tae Myles
 * @version 10/29/18
 */
public class Customer implements Comparable<Customer> {
   //field
   private String name;
   private String location;
   private double balance;
   
/** 
 * Constructor.
 *
 * @param nameIn as String
 */
   public Customer(String nameIn)
   {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
/** 
 * Sets location.
 *
 * @param locationIn as String.
 */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
/** 
 * Changes balance.
 *
 * @param amount as double.
 */
   public void changeBalance(double amount) {
      balance += amount;
   }
/** 
 * Gets the location.
 *
 * @return location
 */
   public String getLocation() {
      return location;
   }
/** 
 * Gets the balance.
 *
 * @return balance
 */
   public double getBalance() {
      return balance;
   }
/** 
 * Sets the location.
 *
 * @param city as String.
 * @param state as String.
 */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
/** 
 * toString with name location and balance of a customer.
 *
 * @return b
 */
   public String toString() {
      String b = name + "\n" + location + "\n" + "$" + balance;
      return b;
   }
/** 
 * Compares of balance highest to lowest.
 *
 * @param obj as Customer.
 * @return 0, -1, 1
 */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      
      else {
         return 1;
      }
   }
}