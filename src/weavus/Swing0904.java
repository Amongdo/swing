package weavus;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Swing0904 {
    public static void main(String[] args) {
        try {
            FileReader fin = new FileReader("C:\\Practice\\practice1.txt");

            int c;
            while ((c = fin.read()) != -1) {
                System.out.print((char) c);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println("에러");
        } catch (IOException e1) {
            System.out.println("에러2");
//        char x = 'a';
//        System.out.println((int)x);
        }
    }
}