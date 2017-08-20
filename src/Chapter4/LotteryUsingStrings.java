package Chapter4;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/19.
 */
public class LotteryUsingStrings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int lottery=(int)(Math.random()*100);
        int lotteryDigit1=lottery/10;
        int lotteryDigit2=lottery%10;
        String s=""+lotteryDigit1+lotteryDigit2;
        System.out.println("Enter one number:");
        String guessStr=input.next();
        int guess=Integer.parseInt(guessStr);
        int guessDigit1=guess/10;
        int guessDigit2=guess%10;
        System.out.println("The result is "+lottery);
        if(lottery==guess){
            System.out.println("you earn $10000");
        }
        else if(lotteryDigit1==guessDigit2 &&
                lotteryDigit2==guessDigit1){
            System.out.println("you earn $3000");
        }
        else if(lotteryDigit1==guessDigit1 ||
                lotteryDigit1==guessDigit2 ||
                lotteryDigit2==guessDigit1 ||
                lotteryDigit2==guessDigit2
                ){
            System.out.println("you earn $1000");
        }
        else{
            System.out.println("you earn nothing");
        }
    }
}
