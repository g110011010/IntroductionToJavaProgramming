package Chapter2.exercise;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 */
public class e2_8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT:");
        int offset=input.nextInt();
        long milliseconds=System.currentTimeMillis();
        long seconds=milliseconds/1000;
        milliseconds%=1000;
        long minutes=seconds/60;
        seconds%=60;
        long hours=minutes/60;
        minutes%=60;
        long days=hours/24;
        hours%=24;
        hours+=offset;
        System.out.println("The current time is "+hours+":"+minutes+":"+seconds+"."+milliseconds+" GMT");
    }
}
