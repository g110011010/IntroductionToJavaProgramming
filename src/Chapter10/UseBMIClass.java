package Chapter10;

/**
 * Created by sf on 2017/8/22.
 */
public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmi1=new BMI("KimYang",18,145,70);
        System.out.println("Name:"+bmi1.getName()+" BMI:"+bmi1.getBMI()+" Status:"+bmi1.getStatus());
        BMI bmi2=new BMI("Susan King",215,70);
        System.out.println("Name:"+bmi2.getName()+" BMI:"+bmi2.getBMI()+" Status:"+bmi2.getStatus());
    }
}
