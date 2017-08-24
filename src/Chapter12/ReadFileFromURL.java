package Chapter12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by sf on 2017/8/24.
 */
public class ReadFileFromURL {
    public static void main(String[] args) throws IOException {
        URL url=new URL("http://www.baidu.com");
        Scanner input=new Scanner(url.openStream());
        while(input.hasNext()){
            System.out.println(input.nextLine());
        }
    }
}
