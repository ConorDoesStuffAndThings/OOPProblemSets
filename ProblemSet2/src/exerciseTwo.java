import javax.swing.*;

public class exerciseTwo {
    public static void main (String args[]){
        JTextArea myTextArea = new JTextArea(5, 20);
        myTextArea.setEditable(false);
        myTextArea = new JTextArea("yards \tinches\n-----------\t------------" + "\n");

        for(int i=0; i < 11; i++){

            int thingy = (i*36);
            myTextArea.append(i +"\t" + thingy + "\n");

        } // end for loop
        JOptionPane.showMessageDialog(null,myTextArea);
    } // end main method
}// end public class
