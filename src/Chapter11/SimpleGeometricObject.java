package Chapter11;

import java.util.Date;

/**
 * Created by sf on 2017/8/23.
 */
public class SimpleGeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    public SimpleGeometricObject(String color,boolean filled){
        this.color=color;
        this.filled=filled;
        dateCreated=new Date();
    }
    public SimpleGeometricObject(){
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
}
