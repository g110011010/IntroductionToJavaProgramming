package Chapter2.exercise;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 */
public class e2_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate:");
        double subtotal=input.nextDouble();
        int gratuityRate=input.nextInt();
        double gratuity=subtotal*gratuityRate/100;
        System.out.println("The gratuity is $"+gratuity+" and total is $"+(gratuity+subtotal));
    }
}
