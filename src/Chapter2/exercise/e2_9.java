package Chapter2.exercise;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 *计算平均加速度
 */
public class e2_9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter vo,v1,t:");
        double v0=input.nextDouble();
        double v1=input.nextDouble();
        double t=input.nextDouble();
        System.out.println("The average acceleration is:"+((v1-v0)/t));
    }
}
