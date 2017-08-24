package Chapter12;

/**
 * Created by sf on 2017/8/24.
 */
public class InvalidRadiusException extends Exception {
    private double radius;
    public InvalidRadiusException(double radius){
        super("Invalid radius:"+radius);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
}
