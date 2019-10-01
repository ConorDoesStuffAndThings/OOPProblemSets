import javax.swing.*;
import java.util.Arrays;

public class exercise9{
    public static void main(String[] args) {
        float cowWeight[] = new float[10];
        float totalWeight=0, lightestAnimal = 1000000;
        int twoFiftyUnderCounter=0, overFourHundredCounter=0;

        for(int i = 0; i <= cowWeight.length-1; i++){


            cowWeight[i] = Float.parseFloat(JOptionPane.showInputDialog("Please enter weight of cow " + (i+1)));
            totalWeight += cowWeight[i];

            if(cowWeight[i] < 250)
                twoFiftyUnderCounter++;

            if(cowWeight[i] > 450)
                overFourHundredCounter++;

            //cowWeight[i]+=totalWeight;

            if(cowWeight[i] < lightestAnimal)
                lightestAnimal = cowWeight[i];


        }//end of for
        float averageWeight = (float)totalWeight/cowWeight.length;
        
        JOptionPane.showMessageDialog(null, "weights: " + Arrays.toString(cowWeight) + "\nNumber under 250kg: " +
                twoFiftyUnderCounter + "\nPercentage over 400kg: " + (float)overFourHundredCounter/cowWeight.length +
                "\nLightest animal: " + lightestAnimal + "\nAverage Weight: " + averageWeight);


    }//end of main
}
