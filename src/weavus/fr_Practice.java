package weavus;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class fr_Practice {
    public static void main(String[] args) {
        try {
        FileReader fr = new FileReader("C:\\Practice\\practice1.txt");
        int c;
        while((c = fr.read()) != -1) {
            System.out.print((char)c);
        }
        fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("경로에러");
        } catch (IOException e) {
            System.out.println("IO에러");
        }

    }
}
