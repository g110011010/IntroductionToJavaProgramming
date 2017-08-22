package Chapter7;

import java.lang.reflect.Array;

/**
 * Created by sf on 2017/8/21.
 */
public class LinerSearch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        System.out.println(LinerSearch.binarySearch(0,0,a.length-1,a));

    }
    public static int linerSearch(int key,int...array){
        for(int i=0;i<array.length;i++){
            if(key==array[i]){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int key,int startPoint,int endPoint,int...array){
        if(startPoint<endPoint){
        int mid=(startPoint+endPoint)/2;
        if(key==array[mid]){
            return mid;
        }
        else if(key<array[mid]){
            return binarySearch(key,startPoint,mid-1,array);
        }
        else {
            return binarySearch(key,mid+1,endPoint,array);
        }
    }
    else {
            return -1;
        }
    }
}
