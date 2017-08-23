package Chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by sf on 2017/8/23.
 */
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean continueInput=true;
        do {
            try {
                int integer = input.nextInt();
                System.out.println(integer);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again,am integer is needed!");
                System.out.println((input.nextLine()));//之前用户输入的数据没有被系统接受，用户输入阻塞在输入队列中
            }
        }while(continueInput);
        System.out.println("Exit");
    }
}
