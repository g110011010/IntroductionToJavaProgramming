package Chapter3;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 */
public class TestBooleanOperators {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=input.nextInt();
        if(num%2==0 && num%3==0){
            System.out.println(num+" is divisible by 2 and 3 ");
        }
        if (num%2==0 || num%3==0){
            System.out.println(num+" is divisible by 2 or 3 ");
        }
        if (num%2==0 ^ num%3==0){
            System.out.println(num+" is divisible by 2 or 3,but not both");
        }
    }
}
