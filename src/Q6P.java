import javax.swing.*;

public class Q6P {
    public static void main(String[] args){
        String date= JOptionPane.showInputDialog(null,"put date(yyyy-MM-dd)");
        int month;
        month=Integer.parseInt(date.substring(5,7));
        //        3-5 ,6-8, 9-11, 12-2

        if (month<=5 && month>=3){
            JOptionPane.showMessageDialog(null, "봄입니다.");
        }

        else if (month<=8 && month>=6){
            JOptionPane.showMessageDialog(null, "여름입니다.");
        }

        else if (month<=11 && month>=9){
            JOptionPane.showMessageDialog(null, "가을입니다.");
        }
        else{
            JOptionPane.showMessageDialog(null, "겨울입니다.");
        }

    }
}
