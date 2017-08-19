package Chapter2;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 * 将营业税转化为小数点后两位形式
 */
public class SalesTax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double purchaseAmount=input.nextDouble();
        double tax=purchaseAmount*0.06;
        System.out.println("Sales tax is $"+(int)(tax*100)/100.0);
    }
}
