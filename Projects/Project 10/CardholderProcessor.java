import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;  
/** 
 * The CardholderProcessor class provides methods for reading in the data
 * file and generating the monthly reports. 
 *
 * @author Tae Myles
 * @version 11/26/18
 **/
public class CardholderProcessor {
   private static int arrayIndex = -1;
   private Cardholder[] holderArr;
   private String[] stringArr;
   
/** 
 * Constructor.
 **/
   public CardholderProcessor() {
      stringArr = new String[0];
   }
/** 
 * Gets card holders array.
 *
 * @return holderArr
 **/
   public Cardholder[] getCardholdersArray() {
      return holderArr;
   }
/** 
 * Gets invalid records array.
 *
 * @return stringArr
 **/
   public String[] getInvalidRecordsArray() {
      return stringArr;
   }
   
/** 
 * Adds card holder.
 *
 * @param obj takes in Cardholder
 **/
   public void addCardholder(Cardholder obj) {
      arrayIndex++;
      holderArr[arrayIndex] = obj;
   }
   
   
/** 
 * Sets array.
 *
 * @param fileName takes String
 **/
   public void setArray(String fileName)
   {
      
      File file = new File(fileName);
      Scanner scanFile1 = null;
      try {
         scanFile1 = new Scanner(file);
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
      int size = 0;
      while (scanFile1.hasNextLine()) {
         scanFile1.nextLine();
         size++;
      }
      holderArr = new Cardholder[size];
      scanFile1.close();
     
   }
/** 
 * Gets array size.
 *
 * @return array length.
 **/
   public int getArraySize()
   {
      return holderArr.length;
   }
/** 
 * Add invalid records.
 *
 * @param str takes String 
 **/
   public void addInvalidRecord(String str) {
      stringArr = Arrays.copyOf(stringArr, stringArr.length + 1);
      stringArr[stringArr.length - 1] = str;
   }
/** 
 * Reads file.
 *
 * @param fileName takes String
 * @throws FileNotFoundException shows error
 **/
   public void readCardholderFile(String fileName) throws FileNotFoundException 
   {     
   	  
      File file = new File(fileName);
      Scanner scanFile1 = new Scanner(file);
      int size = getArraySize();
      holderArr = new Cardholder[size];  
      
      String line = "";
      Cardholder obj;
      
      while (scanFile1.hasNext()) {
         line = scanFile1.nextLine();
         String[] temp = line.split(";");
         
         String category = temp[0];
         String acctNumber = temp[1];
         String name = temp[2];        
         double previousBalance = Double.parseDouble(temp[3]);         
         double payment = Double.parseDouble(temp[4]);
            
         switch (category) {
            case "1":
               obj = new SapphireCardholder(acctNumber, name);
               obj.setAcctNumber(acctNumber);
               obj.setName(name);
               obj.setPrevBalance(previousBalance);
               obj.setPayment(payment);
               obj.interest();
               int k = 0;
               int p = 5;
               double[] singleArr = new double[temp.length - 5];
               while (k < singleArr.length) {
                  double singlePurchase = Double.parseDouble(temp[p]);
                  singleArr[k] = singlePurchase;
                  k++;
                  p++;
               
                     
               } 
               obj.addPurchases(singleArr);
               obj.getPurchases();
               obj.currentBalance();
               obj.minPayment();
               obj.purchasePoints();
               addCardholder(obj);
                  
               break;
                     
            case "2":
               obj = new DiamondCardholder(acctNumber, name);
               obj.setAcctNumber(acctNumber);
               obj.setName(name);
               obj.setPrevBalance(previousBalance);
               obj.setPayment(payment);
               obj.interest();
               int x = 0;
               int y = 5;
               double[] singleArr1 = new double[temp.length - 5];
               while (x < singleArr1.length) {
                  double singlePurchase = Double.parseDouble(temp[y]);
                  singleArr1[x] = singlePurchase;
                  x++;
                  y++;
               
                     
               } 
               obj.addPurchases(singleArr1);
               obj.getPurchases();
               obj.currentBalance();
               obj.minPayment();
               obj.purchasePoints();
               addCardholder(obj);
                  
                  
               break;
                     
            case "3":
               obj = new BlueDiamondCardholder(acctNumber, name);
               obj.setAcctNumber(acctNumber);
               obj.setName(name);
               obj.setPrevBalance(previousBalance);
               obj.setPayment(payment);
               obj.interest();
               int x1 = 0;
               int y1 = 5;
               double[] singleArr2 = new double[temp.length - 5];
               while (x1 < singleArr2.length) {
                  double singlePurchase = Double.parseDouble(temp[y1]);
                  singleArr2[x1] = singlePurchase;
                  x1++;
                  y1++;
               
                     
               } 
               obj.addPurchases(singleArr2);
               obj.getPurchases();
               obj.currentBalance();
               obj.minPayment();
               obj.purchasePoints();
               addCardholder(obj);
                  
                  
                  
               break;
                  
            default:
                  
                  
         }
         
         
      }
   
      scanFile1.close();
      
   }  
/** 
 * Generates report.
 *
 * @return report
 **/
   public String generateReport() {
      String report = "";
      report += "----------------------------"
            + "\nMonthly Cardholder Report\n"
            + "----------------------------\n";
      for (int i = 0; i <= arrayIndex; i++) {
         if (holderArr[i] != null) {
            report += holderArr[i].toString();
         }
      }
         
      
      return report;
   }
/** 
 * Generates report by name.
 *
 * @return reportByName 
 **/
   public String generateReportByName() {
      String reportByName = "";
      Cardholder[] cardHolderTemp = new Cardholder[arrayIndex + 1];
      for (int i = 0; i <= arrayIndex; i++)
      {
         cardHolderTemp[i] = holderArr[i];
      }
      reportByName += "----------------------------\n"
            + "Monthly Cardholder Report (by Name)\n"
            + "----------------------------\n\n";
   
      Arrays.sort(cardHolderTemp);
      for (int i = 0; i <= arrayIndex; i++) {
         reportByName += cardHolderTemp[i].toString();
      }
      return reportByName;
   }
/** 
 * Generates report by current balance.
 *
 * @return reportByBalance 
 **/
   public String generateReportByCurrentBalance() {
      String reportByBalance = "";
      Cardholder[] cardHolderTemp = new Cardholder[arrayIndex + 1];
      for (int i = 0; i <= arrayIndex; i++)
      {
         cardHolderTemp[i] = holderArr[i];
      }
      
      reportByBalance += "----------------------------"
            + "\nMonthly Cardholder Report (by Current Balance)"
            + "\n----------------------------\n"; 
      
      Arrays.sort(cardHolderTemp, new CurrentBalanceComparator());
      for (int i = 0; i <= arrayIndex; i++) {
         reportByBalance += cardHolderTemp[i].toString(); 
         
      }
      return reportByBalance;
   }
}