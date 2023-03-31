import javax.swing.*;

public class Q3P {
    final static double CURRENCY=1295.85;
    public static void main(String[] args){
        int check= Integer.parseInt(JOptionPane.showInputDialog(null, "put Won you have"));

        check=check/(int)CURRENCY;

        JOptionPane.showMessageDialog (null,check);

    }
}
