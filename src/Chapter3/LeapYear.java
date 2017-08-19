package Chapter3;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        System.out.println((year%4==0 && year%100!=0)|| year%400==0);
    }
}
