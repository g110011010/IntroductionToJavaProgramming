package Chapter2;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/16.
 * 从控制台获取半径
 * 计算圆的面积
 */
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        double radius=consoleInput();
        ComputeArea.computeArea(radius);
    }
    public static double consoleInput(){
        Scanner input=new Scanner(System.in);
        System.out.println("Input a number for radius:");
        return input.nextDouble();
    }
}
