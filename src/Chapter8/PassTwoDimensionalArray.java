package Chapter8;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/21.
 */
public class PassTwoDimensionalArray {
    /**
    *由用户输入一个二维数组中每一个元素的值
    *@return 生成的二维数组
    *@author sf
    */

    public static int[][] getArray(){
        int column=4;
        int row=3;
        Scanner input=new Scanner(System.in);
        int[][] a=new int[row][column];
        System.out.println("Enter "+a.length+"rows and "+a[0].length+" columns elementsL:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                a[i][j]=input.nextInt();
            }
        }
        return a;
    }
    /**
    *计算一个二维数组中所有元素的和
    *@param array 待求和的二维数组
    *@return 所求得的和
    *@author sf
    */

    public static int sum(int[][] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                sum+=array[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] m=getArray();
        System.out.println("The sum is "+sum(m));
    }
}
