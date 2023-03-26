/*
    Q5.java
    Having mininum bills
    3-26-2023
    Dounguk Kim
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] money2= new int[9];
        String[] money= {"50000","10000","5000","1000","500","100","50", "10","1"};


//      input
        System.out.println("input your money:");
        money2[8]=sc.nextInt();

//      calc.
        money2[0]=money2[8]/50000;
        money2[8]-=money2[0]*50000;

        money2[1]=money2[8]/10000;
        money2[8]-=money2[1]*10000;

        money2[2]=money2[8]/5000;
        money2[8]-=money2[3]*5000;

        money2[3]=money2[8]/1000;
        money2[8]-=money2[3]*1000;

        money2[4]=money2[8]/500;
        money2[8]-=money2[4]*500;

        money2[5]=money2[8]/100;
        money2[8]-=money2[5]*100;

        money2[6]=money2[8]/50;
        money2[8]-=money2[6]*50;

        money2[7]=money2[8]/10;
        money2[8]-=money2[7]*10;


//      output
        for (int i=0;i<9;i++){
            if(money2[i]!=0 ){
                System.out.println(money2[i]+"개 "+money[i]);
            }
        }

    }
}
