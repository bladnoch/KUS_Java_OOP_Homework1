import javax.swing.*;

public class Q1P {
    public static void main(String[] args){
        String info= JOptionPane.showInputDialog(null, "name/num");
        int temp=0;
        String name=info.substring(0,info.indexOf("/"));
        String num=info.substring(info.indexOf("/")+1,info.length());
        for (int i =0;i<num.length();i++){
            int te=0;
            temp+=Integer.parseInt(num.substring(i,i+1));
//            System.out.println(temp);
        }

        System.out.println("Hello OOP world! "+name);
        System.out.println("The sum of each number of your studnet number entered is "+temp);

    }
}
