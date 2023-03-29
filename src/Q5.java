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
        int[] money= {50000,10000,5000,1000,500,100,50, 10,1};


//      input
        System.out.println("input your money:");
        money2[8]=sc.nextInt();

//      calc.

        for (int i=0;i<money.length;i++){
            money2[i]=money2[8]/money[i];
            money2[8]-=money2[i]*money[i];
        }


//      output
        for (int i=0;i<9;i++){
            if(money2[i]!=0 ){
                System.out.println(money2[i]+"개 "+money[i]);
            }
        }

    }
}
