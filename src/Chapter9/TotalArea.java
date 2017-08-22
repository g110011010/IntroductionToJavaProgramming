package Chapter9;

import java.util.Random;

/**
 * Created by sf on 2017/8/22.
 */
public class TotalArea {
    public static void main(String[] args) {
        printCircle(getArray());

    }
    public static CircleWithPrivateDateFields[] getArray(){
        CircleWithPrivateDateFields[] circleWithPrivateDateFields=new CircleWithPrivateDateFields[10];

        for(int i=0;i<circleWithPrivateDateFields.length;i++){
            circleWithPrivateDateFields[i]=new CircleWithPrivateDateFields(Math.random()*100);
        }

        return circleWithPrivateDateFields;
    }
    public static void printCircle(CircleWithPrivateDateFields[] circleWithPrivateDateFields ){
        System.out.printf("%-30s%-30s","radius","area");
        for(int i=0;i<circleWithPrivateDateFields.length;i++){
            System.out.printf("%-30f%-30f",circleWithPrivateDateFields[i].getRadius(),circleWithPrivateDateFields[i].getArea());
            System.out.println();
        }

    }
}
