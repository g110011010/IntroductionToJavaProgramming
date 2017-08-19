package Chapter2.exercise;

import Chapter2.FahrenheitToCelsius;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 * 华氏度与摄氏度相互转化
 */
public class e2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("F to C(1) or C to F(2)?(1/2):");
        int modle = input.nextInt();
        if (modle == 1) {
            System.out.println("enter F :");
            double F = input.nextDouble();
            System.out.println("the F " + F + " is " + FahrenheitToCelsius.fahrenheitToCelsius(F)+ " in C");
        } else if (modle == 2) {
            System.out.println("enter C :");
            double C = input.nextDouble();
            System.out.println("the C " + C + " is " + FahrenheitToCelsius.celsiusToFahrenheit(C) + " in F");
        }
    }
}
