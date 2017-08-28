package Chapter2.exercise;

import java.util.Scanner;

/**
 * 计算飞机起飞所需要的最短的跑道长度
 * Created by sf on 2017/8/28.
 */
public class E2_12 {
    public double getLength(double v,double a){
        return Math.pow(v,2)/(2*a);
    }

    public static void main(String[] args) {
        System.out.println("Enter speed and acceleration:");
        Scanner input=new Scanner(System.in);
        System.out.println("The min length is:"+new E2_12().getLength(input.nextDouble(),input.nextDouble()));

    }
}
