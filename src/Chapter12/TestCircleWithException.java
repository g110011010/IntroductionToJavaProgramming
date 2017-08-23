package Chapter12;

/**
 * Created by sf on 2017/8/23.
 */
public class TestCircleWithException {
    public static void main(String[] args) {
        try{
            CircleWithException c1=new CircleWithException(-5);
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
//            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println("excedsaf");
        }
    }
}
