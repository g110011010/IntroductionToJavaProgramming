package Chapter2.exercise;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 */
public class e2_6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int n=num/100;
        int sum=n;
        num=num-100*n;
        n=num/10;
        sum+=n;
        num=num-10*n;
        sum+=num;
        System.out.println("The total is "+sum);
    }

}
