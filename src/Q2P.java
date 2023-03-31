import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q2P {
    public static void main(String[] args){
        Date today=new Date();
        SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
        String month= date.format(today);
        month=month.substring(6,7);
        int mth=Integer.parseInt(month);
        System.out.println(month);
        String season;
        String[][] food={{"가","나","다"}, {"라","마","바"},{"사","아","자"},{"차","카","타"}};
        String[] f=new String[3];
        //        3-5 ,6-8, 9-11, 12-2
        if (mth<=3 && mth>=5){
            f= food[0];
            season="봄입니다.";

        } else if (mth<=6 && mth>=8) {
            f= food[1];
            season="여름입니다.";
        } else if (mth<=9 && mth>=11) {
            f= food[2];
            season="가을입니다.";
        }   else {
            f= food[3];
            season="겨울입니다.";
        }



        JOptionPane.showMessageDialog(null,date.format(today)+"\n"+season+"\n"+f[0]+" "+f[1]+" "+f[2]);

    }
}
