package Chapter3;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 */
public class AdditionQuiz {
    public static void main(String[] args) {
        int num1=(int)(System.currentTimeMillis()%10);
        int num2=(int)(System.currentTimeMillis()/7%10);
        Scanner input=new Scanner(System.in);
        System.out.println("What's "+num1+" + "+num2+" ?");
        int result=input.nextInt();
        if(result==num1+num2){
            System.out.println("You are right!!!");
        }
        else{
            System.out.println("You are wrong!!!");
        }

    }
}
