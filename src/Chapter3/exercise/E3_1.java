package Chapter3.exercise;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 */
public class E3_1 {
    /*
    * 一元二次方程判定式
    * @param a 二次项系数
    * @param b 一次项系数
    * @param c 常数项系数
    * @return 判定式结果*/
    private static double criterion(double a,double b,double c){
        return b*b-4*a*c;
    }
    /*
    * 解一元二次方程
    * * @param a 二次项系数
    * @param b 一次项系数
    * @param c 常数项系数*/
    public static void computeQuadraticEquationWithOneUnknown(double a,double b,double c){
        double criterion=criterion(a, b, c);
        if (criterion<0){
            System.out.println("The equation has no real roots");
        }
        else if ((int)criterion==0){
            System.out.println("The equation has one root "+-b/(2*a));
        }
        else{
            System.out.println("The equation has two roots "+computeQERoots1(a, b, criterion)+" and "+computeQERoots2(a, b, criterion));
        }
    }
    private static double computeQERoots1(double a,double b,double criterion){
        return (-b+Math.pow(criterion,0.5))/(2*a);
    }
    private static double computeQERoots2(double a,double b,double criterion){
        return (-b-Math.pow(criterion,0.5))/(2*a);
    }

    public static void main(String[] args) {
        System.out.println("Enter a,b,c:");
        Scanner input=new Scanner(System.in);
        computeQuadraticEquationWithOneUnknown(input.nextDouble(),input.nextDouble(),input.nextDouble());
    }
}
