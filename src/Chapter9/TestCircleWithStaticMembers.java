package Chapter9;

/**
 * Created by sf on 2017/8/22.
 */
public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println(CircleWIthStaticMembers.getNumberOfObjects());
        CircleWIthStaticMembers c1=new CircleWIthStaticMembers();
        System.out.println(CircleWIthStaticMembers.getNumberOfObjects());
        System.out.println(c1.getArea());
        CircleWIthStaticMembers c2=new CircleWIthStaticMembers(10);
        System.out.println(CircleWIthStaticMembers.getNumberOfObjects());
        System.out.println(c2.getArea());
    }
}
