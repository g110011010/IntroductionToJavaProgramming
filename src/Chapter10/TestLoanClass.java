package Chapter10;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/22.
 */
public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Loan loan=new Loan(input.nextDouble(),input.nextInt(),input.nextDouble());
        System.out.println(loan.getLoanDate().toString());
        System.out.println(loan.getMonthlyPayment());
        System.out.println(loan.getTotalPayment());
    }
}
