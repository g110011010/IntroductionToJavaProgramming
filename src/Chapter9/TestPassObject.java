package Chapter9;

/**
 * Created by sf on 2017/8/22.
 */
public class TestPassObject {

    public static void testPassObiect(PassObiect passObiect){
        System.out.println(passObiect.getA());
        passObiect.setA(111);
    }

    public static void main(String[] args) {
        PassObiect passObiect=new PassObiect();
        passObiect.setA(3);
        testPassObiect(passObiect);
        System.out.println(passObiect.getA());
    }

}
class PassObiect{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
