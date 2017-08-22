package Chapter8;

import javax.print.DocFlavor;
import java.util.Arrays;

/**
 * Created by sf on 2017/8/21.
 */
public class GradeExam {
    public static void main(String[] args) {
        String s="ABACCDEEADDBABCAEEADEDDACBEEADCBAEDCEEADABDCCDEEADBBECCDEEADBBACCDEEADEBECCDEEAD";
        /*char[][] answes=new char[8][10];
        char[] key={'D','B','D','C','C','D','A','E','A','D'};*//*
        int a=0;
        for(int i=0;i<answes.length;i++){
            for(int j=0;j<answes[0].length;j++){
                answes[i][j]=s.charAt(a++);
            }
        }*/
        int countPoint[]=new int[8];
        String key="DBDCCDAEAD";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==key.charAt(i%10)){
                countPoint[i/10]++;
            }
        }
        System.out.println(Arrays.toString(countPoint));
    }
}
