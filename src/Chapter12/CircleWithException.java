package Chapter12;

/**
 * Created by sf on 2017/8/23.
 */
public class CircleWithException {
    private double radius;
    private static int numberOfObjects=0;
    CircleWithException(){
        radius=1;
        numberOfObjects++;
    }
    CircleWithException(double radius) throws Exception {
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws Exception{
        if(radius<0){
            throw new IllegalArgumentException("The radius can't be negative");
        }
        this.radius = radius;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
