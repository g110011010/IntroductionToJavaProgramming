package mode;

/**
 * Created by sf on 2017/8/18.
 * 日期相关的一些方法
 */
public class Calendar {
    /**
     * 根据月份输入其对应的英文
     *
     * @param month 数字月份
     * @return 英文月份
     * @author sf
     */
    public static String month(int month) {

        String result = "";
        switch (month) {
            case 1:result="Jan";
                break;
            case 2:result="Feb";
                break;
            case 3:result="Mar";
                break;
            case 4:result="Apr";
                break;
            case 5:result="May";
                break;
            case 6:result="Jun";
                break;
            case 7:result="Jul";
                break;

            case 8:result="Aug";            break;

            case 9:result="Sep";            break;


            case 10:result="Oct";            break;

            case 11:result="Nov";            break;

            case 12:result="Dec";            break;

            default: result="you have a wrong number!";


        }
        return result;
    }
    /**
     * 根据星期输入其对应的英文
     *
     * @param day 数字星期
     * @return 英文星期
     * @author sf
     */
    public static String week(int day){
        String result="";
        switch(day){
            case 0:result="Sunday";
            break;
            case 1:result="Monday";
            break;
            case 2:result="Tuesday";
            break;
            case 3:result="Wednesday";
            break;
            case 4:result="Thursday";
            break;
            case 5:result="Friday";
            break;
            case 6:result="Saturday";
            break;
            default:result="you have a wrong number";
        }
        return result;
    }
}
