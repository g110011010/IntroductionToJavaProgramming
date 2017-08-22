package Chapter9;

/**
 * Created by sf on 2017/8/22.
 */
public class CircleWithPrivateDateFields {
    private double radius;
    private static int numberOfObjects=0;
    CircleWithPrivateDateFields(){
        radius=1;
        numberOfObjects++;
    }
    CircleWithPrivateDateFields(double radius){
        this.radius=radius;
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
