package Chapter9.exercise.E9_3;

import java.util.Date;

/**
 * Created by sf on 2017/8/22.
 */
public class GetTime {
    public static void getTime(long time){
        System.out.println(new Date(time).toString());
    }

    public static void main(String[] args) {
        for(long i=10000;i<=100000000000L;i*=10){
            getTime(i);
        }
    }
}
