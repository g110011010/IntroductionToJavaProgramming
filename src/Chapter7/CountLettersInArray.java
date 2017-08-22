package Chapter7;
import Chapter6.RandomCharacter;
/**
 * Created by sf on 2017/8/21.
 */
public class CountLettersInArray {
    final static int CHAR_NUM=1000;
    /**
    *返回一个数包含一定数量小写字符的数组
    *@return
    *@author sf
    */

    public static char[] createArray(){
        char[] c=new char[CHAR_NUM];
        for(int i=0;i<CHAR_NUM;i++)
        {
            c[i]=RandomCharacter.getRandomLowerCaseLetter();
        }
        return c;
    }
    /**
    *统计字符数组中各个小写字母的歌数，并返回统计结果
    *@param charArray 包含一定数量小写字符的数组
    *@return 统计结果
    *@author sf
    */

    public static int[] countCases(char[] charArray){
        int count[]=new int['z'-'a'+1];
        for(int i=0;i<charArray.length;i++){
         count[charArray[i]-'a']++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a=CountLettersInArray.countCases(CountLettersInArray.createArray());
        for(int i=0;i<a.length;i++){
            System.out.print((char)(i+'a')+":");
            System.out.println(a[i]);
        }

    }
}
