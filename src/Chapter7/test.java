package Chapter7;

import java.util.Arrays;

/**
 * Created by sf on 2017/8/20.
 */

public class test {
    /**
     *将数组中的元素打印输出
     *@param array 要打印的数组
     *@author sf
     */
    public static void printArray(int...array){
        for(int e:array){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int[] a={1,4,2,5,2,6,3,67,23,523,62,46,7};
        System.out.println("Array a:"+ Arrays.toString(a));
        int[] b=a.clone();
//        对整个数组进行排序
        Arrays.sort(b);
        System.out.println("Array b:"+Arrays.toString(b));
        int[] c=a.clone();
//        对数组进行部分排序
        Arrays.sort(c,2,7);
        System.out.println("Array c:"+Arrays.toString(c));
        int[] d=a.clone();

        //        对整个数组进行排序
        Arrays.parallelSort(d);//使用与sort()方法类似，但是当电脑有多个处理器的时候，这种方法更加高效
        System.out.println("Array b:"+Arrays.toString(d));
        int[] e=a.clone();
//        对数组进行部分排序
        Arrays.parallelSort(e,2,7);
        System.out.println("Array c:"+Arrays.toString(e));
//        二分查找数组中的关键字
        System.out.println(Arrays.binarySearch(a,2));
        int[] f=a.clone();
        System.out.println(Arrays.equals(a,f));//true
        System.out.println(Arrays.equals(a,e));//false

        int[] g=new int[8];
        int[] h=g.clone();
        Arrays.fill(g,8);//将8填充满整个的数组
        System.out.println(Arrays.toString(g));
        Arrays.fill(h,2,5,6);//将8填充到数组2,3,4位置上
        System.out.println(Arrays.toString(h));
    }
}
