package Chapter11;

import javafx.scene.shape.Circle;

/**
 * Created by sf on 2017/8/23.
 */
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double radius;
    public CircleFromSimpleGeometricObject(double radius){
        this.radius=radius;
    }
    public CircleFromSimpleGeometricObject(){
        this(1.0);
    }
    public CircleFromSimpleGeometricObject(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }
    public double getDiameter(){
        return radius*2;
    }
    public void printCircle(){
        System.out.println(super.toString());
    }
}
