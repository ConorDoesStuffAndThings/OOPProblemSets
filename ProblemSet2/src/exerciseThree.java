import javax.swing.*;

//exerciseThree
/*This program calculates the cost of carpeting a room wall
to wall*/
public class exerciseThree {
    public static void main(String args[]){

        JTextArea myTextArea = new JTextArea(10, 20);
        myTextArea.setEditable(false);


        String usersName = JOptionPane.showInputDialog("Please enter your name");

        float lengthOfRoom = Float.parseFloat(JOptionPane.showInputDialog("Please enter the length of the room"));

        float breadthOfRoom = Float.parseFloat(JOptionPane.showInputDialog("Please enter breadth of the room"));

        float carpetCostPerSquareMetre = Float.parseFloat(JOptionPane.showInputDialog("Please enter cost of carpet per square metre"));

        myTextArea = new JTextArea("Quotation for " + usersName + "\nLength of room:\t\t\t" + lengthOfRoom + " m " +
                "\nBreadth of room:\t\t" + breadthOfRoom + " m " + "\ntotal area of the room:\t\t" + String.format("%.2f", (lengthOfRoom*breadthOfRoom)) + " sq. m." +
                "\nCost per square metre of carpet:\t" + carpetCostPerSquareMetre + "\nTotal cost of carpet:\t\t" + String.format("%.2f",(carpetCostPerSquareMetre*(lengthOfRoom*breadthOfRoom))) + " euro");
        JOptionPane.showMessageDialog(null,myTextArea);

    }
}
