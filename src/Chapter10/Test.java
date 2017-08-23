package Chapter10;

import java.util.Arrays;

/**
 * Created by sf on 2017/8/22.
 */
public class Test {


    public static void main(String[] args) {
     String s1=String.format("%5d%4f,%7s",123,23.4,"herllo");
        System.out.println(s1);
        StringBuilder s=new StringBuilder("hello");
        System.out.println(s.length());
        System.out.println(s.capacity());
        s.setLength(2);
        System.out.println(s.capacity());
        System.out.println(s);
        s.trimToSize();
        System.out.println(s.capacity());
    }
}
