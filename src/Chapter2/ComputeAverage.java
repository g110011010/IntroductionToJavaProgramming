package Chapter2;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/16.
 */
public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input three numbers:");
        double number1=input.nextDouble();
        double number2=input.nextDouble();
        double number3=input.nextDouble();
//        compute average
        double average=(number1+number2+number3)/3;
//        diaplay reault
        System.out.println("the average of "+number1+" "+number2+" and "+number3+" is "+average);
    }
}
