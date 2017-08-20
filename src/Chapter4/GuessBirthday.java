package Chapter4;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/19.
 */
public class GuessBirthday {
    public String numSet(int set){
        String setStr="";
        switch(set){
            case 1:setStr=
                    " 1 3 5 7 \n" +
                            "9 11 13 15 \n" +
                            "17 19 21 23 \n" +
                            "25 27 29 31 \n" ;
            break;
            case 2:setStr=
                    " 2 3 6 7\n" +
                            "10 11 14 15\n" +
                            "18 19 22 23\n" +
                            "26 27 30 31\n";
            break;
            case 3:setStr=
                    " 4 5 6 7 \n" +
                            "12 13 14 15 \n" +
                            "20 21 22 23 \n" +
                            "28 29 30 31 \n" ;
            break;
            case 5:setStr=
                    "16 17 18 19 \n" +
                            "20 21 22 23 \n" +
                            "24 25 26 27 \n" +
                            "28 29 30 31 \n" ;
            break;
            case 4:setStr=
                    "8 9 10 11 \n" +
                "12 13 14 15 \n" +
                            "24 25 26 27 \n" +
                            "28 29 30 31 \n" ;
            break;
        }
        return setStr;
    }

    public static void main(String[] args) {
        /*for(int i=4;i<32;i+=1) {
            System.out.print(i+" ");
            if(((i+1))%4==0){

                System.out.println("\\n\" +");
                System.out.print("\"");
            }
        }*/
        int result=0;
        GuessBirthday guessBirthday=new GuessBirthday();
        for(int i=1;i<6;i++){
            System.out.println("is your birthdaay in set"+i+"?(y/n)");
            Scanner input=new Scanner(System.in);
            String set=guessBirthday.numSet(i);
            System.out.println(set);
            String c=input.next();
            if(c.equalsIgnoreCase("y")){
                result+=Integer.parseInt(set.substring(0,2).trim());
            }
        }
        System.out.println(result);
    }
}
