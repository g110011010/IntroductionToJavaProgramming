package Chapter12;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/23.
 */
public class Test {
    public static void f1(){
        System.out.println("Test.f1");
    }
    public static void f2(){
        Scanner input=new Scanner(System.in);
        System.out.println(input.nextLine());
    }

    public static void main(String[] args) {
        System.out.println("Test.f1");

        Scanner input=new Scanner(System.in);
        System.out.println(input.nextLine());
    }
}
