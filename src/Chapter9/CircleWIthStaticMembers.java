package Chapter9;

/**
 * Created by sf on 2017/8/22.
 */
public class CircleWIthStaticMembers {
    double radius;
    static int numberOfObjects=0;
    CircleWIthStaticMembers(){
        radius=1;
        numberOfObjects++;
    }
    CircleWIthStaticMembers(double radius){
        this.radius=radius;
        numberOfObjects++;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
