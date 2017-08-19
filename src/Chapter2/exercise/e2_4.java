package Chapter2.exercise;

import mode.Translate;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 */
public class e2_4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number in pounds:");
        double pound=input.nextDouble();
        System.out.println(pound+" pounds is "+ Translate.poundToKilogram(pound)+"kilogram");
    }
}
