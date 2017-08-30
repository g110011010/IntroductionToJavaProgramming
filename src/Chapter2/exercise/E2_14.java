package Chapter2.exercise;
import Chapter3.ComputeAndInterpretBMI;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/30.
 */
public class E2_14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ComputeAndInterpretBMI c=new ComputeAndInterpretBMI();
        double bmi=c.computeAndInterpretBMI(input.nextDouble(),input.nextDouble());
        System.out.println(bmi+"  "+c.describeBMI(bmi));

    }
}
