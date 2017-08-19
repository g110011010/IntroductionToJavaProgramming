package Chapter3;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 */
public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a integer:");
        int num=input.nextInt();
        if(num%5==0){
            System.out.println("HiFive");
        }
        if(num%2==0);
        {
            System.out.println("HiEven");
        }
    }
}
