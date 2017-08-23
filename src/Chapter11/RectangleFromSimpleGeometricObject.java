package Chapter11;

/**
 * Created by sf on 2017/8/23.
 */
public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double width;
    private double height;
    public RectangleFromSimpleGeometricObject(double white,double height){
        this.height=height;
        this.width=white;
    }
    public RectangleFromSimpleGeometricObject(double width,double height,String color,boolean filled){
        super(color,filled);
        this.height=height;
        this.width=width;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*width*height;
    }
}
