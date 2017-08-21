package Chapter7;

/**
 * Created by sf on 2017/8/20.
 */

public class test {
    /**
     *将数组中的元素打印输出
     *@param array 要打印的数组
     *@author sf
     */
    public static void printArray(int[] array){
        for(int e:array){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};
        int[] b=a;//a与b 指向同一个数组对象
        //使用循环语句逐个的复制数组中的元素
        int[] c=new int[a.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        //使用System类中的静态方法arraycopy复制数组
        int srcPoint=0;//源数组中复制元素的起始位置
        int tarPoint=0;//目标数组中复制元素的起始位置
        int length=a.length;//从源数组中复制元素的个数
        int[] d=new int[a.length];
        System.arraycopy(a,srcPoint,d,tarPoint,length);
        //使用clone方法
        int[] e=new int[a.length];
        e=a.clone();
        System.out.println("a:");
        test.printArray(a);
        System.out.println("b:");
        test.printArray(b);System.out.println("c:");
        test.printArray(c);System.out.println("d:");
        test.printArray(d);System.out.println("e:");
        test.printArray(e);


    }
}
