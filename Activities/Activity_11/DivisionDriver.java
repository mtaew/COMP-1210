import javax.swing.JOptionPane;
/**
 * DivisionDriver class catches the error and to display.
 *
 * @author Tae Myles
 * @version 11/26/18
 **/
public class DivisionDriver {
/**
  * Catches the error and prints out the error message.
  * @param args not used.
  **/
   public static void main(String[] args) {
      
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput = JOptionPane.showInputDialog("Enter the denominator:");
      try {  
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
         
         JOptionPane.showMessageDialog(null, result,
            "result,", JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numberical values only.", 
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e, 
            "Error", JOptionPane.ERROR_MESSAGE);
      }
   }
}