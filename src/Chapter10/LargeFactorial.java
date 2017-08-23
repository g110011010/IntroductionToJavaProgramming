package Chapter10;

import java.math.BigInteger;

/**
 * Created by sf on 2017/8/22.
 */
public class LargeFactorial {
    public static BigInteger factorial(long n){
        BigInteger result=BigInteger.ONE;
        for(int i=1;i<=n;i++){
            result=result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(50000000L).toString().length());
    }
}
