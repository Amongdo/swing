package weavus;

import java.util.Scanner;

public class Hw_0905 {
    public static void main(String[] args) {
        //slit를 이용해서 배열에 문자열 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("배열에 추가할 요소를 입력하세요 : ");
        String input = sc.nextLine();
        String[] hw1 = input.split(" ");

        for (int i = 0; i < hw1.length; i++) {
            System.out.print(" " + hw1[i]);
            if (i == 5) {
                break;
            }
        }
    }
}
