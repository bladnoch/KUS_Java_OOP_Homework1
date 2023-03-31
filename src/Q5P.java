import java.util.Scanner;

public class Q5P {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] paper={50000,10000,5000,1000,500,100,50,10,5,1};

        System.out.println("put money you have:");
        int won=sc.nextInt();

        for (int i=0;i<paper.length;i++){
            if (won/paper[i]>=1){
                System.out.print(paper[i]+"원 "+(won/paper[i])+"개");
                System.out.println(" ");
                won=won%paper[i];
            }

        }



    }
}
