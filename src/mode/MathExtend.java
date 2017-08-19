package mode;

/**
 * Created by sf on 2017/8/18.
 * 用于对Math函数库进行扩充
 */
public class MathExtend {
    /**
    *返回一个数的平方
    *@param x 要求的数
    *@return x的平方
    *@author sf
    */
    public static double square(double x){
        return Math.pow(x,2);
    }
    /**
    *返回一个a,b之间的随机数
    *@return 生成的随机数
    *@author sf
    */
    public static double random(double a,double b){
        return Math.random()*(b-a)+a;
    }
    /**
    *返回一个0到a之间的随机数
    *@param
    *@return
    *@author sf
    */
    public static double random(double a){

        return random(0,a);}
    }
