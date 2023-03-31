import java.util.Scanner;

public class Q4P {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int all=0;

        int[] nums=new int[9];

        for (int i = 0;i<nums.length;i++){
            System.out.println("put num: "+ i);
            nums[i]=sc.nextInt();
            all+=nums[i];
        }

        for (int i=1;i<10;i++){

            System.out.print("  "+nums[i-1]+"  ");
            if(i%3==0){
                System.out.println(" "+(nums[count]+nums[count+1]+nums[count+1]));
                count+=3;
            }
        }
        count=0;
        for (int i=0;i<3;i++){
            System.out.print("  "+(nums[count]+nums[count+3]+nums[count+6]));
            count++;
        }
        System.out.print("  "+all);

    }
}
