package Chapter3;
import mode.Translate;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/17.
 * 计算身体质量指数
 */
public class ComputeAndInterpretBMI {
    /*
    *计算身高体重指数（BMI）
    * @param height 身高 单位：英寸
    * @param weight 体重 单位：磅
    * @return BMI值*/
    public double computeAndInterpretBMI(double height, double weight){
//        体重单位由磅转化为千克
        weight= Translate.poundToKilogram(weight);
//         身高单位由英寸转换为米
        height= Translate.inchToMeter(height);
        return weight/(Math.pow(height,2));
    }
    public String describeBMI(double BMI){
        String describe;
        if(BMI<18.5){
            describe="偏瘦";
        }
        else if (BMI<25.0){
            describe="正常";
        }
        else if (BMI<30){
            describe="超重";
        }
        else{
            describe="过胖";
        }
        return describe;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter weight in pounds:");
        double weight=input.nextDouble();
        System.out.println("Enter height in inche:");
        double height=input.nextDouble();
        ComputeAndInterpretBMI computeAndInterpretBMI=new ComputeAndInterpretBMI();
        System.out.println(computeAndInterpretBMI.describeBMI(computeAndInterpretBMI.computeAndInterpretBMI(height,weight)));
    }
}
