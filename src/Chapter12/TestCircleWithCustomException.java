package Chapter12;

/**
 * Created by sf on 2017/8/24.
 */
public class TestCircleWithCustomException {
    public static void main(String[] args) {
        try{
            CircleWithCustomException c1=new CircleWithCustomException(-5);
        }
        catch (InvalidRadiusException e){
            e.getRadius();
            e.printStackTrace();
//            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println("excedsaf");
        }
    }
}

class CircleWithCustomException{
    private double radius;
    private static int numberOfObjects=0;
    CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }
    CircleWithCustomException(double radius) throws InvalidRadiusException{
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException{
        if(radius<0){
            throw new InvalidRadiusException(radius);
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