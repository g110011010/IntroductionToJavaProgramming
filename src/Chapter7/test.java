package Chapter7;

/**
 * Created by sf on 2017/8/20.
 */
public class test {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};
        int[] b=a;
        a[0]=9;
        String[] s=new String[3];
        System.out.println(a[5]);//9
        System.out.println(b[0]);//9
        System.out.println(s[0]);
    }
}
