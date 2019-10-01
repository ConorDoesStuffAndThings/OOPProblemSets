//exerciseFour.java
/* This program asks the user to enter first, middle and surname and
then outputs the number of characters in the name, the inital of the first name,
the name in capital letters and the surname on its own*/

import javax.swing.*;

public class exerciseFour {
    public static void main(String args[]){

        String usersName= JOptionPane.showInputDialog("Please enter your first, middle and surname");

        JOptionPane.showMessageDialog(null, "The number of characters in the name is " + usersName.length() +
                "\nThe initial of the firstname is " + usersName.charAt(0) + "\nThe name in caps is " + usersName.toUpperCase()+
                "\nThe surname on its own is " + usersName.substring(usersName.lastIndexOf(" ")));

    }
}
