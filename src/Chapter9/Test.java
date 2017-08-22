package Chapter9;

import java.util.Date;
import java.util.Random;

/**
 * Created by sf on 2017/8/22.
 */
public class Test {
    public static void main(String[] args) {
        Random random=new Random(1000);
        for(int i=0;i<10;i++){
            System.out.printf("%4d ",random.nextInt(1000));
        }
        System.out.println();
        Random random1=new Random(1000);
        for(int i=0;i<10;i++){
            System.out.printf("%4d ",random1.nextInt(1000));
        }
    }
}
