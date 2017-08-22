package Chapter8;

import Chapter4.ComputeAngles;

import java.util.Scanner;

/**
 * 找出最近的点对
 * Created by sf on 2017/8/21.
 */
public class FindNearestPoints {
    public static void main(String[] args) {
        double points[][]=new double[8][2];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<points.length;i++){
            for(int j=0;j<points[0].length;j++){
                points[i][j]=input.nextDouble();
            }
        }
        double minLength=Double.MAX_VALUE;
        int point1=0;
        int point2=0;
        ComputeAngles computeAngles=new ComputeAngles();
        for(int i=0;i<points.length-1;i++){
            for(int j=i+1;j<points.length;j++){
                double length=computeAngles.length(points[i][0],points[i][1],points[j][0],points[j][1]);
                if(minLength>length){
                    minLength=length;
                    point1=i;
                    point2=j;
                }
            }
        }
        System.out.println("(" +points[point1][0]+","+points[point1][1]+
                ") and (" +points[point2][0]+","+points[point2][1]+
                ") has the shortest length:"+minLength);
    }
}
