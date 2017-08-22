package Chapter9.exercise.E9_5;

import java.util.GregorianCalendar;

/**
 * Created by sf on 2017/8/22.
 */
public class GetDate {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar=new GregorianCalendar();
        System.out.printf("%4d年%2d月%2d日",gregorianCalendar.get(GregorianCalendar.YEAR),gregorianCalendar.get(GregorianCalendar.MONTH),gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
        gregorianCalendar.setTimeInMillis(1234567898765L);
        System.out.printf("%4d年%2d月%2d日",gregorianCalendar.get(GregorianCalendar.YEAR),gregorianCalendar.get(GregorianCalendar.MONTH),gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
