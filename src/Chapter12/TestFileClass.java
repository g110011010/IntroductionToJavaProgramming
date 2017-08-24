package Chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by sf on 2017/8/24.
 */
public class TestFileClass {
    public static void main(String[] args) throws IOException {
        File file=new File("/demo");
        System.out.println(file.exists());//如果文件或者文件路径存在，返回true
        System.out.println(file.getAbsolutePath());//获取文件或者文件路径的绝对路径
        System.out.println(file.isDirectory());//file对象存在且代表一个目录时，返回true
        System.out.println(file.isFile());//file对象存在且代表一个文件时，返回true
        File file1=new File(file,"test.txt");//file为一个路径，在file路径下创建一个子路径
        System.out.println(file1.getAbsolutePath());
        System.out.println(new Date(file1.lastModified()).toString());//返回文件最后一次被修改的时间
        System.out.println(file1.isFile());
        System.out.println(file1.isAbsolute());//file1是用绝对路径创建时返回true
        System.out.println(file1.isHidden());//file1对象代表的文件是隐藏文件时返回true
        System.out.println(file1.getCanonicalPath());//和getAboulutePath()相同，除了从路径名中去除了一些亢余字符
        System.out.println(file1.getName());//返回file对象代表的目录和文件名单的最后文件名
        File file2=new File("fileTest/test.txt");
        System.out.println(file2.exists());//false
        System.out.println(file2.mkdir());
        System.out.println(file2.exists());
        System.out.println(file2.getAbsolutePath());
    }
}
