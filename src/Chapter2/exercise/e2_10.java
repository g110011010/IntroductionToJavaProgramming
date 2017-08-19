package Chapter2.exercise;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 * 计算提升水温所需要的能量
 */
public class e2_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms:");
        double kilograms=input.nextDouble();
        System.out.println("Enter the initial temperature:");
        double initTemperature=input.nextDouble();
        System.out.println("Enter the final temperature:");
        double finTemperature=input.nextDouble();
        System.out.println("The energy needed is "+(kilograms*(finTemperature-initTemperature)*4184));
    }
}
