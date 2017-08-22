package Chapter9;

import java.util.Date;
import java.util.Random;

/**
 * Created by sf on 2017/8/22.
 */
public class Test {
    Test(int a){
        System.out.println("hello,"+a);
    }
    Test(double a){
        System.out.println("hello,"+a);
    }
    Test(){
        this(1);//必须是第一个语句，所以在一个构造方法中只能调用本类的一个重载构造方法
    }
    public static void main(String[] args) {
       Test test=new Test();
    }
}
