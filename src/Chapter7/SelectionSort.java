package Chapter7;

import mode.ArrayOperator;

/**
 * Created by sf on 2017/8/21.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a={21,3,23,453,32,56,2,1};
        ArrayOperator.selectionSort(a);
        for(int e:a){
            System.out.printf("%2d ",e);
        }
    }
}
