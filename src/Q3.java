/*
    Q3.java
    Convert won to dollar
    3-26-2023
    Dounguk Kim
 */
import javax.swing.*;

public class Q3 {

    final static Double CURRENCY=1295.85;

    public static void main(String[] args){
        double getWon, dollar, won;

//      input
        getWon= Double.parseDouble(JOptionPane.showInputDialog(null,"put amount of won you have: "));


//      calc.
        dollar=getWon/CURRENCY;


//      output
        JOptionPane.showMessageDialog(null, "You have "+((int)(getWon/CURRENCY))+"dollars");


    }
}
