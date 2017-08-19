package Chapter2;

/**
 * Created by sf on 2017/8/16.
 */
public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI=3.1415926;
        double radius=ComputeAreaWithConsoleInput.consoleInput();
        ComputeArea.computeArea(radius,PI);
    }
}
