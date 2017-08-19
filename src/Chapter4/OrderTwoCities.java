package Chapter4;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/19.
 */
public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first city:");
        String city1=input.nextLine();
        System.out.println("Enter the second city:");
        String city2=input.nextLine();
        if (city1.compareTo(city2)<0){
            System.out.println(city1+" "+city2);
        }
        else{
            System.out.println(city2+" "+ city1);
        }
    }
}
