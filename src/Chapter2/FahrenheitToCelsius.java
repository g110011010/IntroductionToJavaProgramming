package Chapter2;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 * 华氏度与摄氏度之间相互转化
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit");
        double fahrenheit=input.nextDouble();
        double celsius=fahrenheitToCelsius(fahrenheit);
        System.out.println("fahrenheit "+fahrenheit+" is "+celsius+" in celsius");
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0/9)*(fahrenheit-32);
    }
    public static double celsiusToFahrenheit(double celsius){
        return 9.0/5*celsius+32;
    }
}
