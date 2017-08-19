package mode;

/**
 * Created by sf on 2017/8/17.
 */
public class Translate {
    public final static  double METERS_PER_FEET=0.305;
    public final static  double KILOGRAMS_PER_POUND=0.453_592_37;
    public final static  double METERS_PER_INCH=0.0254;
    /*
    * 华氏度转化为摄氏度*/
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    /*
    * 摄氏度转化为华氏度*/
    public static double celsiusToFahrenheit(double celsius) {
        return 9.0 / 5 * celsius + 32;
    }

    /*
    * 英尺转化为米*/
    public static double footToMeter(double foots) {
        return  METERS_PER_FEET* foots;
    }

    /*
    * 米转化为英尺*/
    public static double meterToFoot(double meter) {
        return meter / METERS_PER_FEET;
    }

    /*
    * 千克转化为磅*/
    public static double kilogramToPound(double kilogram) {
        return kilogram / KILOGRAMS_PER_POUND;
    }

    /*
    * 磅转化为千克*/
    public static double poundToKilogram(double pound) {
        return pound * KILOGRAMS_PER_POUND;
    }

    /*
    * 英寸转化为米*/
    public static double inchToMeter(double inch) {
        return inch *METERS_PER_INCH ;
    }
    /*
    *米转化为英寸*/
    public static double meterToInch(double meter){
        return meter/METERS_PER_INCH;
    }

}
