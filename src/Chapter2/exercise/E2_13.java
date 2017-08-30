package Chapter2.exercise;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/28.
 */
public class E2_13 {
    public static void main(String[] args) {
        final double RATE=0.05;
        System.out.println("Enter the monthly saving amount:");
        Scanner input=new Scanner(System.in);
        double money=input.nextDouble();
//        存储某一个月之后账户总额
        double monthTotal=0;
        for(int i=0;i<6;i++){
            monthTotal=(money+monthTotal)*(1+RATE/12);
        }
        System.out.println("Total:"+monthTotal);
    }
}
