package Chapter3;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 */
public class SubtractionQuiz {
    public static void main(String[] args) {
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        System.out.println("What's "+num1+" - "+num2+" ?");
        Scanner input=new Scanner(System.in);
        int result=input.nextInt();
        if((num1-num2)==result){
            System.out.println("you are right!!!");
        }
        else{
            System.out.println("you are wrong!!!");
        }
    }
}
