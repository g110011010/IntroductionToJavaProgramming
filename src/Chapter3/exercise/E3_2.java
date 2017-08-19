package Chapter3.exercise;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/18.
 */
public class E3_2 {
    public static void main(String[] args) {
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        int num3=(int)(Math.random()*10);
        Scanner input=new Scanner(System.in);
        System.out.println("What's "+num1+" + "+num2+" + " +num3+
                "?");
        int result=input.nextInt();
        if(result==num1+num2+num3){
            System.out.println("You are right!!!");
        }
        else{
            System.out.println("You are wrong!!!");
        }

    }
}
