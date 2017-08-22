package Chapter9;

/**
 * Created by sf on 2017/8/21.
 */
public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle s=new SimpleCircle(9);
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
        SimpleCircle s1=new SimpleCircle();
        s1.setRadius(18);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
    }
}
class SimpleCircle{
    private double radius;
    public SimpleCircle(){

    }
    public SimpleCircle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}