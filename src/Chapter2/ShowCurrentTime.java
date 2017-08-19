package Chapter2;

/**
 * Created by sf on 2017/8/17.
 * 计算当前时间
 */
public class ShowCurrentTime {
    public static void main(String[] args) {
        long milliseconds=System.currentTimeMillis();
        long seconds=milliseconds/1000;
        milliseconds%=1000;
        long minutes=seconds/60;
        seconds%=60;
        long hours=minutes/60;
        minutes%=60;
        long days=hours/24;
        hours%=24;
        System.out.println("The current time is "+hours+":"+minutes+":"+seconds+"."+milliseconds+" GMT");
    }
}
