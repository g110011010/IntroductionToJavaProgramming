package Chapter7;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/20.
 */
public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the num of digits you want to input:");
        int num=input.nextInt();
        double[] numArray=new double[num];
        System.out.println("Enter digits:");
        double sum=0;
        for(int i=0;i<num;i++){
            double n=input.nextDouble();
            numArray[i]=n;
            sum+=n;
        }
        double average=sum/num;
        System.out.println("Average is"+average);
        System.out.print("Number of elements above the average is ");
        num=0;
        for(double n:numArray){
            if(n>average){
                num++;
            }
        }
        System.out.println(num);
    }
}
