package Chapter3;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 */
public class ComputeTax {
    /*
    * TAX[0] 单独纳税人
    * TAX[1] 已婚共同纳税人或证实的鳏寡
    * TAX[2] 已婚单独纳税人
    * TAX[3] 家庭户主纳税人*/
    private final int TAX[][]={
            {0,8_350,33_950,82_250,171_550,372_950},
            {0,16_700,67_900,137_050,208_850,372_950},
            {0,8_350,33_950,68_525,104_425,186_475},
            {0,11_950,45_500,117_450,190_200,372_950}
    };
    private final double TAX_RATE[]={0.1,0.15,0.25,0.28,0.33,0.35};
    /*
    * 计算应缴税款
    * @param status 交税人类型
    * @param income 可征税收入
    * @return 应该缴纳的税额*/
    public double computeRate(int status,double income){
        double tax=0;
        for(int i=TAX_RATE.length;i>0;i--){
            if(income>TAX[status][i-1]){
                tax+=(income-TAX[status][i-1])*TAX_RATE[i-1];
//                System.out.print("("+income+"-"+TAX[status][i-1]+")"+"*"+TAX_RATE[i-1]+"+");
                income=TAX[status][i-1];
            }
        }
        return tax;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter status:");
        int status=input.nextInt();
        System.out.println("Enter income:");
        double income=input.nextDouble();
        System.out.println(new ComputeTax().computeRate(status,income));
    }
}
