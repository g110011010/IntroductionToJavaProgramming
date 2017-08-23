package Chapter12;

import java.util.Scanner;

/**
 * Created by sf on 2017/8/23.
 */
public class QuotientWothException {
    public static int quotient(int number1,int number2) throws ArithmeticException{
        if(number2==0){
//            抛出的值“new ArithmeticException("Divisor can't be zero!")”称为一个异常。throw
//            语句的执行称为抛出一个异常
//            异常就是从异常类中创建的一个对象
//            当异常被抛出的时候，正常执行的流程会被中断。
//            异常被catch块所捕获，catch块中的代码得以执行以处理异常
//            之后catch块外剩下的代码得以执行
//            throw语句类似于方法的调用，但不同于调用方法的是，它调用的是catch块。
//            从某种意义上来讲，catch块就像带参数的方法定义，这些参数匹配抛出的值的类型
            throw new ArithmeticException("Divisor can't be zero!");
        }
        return number1/number2;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            System.out.println(quotient(input.nextInt(), input.nextInt()));
        }
//        标识符ex的作用很像方法中的参数。所以这个参数称为catch块中的参数。
//        ex之前的类型称为指定的catch块可以捕获的异常的类型
//        一个异常可以通过try块中的throw语句直接抛出，或者通过在块中调用一个可能会抛出异常的方法来抛出
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
