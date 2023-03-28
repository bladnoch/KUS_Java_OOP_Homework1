/*
    Q4.java
    Get nine input number and get results
    3-27-2023
    Dounguk Kim
 */

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] getNum=new int[9];
        int[] sum=new int[7];
        sum[6]=0;
        int count=0;


//        input
        for (int i = 0;i<9;i++){
            System.out.println("put " + (9-i) + " more numbers");
            getNum[i]=sc.nextInt();
            sum[6]+=getNum[i];
        }

//        calc.
        for (int i= 0; i<3;i++){
            sum[i]+=getNum[i]+getNum[i+1]+getNum[i+2];
        }
        for (int i=3;i<6;i++){
            sum[i]=getNum[i-3]+getNum[i]+getNum[i+3];
        }

//          output
        for (int i =0;i<9;i++){
            if(i%3==0 && i!=0){
                System.out.println("   "+sum[count]);
                count++;
            }
            System.out.print("   "+getNum[i]+"   ");
        }
        System.out.print("   "+sum[2]+"   ");
        System.out.println("");
        System.out.println("   "+sum[3]+"   "+"   "+sum[4]+"   "+"   "+sum[5]+"   "+"   "+sum[6]+"   ");


        sc.close();

    }
}
