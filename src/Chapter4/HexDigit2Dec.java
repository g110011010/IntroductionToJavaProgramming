package Chapter4;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/19.
 * 将16进制字符串转化为十进制数字
 */
public class HexDigit2Dec {
    /**
    *将16进制字符串转化为十进制数字
    *@param hexDigit 十六进制字符串
    *@return 转化后的十进制结果十进制
    *@author sf
    */

    public static int hexDigit2Dec(String hexDigit){
        int result=0;
        int lenght=hexDigit.length();
        for(int i=0;i<lenght;i++)
        result+=oneHexDigit2Dec(Character.toUpperCase(hexDigit.charAt(i)))*(int)Math.pow(16,lenght-i-1);
         return result;
    }
    /**
    *
    *@param oneHexDigit 单个的十六进制数字字符
    *@return 十六进制字符对应的结果
    *@author sf
    */

    private static int oneHexDigit2Dec(char oneHexDigit){
        int result=0;
        if(Character.isDigit(oneHexDigit)){
            result=Integer.parseInt(oneHexDigit+"");
        }
        else if(oneHexDigit>='A'&&oneHexDigit<='F'){
            result=oneHexDigit-'A'+10;
        }
        else{
            result=-1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a hex digit:");
        String hexDigit=input.next();
        System.out.println(HexDigit2Dec.hexDigit2Dec(hexDigit));
    }
}
