package Chapter13;

import java.util.Date;

/**
 * Created by sf on 2017/8/25.
 */
public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    protected GeometricObject(String color, boolean filled){
        this.color=color;
        this.filled=filled;
        dateCreated=new Date();
    }
    protected GeometricObject(){
        this("white",false);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "color:"+color+"  isfilled:"+filled+"  dateOfCreated:"+dateCreated.toString();
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
