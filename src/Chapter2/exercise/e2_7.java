package Chapter2.exercise;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 */
public class e2_7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        long minutes=input.nextLong();
        long hours=minutes/60;
        minutes%=60;
        long days=hours/24;
        hours%=24;
        long years=days/365;
        days%=365;
        System.out.println("It's "+years+" year(s) "+days+" day(s) "+hours+" hour(s) "+minutes+" minute(s)");
    }
}
