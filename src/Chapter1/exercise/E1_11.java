package Chapter1.exercise;

/**
 * Created by sf on 2017/8/17.
 */
public class E1_11 {
    public final static long POPULASTION=312_032_486;
    public static void main(String[] args) {
        System.out.println(new E1_11().fin_population(E1_11.POPULASTION,5));
    }
    /*
    *计算一年人口的增长量
    * @param init_population 年初始人口
    * @return 年终人口
    * */
    public  long fin_population(long init_population){
        //计算一年的总秒数
        long totalSeconds=365*24*60*60;
        return init_population+totalSeconds/7+totalSeconds/45-totalSeconds/13;
    }
    /*
    * @param init_population 年初始人数
    * @param year 要计算的年数
    * @return 最终的人口
    * */

    public long fin_population(long init_population,int year){
        long fin_population=init_population;
        while(year-->0){
            fin_population=fin_population(fin_population);
        }
        return fin_population;
    }
}
