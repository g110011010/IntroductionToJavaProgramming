package Chapter12;

/**
 * Created by sf on 2017/8/23.
 */
public class TestException  {
    private static int sum(int[] list) throws Exception{
        int result=0;
        for(int i=0;i<=list.length;i++){
            result+=list[i];
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[]{1,2,3,4,5,6}));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ex.getMessage:"+e.getMessage());
            System.out.println("e.toString"+e.toString());
            System.out.println("getStackTrace:");
            StackTraceElement[] stackTraceElements=e.getStackTrace();
            for(int i=0;i<stackTraceElements.length;i++){
                System.out.print("mode:"+stackTraceElements[i].getMethodName());
                System.out.print("class:"+stackTraceElements[i].getClassName());
                System.out.println("LineName"+stackTraceElements[i].getLineNumber());
            }
        }
    }
}
