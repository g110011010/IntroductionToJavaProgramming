package Chapter2.exercise;
import Chapter1.exercise.E1_11;
import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 */
public class e2_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of years:");
        int years=input.nextInt();
        System.out.println(new E1_11().fin_population(E1_11.POPULASTION,years));

    }
}
