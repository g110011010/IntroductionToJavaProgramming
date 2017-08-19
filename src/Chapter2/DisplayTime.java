package Chapter2;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/16.
 */
public class DisplayTime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter an integer for seconds:");
        int seconds=input.nextInt();
        int minutes=seconds/60;
        seconds=seconds%60;
        System.out.println("The time is "+minutes+" minutes, "+seconds+" seconds");
    }
}
