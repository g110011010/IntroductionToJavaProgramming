package Chapter9;

import java.util.Date;
import java.util.Random;

/**
 * Created by sf on 2017/8/22.
 */
public class Test {
    public static void main(String[] args) {
        int a=4;
        switch (a){
            case 1:
                System.out.println("hello");
                break;
            case 4:
                System.out.println("a");
                break;
                default:
        }
        System.out.println(Math.round((double)3.45));
        System.out.println("hello".replaceAll("ell","hsello"));
    }
}
