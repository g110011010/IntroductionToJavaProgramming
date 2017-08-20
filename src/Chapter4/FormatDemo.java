package Chapter4;

/**
 * Created by sf on 2017/8/20.
 * 输出角度或弧度，输出其对应的三角函数值
 */
public class FormatDemo {
public void formatDemo(double degree){
    double radinas=Math.toRadians(degree);
    System.out.printf("%-10d%-10.4d%-10.4d%-10.4d%-10.4\n",degree,radinas,Math.sin(radinas),Math.cos(radinas),Math.tan(radinas));
}

    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Degrees","Radians","Sine","Cosine","Tangent");

        FormatDemo formatDemo=new FormatDemo();
        formatDemo.formatDemo(30);
        formatDemo.formatDemo(60);
    }
}
