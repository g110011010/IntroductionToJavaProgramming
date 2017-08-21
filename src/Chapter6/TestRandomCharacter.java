package Chapter6;

/**
 * Created by sf on 2017/8/21.
 */
public class TestRandomCharacter {
    public static void main(String[] args) {
        for(int i=0;i<10000;i++){
            System.out.print(RandomCharacter.getRandomLowerCaseLetter());
            if(i%25==0){
                System.out.println();
            }

        }
    }
}
