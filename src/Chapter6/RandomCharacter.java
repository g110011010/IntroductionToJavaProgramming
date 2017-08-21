package Chapter6;

import mode.MathExtend;

/**
 * Created by sf on 2017/8/21.
 */
public class RandomCharacter {
    /**
    *随机返回一个小写字母
    *@return 字符
    *@author sf
    */
    public static char getRandomLowerCaseLetter(){
        return (char)MathExtend.random('a','z'+1);
    }
    public static char getRandomUpperCaseLetter(){
        return Character.toUpperCase(getRandomLowerCaseLetter());
    }
    public static char getRandomDigitCharacter(){
        return (char)MathExtend.random('0','9'+1);
    }
    public static char getRandomCharacter(){
        return (char)MathExtend.random('\u0000','\uffff');
    }

}
