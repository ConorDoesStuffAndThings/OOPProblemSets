import javax.swing.*;

public class exercise6 {
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null, cube());;
    }// end of main method

    public static JTextArea cube(){
        JTextArea myTextArea = new JTextArea(17, 20);
        myTextArea.setEditable(false);
        myTextArea = new JTextArea("Number \tCube\n-----------\t------------" + "\n");

        for(int i=0; i < 16; i++){

            double iCubed = (i*i*i);
            myTextArea.append(i +"\t" + iCubed + "\n");

        } // end for loop


        return myTextArea;

    }//end of cube method
}// end of public class
