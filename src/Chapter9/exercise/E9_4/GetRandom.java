package Chapter9.exercise.E9_4;

import java.util.Random;

/**
 * Created by sf on 2017/8/22.
 */
public class GetRandom {
    public static void main(String[] args) {
        Random random=new Random(1000);
        int num=0;
        while(num<50){
            System.out.printf("%4d",random.nextInt(100));
            num++;
        }
    }
}
