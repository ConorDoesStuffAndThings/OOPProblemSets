import javax.swing.*;

public class exerciseOne {
    public static void main(String args[]){
        float moneyPound=1, moneyEuro=0, conversionRate=0;

        conversionRate = Float.parseFloat(JOptionPane.showInputDialog("Please enter the conversion rate. \u00a31 is how many Euro(s)?"));

        while(moneyPound != 0)
        {
            moneyPound = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter \u00a3 <0 to exit>"));

            moneyEuro = (moneyPound*conversionRate);

            if(moneyPound==0){
                break;
            }
            else {
                JOptionPane.showMessageDialog(null, "The exchange rate is \u20ac1= \u00a3" + conversionRate + "\n \u00a3" + moneyPound + " is equal to \u20ac" + String.format("%.2f", moneyEuro));
            }




        }//End of while loop
        System.exit(0);
    }// end of main method
}//end of public class
