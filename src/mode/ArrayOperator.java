package mode;

/**
 * Created by sf on 2017/8/21.
 */
public class ArrayOperator<T> {
    /**
     *将一个数组中元素的顺序随机打乱
     * 对数组中的每一个元素，生成0~数组大小的随机数，并将此元素与该随机数对应位置的元素进行交换
     *@param array 要打乱元素顺序的数组
     *@author sf
     */

    public  void shuffling(T[] array){
        int length=array.length;
        int random;
        T temp;
        for(int i = 0;i<length; i++){
            random= (int) MathExtend.random(length);
            temp=array[i];
            array[i]=array[random];
            array[random]=temp;
        }}
        /**
        *找到数组中最大的一个元素
        *@param array 要查找的数组
        *@return 最大的那个元素所在数组中的下标位置
        *@author sf
        */
public static double  findMax(double...array){
        int length=array.length;
        double result=array[0];
        for(double item:array){
            result=result<item?item:result;
        }
        return result;
}
    public static int  findMax(int...array){
        int length=array.length;
        int result=array[0];
        for(int item:array){
            result=result<item?item:result;
        }
        return result;
    }
    /**
    *线性查找数组中是否有某个元素
    *@param key 要查找的元素
    *@return 元素存在则返回在数组中所在位置的下标，不存在返回-1
    *@author sf
    */

    public static int linerSearch(int key,int...array){
        for(int i=0;i<array.length;i++){
            if(key==array[i]){
                return i;
            }
        }
        return -1;
    }
    /**
    *二分查找数组中是否存在某个元素，要求数组必须是按照升序顺序排列好的数组
    *@param
    *@return
    *@author sf
    */
    public static int binarySearch(int key,int...array){
        return binarySearch(key,0,array.length-1,array);
    }
    private static int binarySearch(int key,int startPoint,int endPoint,int...array){
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
    /**
    *选择排序法对数组进行排序
    *@param array 要进行排序的数组
    *@author sf
    */
    public static void selectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int temp=i;
            int mid=array[i];
            for(int j=i+1;j<array.length;j++){
                if(mid>array[j]){
                    mid=array[j];
                    temp=j;
                }
            }
            if(temp!=i){
                mid=array[i];
                array[i]=array[temp];
                array[temp]=mid;
            }
        }
    }
}
