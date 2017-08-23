package Chapter11;

import java.util.ArrayList;

/**
 * Created by sf on 2017/8/23.
 */
public class TestArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<>();//jdk1.7以后的版本可以这样简写
        a.add(12);//向列表的最后一位添加元素
        a.add(13);
        a.add(14);
        a.add(1, 22);//如果1位置有元素，那么从1位置开始的所有元素整体向后移动一位
        System.out.println(a.toString());//
        System.out.println(a.contains(12));//如果列表中包含元素12 ，返回true
        System.out.println(a.get(2));//返回列表指定位置的元素
        a.clear();//清空列表中的额所有的元素
    }
}
