package File;

import java.io.File;
import java.lang.reflect.Field;

public class Sample {

    public static void main(String[] args) {
        //파일라이터

        File file = new File("./src/File", "test.csv");

        try {
            file.createNewFile();
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("파일생성실패");
        }



    }
}
