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
   private Cardholder[] holderArr;
   private String[] stringArr;
   
/** 
 * Constructor.
 **/
   public CardholderProcessor() {
      stringArr = new String[0];
      holderArr = new Cardholder[0];
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
      holderArr = Arrays.copyOf(holderArr, holderArr.length + 1);
      holderArr[holderArr.length - 1] = obj;
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
         
         int category = Integer.parseInt(temp[0]);
         String acctNumber = temp[1];
         String name = temp[2];
         try 
         {        
            String previousBalance = temp[3];       
            String payment = temp[4];
         
                  
            switch (category) {
               case 1:
                  obj = new SapphireCardholder(acctNumber, name);
                  obj.setAcctNumber(acctNumber);
                  obj.setName(name);
                  obj.setPrevBalance(Double.parseDouble(previousBalance));
                  obj.setPayment(Double.parseDouble(payment));
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
                     
               case 2:
                  obj = new DiamondCardholder(acctNumber, name);
                  obj.setAcctNumber(acctNumber);
                  obj.setName(name);
                  obj.setPrevBalance(Double.parseDouble(previousBalance));
                  obj.setPayment(Double.parseDouble(payment));
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
                     
               case 3:
                  obj = new BlueDiamondCardholder(acctNumber, name);
                  obj.setAcctNumber(acctNumber);
                  obj.setName(name);
                  obj.setPrevBalance(Double.parseDouble(previousBalance));
                  obj.setPayment(Double.parseDouble(payment));
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
                  throw new InvalidCategoryException();
                  
            }
         
         }
         catch (InvalidCategoryException categoryExcep) {
            addInvalidRecord(line + " *** invalid category ***");
         }
         catch (NumberFormatException numberExcep) {
            addInvalidRecord(line + " *** invalid numeric value ***");
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
      String report = "---------------------------------------\n"
            + "Monthly Cardholder Report\n"
            + "---------------------------------------\n";
      for (Cardholder holder : holderArr) {
         report += holder.toString() + "\n\n";
         
      }
         
      
      return report;
   }
/** 
 * Generates report by name.
 *
 * @return reportByName 
 **/
   public String generateReportByName() {
      Cardholder[] cardHolderTemp = new Cardholder[holderArr.length];
      for (int i = 0; i < holderArr.length; i++)
      {
         cardHolderTemp[i] = holderArr[i];
      }
      String reportByName = "---------------------------------------\n"
            + "Monthly Cardholder Report (by Name)\n"
            + "---------------------------------------\n";
   
      Arrays.sort(cardHolderTemp);
      for (Cardholder holder : cardHolderTemp) {
         reportByName += holder.toString() + "\n\n";
         
      }
      return reportByName;
   }
/** 
 * Generates report by current balance.
 *
 * @return reportByBalance 
 **/
   public String generateReportByCurrentBalance() {
      Cardholder[] cardHolderTemp = new Cardholder[holderArr.length];
      for (int i = 0; i < holderArr.length; i++)
      {
         cardHolderTemp[i] = holderArr[i];
      }
      
      String reportByBalance = "---------------------------------------\n"
            + "Monthly Cardholder Report (by Current Balance)\n"
            + "---------------------------------------\n"; 
      
      Arrays.sort(cardHolderTemp, new CurrentBalanceComparator());
      for (Cardholder holder : cardHolderTemp) {
         reportByBalance += holder.toString() + "\n\n";
         
      }
      return reportByBalance;
   }
/** 
 * Generates report by invalid records.
 *
 * @return reportByInvalidRecords
 **/
   public String generateInvalidRecordsReport() {
      String reportByInvalidRecord = "---------------------------------------\n"
            + "Invalid Records Report\n"
            + "---------------------------------------\n";
      for (String holder : stringArr) {
         reportByInvalidRecord += holder.toString() + "\n\n";
         
      }
      
      return reportByInvalidRecord;
   }
}