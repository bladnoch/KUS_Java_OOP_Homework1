/*
        Q2.java
        Shows today's year,month, date, season, and recommend three seasonal food
        3-27-2023
        Dounguk Kim
 */
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws ParseException {
        int getMonth;
        String season;
        String[][] food={{"딸기", "한라봉", "장어"},{"참외", "복숭아", "포도"},{"귤","토마토", "유자"},{"한라봉"," 석류", "사과"}};
        String[] sfood=new String[3];
        Date today=new Date();
        SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");


//        input


//        calc.
        getMonth=Integer.parseInt(date.format(today).substring(date.format(today).indexOf("-")+1,date.format(today).indexOf("-")+3));

        if (getMonth<=5 && getMonth>=3){
            season="봄입니다.";
            sfood=food[0];
        }
        else if (getMonth<=8 && getMonth>=6){
            season="여름입니다.";
            sfood=food[1];
        }
        else if (getMonth<=9 && getMonth>=11){
            season="가을입니다." ;
            sfood=food[2];
        }
        else{
            season="겨울입니다.";
            sfood=food[3];
        }


//        output
        JOptionPane.showMessageDialog(null,date.format(today)+"\n"+"지금은 "+season+" 입니다.\n"+sfood[0]+", "+sfood[1]+", "+sfood[2]+"가 제철식품 입니다.");
    }
}
