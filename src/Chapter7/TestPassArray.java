package Chapter7;

/**
 * Created by sf on 2017/8/21.
 */
public class TestPassArray {
    public static void main(String[] args) {

                int[] a=new int[]{1,2,3,4,5};
                int[] b=a;//传递的是一个引用，a与b同时指向同一个对象
                a[0]=9;
                System.out.println(a[0]);//9
                System.out.println(b[0]);//9

    }
}
