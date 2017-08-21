package Chapter7;

import mode.MathExtend;

/**
 * Created by sf on 2017/8/21.
 */
public class  DeckOfCards<T> {
    public  T[] shuffling(T[] array){
        int length=array.length;
        int random;
        T temp;
        for(int i = 0;i<length; i++){
            random= (int) MathExtend.random(length);
            temp=array[i];
            array[i]=array[random];
            array[random]=temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,6};
        DeckOfCards<Integer> deckOfCards=new DeckOfCards<>();
        Integer[] b=deckOfCards.shuffling(a);
        for(int c:a){
            System.out.print(c);
        }
        System.out.println();
        for(int c:b){
            System.out.print(c);
        }
        String[] s={"s1","s2","s3","s4","s5"};
        DeckOfCards<String> d=new DeckOfCards<>();
        d.shuffling(s);
        for(String str:s){
            System.out.print(str);
        }
    }
}
