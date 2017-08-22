package Chapter7;

import mode.ArrayOperator;

/**
 * Created by sf on 2017/8/21.
 */
public class VarArgsDemo {
    public static void main(String[] args) {
        System.out.println(ArrayOperator.findMax(12,3,4,5,6,7,071,90,0));
        System.out.println(ArrayOperator.findMax(new int[]{1,2,6,54,3,32}));
    }
}
