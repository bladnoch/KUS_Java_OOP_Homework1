/*
    Q6.java
    Calculate Season
    3-26-2023
    Dounguk Kim
 */
import javax.swing.*;


public class Q6 {
    public static void main(String[] args){
        int getMonth;

//      input
        String getDate= JOptionPane.showInputDialog(null, "input (yyyy-MM-DD) ");

//      calc.
        getMonth=Integer.parseInt(getDate.substring(getDate.indexOf("-")+1,getDate.indexOf("-")+3));


//      output
        if (getMonth<=5 && getMonth>=3){
            JOptionPane.showMessageDialog(null, "봄입니다.");
        }
        else if (getMonth<=8 && getMonth>=6){
            JOptionPane.showMessageDialog(null, "여름입니다.");
        }
        else if (getMonth<=9 && getMonth>=11){
            JOptionPane.showMessageDialog(null, "가을입니다.");
        }
        else{
            JOptionPane.showMessageDialog(null, "겨울입니다.");
        }


    }
}
