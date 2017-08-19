package Chapter3.exercise;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/18.
 */
public class E3_3 {
    /**
    *解二元一次方程x值
    *@param
    *@return
    *@author sf
    */
    public double getx(double a1,double b1,double c1,double a2,double b2,double c2){
        return (c1*b2-c2*b1)/(a1*b2-a2*b1);
    }
    /**
    *解二元一次方程y值
    *@param
    *@return
    *@author sf
    */
    public double gety(double a1,double b1,double c1,double a2,double b2,double c2){
        return (c2*a1-c1*a2)/(a1*b2-a2*b1);
    }

    /**
    *解二元一次方程
    *@param
    *@return
    *@author
    */
    public void consoleEquation(double a1,double b1,double c1,double a2,double b2,double c2){
        if (0==a1*b2-a2*b1){
            System.out.println("The equation has no solution");
        }else
        {
            System.out.println("x is "+getx(a1, b1, c1, a2, b2, c2)+" ,and y is "+gety(a1, b1, c1, a2, b2, c2));
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a1, b1, c1, a2, b2, c2:");
        Scanner input=new Scanner(System.in);
        new E3_3().consoleEquation(input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
    }
}
