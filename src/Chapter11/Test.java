package Chapter11;

import com.sun.javafx.font.t2k.T2KFactory;

import java.io.IOException;

/**
 * Created by sf on 2017/8/23.
 */
public class Test {
    public static void main(String[] args) {
        Test1 t=new Test2();
        if(t instanceof Test2) {
            Test2 t2 = (Test2) t;
            try {
                t2.function1();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
class Test1 {
    public Test1(){
//        this.toString1();
    }
    public  String toString(){
        System.out.println("Test1.toString");
        return null;
    }
    public void function1() throws IOException{
        System.out.println("Test1.function1");
    }
}
class Test2 extends Test1 {
    public Test2(){
//        this.toString1();
    }
    public  String toString() throws ArithmeticException{
        System.out.println("Test2.toString");
        return null;
    }
    public void function1() throws IOException{
        System.out.println("Test2.function1");
    }
}
class Test3 extends Test2{
    public Test3(){
//        toString1();
    }
    public  String toString1(){
        System.out.println("Test3.toString");
        return null;
    }
}