package Chapter10;
import Chapter3.ComputeAndInterpretBMI;
/**
 * Created by sf on 2017/8/22.
 */
public class BMI extends ComputeAndInterpretBMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public BMI(String name,int age,double weight,double height){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
    }
    public BMI(String name,double weight,double height){
        this.name=name;
        this.weight=weight;
        this.height=height;
    }
    public double getBMI(){
        return computeAndInterpretBMI(weight,height);
    }
    public String getStatus(){
        return describeBMI(getBMI());
    }

    public String getName() {
        return name;
    }
}
