import javax.swing.*;

//exercise7.java
/*This program that asks the user to input an arbitrary number of integer values (terminated by –1)
 and passes them one at a time to a user-defined method called isEven() which uses the remainder (%)
 operator to determine if an integer is even. */
public class exercise7 {
    public static void main(String args[]) {
        int number = 0;

        while (number != -1) {

            number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number!"));


        if (isEven(number) == true)
            JOptionPane.showMessageDialog(null, number + " is even!");

        if (isEven(number) == false)
            JOptionPane.showMessageDialog(null, number + " is odd!");
        //else
            //JOptionPane.showMessageDialog(null, "Error!");
    }
        System.exit(0);
    }// end of main method


    public static boolean isEven(int arbitraryNumber){
        boolean isItEven;






        if(arbitraryNumber%2==0){
            isItEven=true;
        }// end of if statement
        else{
            isItEven=false;
        }// end of else statement




        return isItEven;
    }// end of isEven method


    
}// end of public class
