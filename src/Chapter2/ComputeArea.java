package Chapter2;

/**
 * Created by sf on 2017/8/16.
 * 计算圆的面积
 */
public class ComputeArea {
    public static void main(String[] args) {
        computeArea(20);
    }
    public static void computeArea(double radius){
        computeArea(radius,3.1415926);
    }
    public static void computeArea(double radius,double PI){
        double area;
        area=radius*radius*PI;
        System.out.println("the are for circle of radius "+radius+" is " +
                area);

    }
}
