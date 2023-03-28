/*
        Q2.java
        Shows today's year,month, date, and season in GUI
        3-27-2023
        Dounguk Kim
 */
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        int getMonth;
        String season;
        Date today=new Date();
        SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");



//        input
        Scanner sc= new Scanner(System.in);
        System.out.println("기다리는 시즌의 날짜를 입력해 주세요(yyyy-MM-dd)");
        String newDate=sc.next();


//        calc.
        getMonth=Integer.parseInt(date.format(today).substring(date.format(today).indexOf("-")+1,date.format(today).indexOf("-")+3));

        if (getMonth<=5 && getMonth>=3){
            season="봄입니다.";
        }
        else if (getMonth<=8 && getMonth>=6){
            season="여름입니다.";
        }
        else if (getMonth<=9 && getMonth>=11){
            season="가을입니다." ;
        }
        else{
            season="겨울입니다.";
        }

//        String newDate=

//        output
        JOptionPane.showMessageDialog(null,date.format(today)+"\n"+season);

    }
}
