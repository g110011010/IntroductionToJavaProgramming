package Chapter4;

/**
 * Created by sf on 2017/8/18.
 */
public class test {
    public static int a;
    public test(){
        this.a=12;
    }
    public static int  setA(){
       return a;
    }
    public static void main(String[] args) {
        System.out.println(test.setA());
    }
}
