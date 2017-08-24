package Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by sf on 2017/8/24.
 */
public class WriteDate {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("./testFile/test.txt");
        if(file.exists()){
            file.mkdir();
        }
        System.out.println(file.getAbsolutePath());
        PrintWriter p=new PrintWriter(file);
        p.print("Hello World!!!");
        p.close();//必须使用close关闭文件，如果没有执行该方法，数据就不能正确的存入该文件
//        s使用try-with-resources语法，可以在块结束后虚拟机自动调用close()方法结束资源
//        在括号中声明资源，声明的资源必须是AutoCloseable的子类，具有一个close方法
//        可以在括号中使用多个资源
        try(PrintWriter q=new PrintWriter(file);PrintWriter q1=new PrintWriter(file)){
            q.print("\nthis is for test!!!");
        }
    }
}
