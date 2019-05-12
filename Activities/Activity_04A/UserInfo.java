/**
 * Stores userInfo.
 *
 * @author Tae Myles
 * @version 09/16/18
 */
    
public class UserInfo {
/** 
 * Information is private.
 *
 * Instance variable.
 */
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
/** 
  * Constructor.
  * @param firstNameIn stores firstNameIn
  * @param lastNameIn stores lastNameIn
  */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
        
/** 
  * Methods.
  * @return toString
  */
   public String toString() {
      String output = "Name: " + firstName + " " 
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      UserInfo u = new UserInfo("Jane", "Lane");
      return output;
   }
   
 /** 
  * Sets location.
  * @param locationIn stores LocationIn.
  */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
 /** 
  * Sets age.
  * @param ageIn stores ageIn.
  * @return ageIn
  */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
 /** 
  * @return getAge
  */
   public int getAge() {
      return age;
   }
 /** 
  * @return getLocation
  */
   public String getLocation() {
      return location;
   }
 /** 
  *Status for logOff.
  */
   public void logOff() {
      status = OFFLINE;
   }
 /** 
  * Status for logOn.
  */
   public void logOn() {
      status = ONLINE;
   }
}
