package Chapter12;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/23.
 */
public class QuotientWithMethod {
    public static int quotient(int number1,int number2){
        if(number2==0){
            System.out.println("Divisor can't be zero!");
            System.exit(1);//终止当前运行的java虚拟机
        }
        return number1/number2;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        quotient(input.nextInt(),input.nextInt());
    }
}
