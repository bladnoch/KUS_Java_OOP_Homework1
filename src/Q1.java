/*
        Q1.java
        Separate input and show it on the console
        3-25-2023
        Dounguk Kim
 */

import javax.swing.*;

public class Q1 {
    public static void main(String[] args){
        int IDLength, sum;
        String studentID;

        sum=0;
//        input
        String info= JOptionPane.showInputDialog(null, "Enter your name & student ID (i.e Minseok Seo/12345678:");

//        calc.
        IDLength=info.substring((info.indexOf("/")+1),info.length()).length();
        studentID=info.substring((info.indexOf("/")+1),info.length());

        for(int i = 0; i< IDLength;i++){
            sum+=Integer.parseInt(studentID.substring(i,i+1));
        }

//         output
        System.out.println("Hello OPP World! "+(info.substring(0,info.indexOf("/"))));
        System.out.println("The sum of each number of your student number entered is "+sum);
    }
}
