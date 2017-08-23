package Chapter11;

import java.util.ArrayList;

/**
 * Created by sf on 2017/8/23.
 */
public class CastingDemo {
    public static void displayObject(Object o){
        if(o instanceof CircleFromSimpleGeometricObject){
            System.out.println("The circle area is:"+((CircleFromSimpleGeometricObject)o).getArea());
        }
        else if(o instanceof RectangleFromSimpleGeometricObject){
            RectangleFromSimpleGeometricObject r=(RectangleFromSimpleGeometricObject) o;
            System.out.println("The rectangle area is:"+r.getArea());
        }
    }

    public static void main(String[] args) {
        Object o1=new CircleFromSimpleGeometricObject(10);
        Object o2=new RectangleFromSimpleGeometricObject(5,8);
        displayObject(o1);
        displayObject(o2);
    }
}
