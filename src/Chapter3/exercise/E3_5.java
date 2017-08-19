package Chapter3.exercise;

import mode.Calendar;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/18.
 */
public class E3_5 {
    public static void main(String[] args) {
        System.out.println("enter today's day:");
        Scanner input=new Scanner(System.in);
        int day=input.nextInt();
        System.out.println("ENter the number of days elapsed since today:");
        int num=input.nextInt();
        System.out.println("Today is "+ Calendar.week(day)+" and the future day is "+Calendar.week((day+num)%7));

    }
}
