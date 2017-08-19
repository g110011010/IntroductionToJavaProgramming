package Chapter4;
import mode.MathExtend;
import mode.Translate;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/18.
 */
public class ComputeAngles {
    /**
    *计算三角形边a对应角A的度数
    *@param a 边a的长度
     *         @param b1 邻边b1的长度
     *                  @param b2 邻边c的长度
    *@return 以度为单位的角度
    *@author sf
    */

    public double computeAngles(double a,double b1,double b2){
        return Math.toDegrees(Math.acos((MathExtend.square(a)-MathExtend.square(b1)-MathExtend.square(b2))/(-2*b1*b2)));
    }
    /**
    *获取两点之间的距离
    *@param x1 点1横坐标
     *@param x2 点2横坐标
     *@param y1 点1纵坐标
     *@param y2 点2纵坐标
     *@return 两点间距离
    *@author sf
    */
    public double length(double x1,double y1,double x2,double y2){
        return Math.sqrt(MathExtend.square(Math.abs(x1-x2))+MathExtend.square(Math.abs(y1-y2)));
    }
    public void computeThreeAngles(double x1,double y1,double x2,double y2,double x3,double y3){

        double a=this.length(x1, y1, x2, y2);
        double b=this.length(x1, y1, x3, y3);
        double c=this.length(x3, y3, x2, y2);
        System.out.println("the thre angle are:"+
        this.computeAngles(a,b,c)+" "
        +this.computeAngles(b,a,c)+"　"
        +this.computeAngles(c,a,b));

    }
    public static void main(String[] args) {
        System.out.println("Enter three points:");
        Scanner input=new Scanner(System.in);
        ComputeAngles computeAngles=new ComputeAngles();
        computeAngles.computeThreeAngles(input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
    }

}
