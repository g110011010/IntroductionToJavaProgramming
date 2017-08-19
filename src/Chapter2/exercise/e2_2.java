package Chapter2.exercise;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 * 读入圆柱体的半径和高
 * 计算圆柱体的体积
 */
public class e2_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the radius and heifht of cylinder:");
        double cylinderRadius=input.nextDouble();
        double cylinderHeight=input.nextDouble();
        System.out.println("the volume is "+cylinderRadius*cylinderRadius*3.1415926*cylinderHeight);
    }
}
