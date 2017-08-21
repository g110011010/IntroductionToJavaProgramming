package Chapter7;

import mode.MathExtend;

/**
 * 没有完全按照课本内容编程
 * 程序模拟了洗牌发牌的过程
 * 没有包括大小王
 * Created by sf on 2017/8/21.
 */
public class  DeckOfCards<T> {
    //扑克牌的数目
    final int POKER_NUM=52;
    /**
    *获取某张扑克牌的花色
    *@param cardArrayNum 扑克牌在数组中的编号
    *@return 这张扑克牌对应的花色
    *@author sf
    */
    public char suit(int cardArrayNum){
        char[] suit={'C','D','H','S'};
        char result='*';
//        判断输入参数是否合法
        if(cardArrayNum>52){
            System.out.println("Wrong card num!!!");
        }
        else{
           /* for(int i=0;i<4;i++){
                if(1+i*13<=cardArrayNum&&cardArrayNum<=13+i*13){
                    result=suit[i];
                }
            }*/
//           比上面更好的逻辑实现
            result=suit[(cardArrayNum-1)/13];
        }
        return result;
    }
    /**
    *
    *@param cardArrayNum 牌在数组中表示的点数
    *@return 牌真实的大小
    *@author sf
    */
    public int cardNum(int cardArrayNum){
        //        判断输入参数是否合法
        if(cardArrayNum>52){
            System.out.println("Wrong card num!!!");
            return -1;
        }
        else {
            return cardArrayNum % 13==0?13:cardArrayNum % 13;
        }
    }
    /**
    *模拟发牌的过程
    *@param peopleNum 打牌的人数
     *                 @param poker 扑克牌数组
    *@return 二维数组，其中存放着每个人发到的牌
    *@author sf
    */

    public int[][] pushPoker(int peopleNum,int[] poker){
        int length=poker.length;
        int[][] people=new int[peopleNum][length/peopleNum];
        if(length%peopleNum==0) {
            for(int i=0;i<length;i++){
                people[i%4][i/4]=poker[i];
            }
        }
        else {
            System.out.println("poker num don't suit people num!!!");
        }
        return people;
    }
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

    public static void main(String[] args) {
        DeckOfCards<Integer> deckOfCards=new DeckOfCards<Integer>();
         Integer[] card=new Integer[deckOfCards.POKER_NUM];
         for(int i=0;i<deckOfCards.POKER_NUM;i++){
             card[i]=i+1;
         }
         for( int i:card){
             System.out.print(i+" ");
         }
//         洗牌
        deckOfCards.shuffling(card);
        System.out.println();
        System.out.println(card.length);
        for( int i:card){
            System.out.print(i+" ");
        }

        Integer[][] people=new Integer[4][13];
//        发牌
        for(int i=0;i<deckOfCards.POKER_NUM;i++){
            people[i%4][i/4]=card[i];
        }
//        查看发牌结果
        System.out.println();
        for(Integer[] i:people){
            for(Integer j:i){
                System.out.printf("%3s  ",""+deckOfCards.suit(j)+deckOfCards.cardNum(j));
            }
            System.out.println();
        }
    }
}
