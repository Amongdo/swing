package chap_04;

public class Homework {
    public static void main(String[] args) {
        //역삼각형 구하기
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //구구단 2~9단 구하기
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j <10 ; j++) {
                System.out.println( i + "x" + j + "=" + i*j);
            }
            System.out.println(" ");
            System.out.println("Finish");

        }

        //1부터 100까지 합 구하기
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("Finish");

    }


}

//swing과제많이 나옴. 많이 공부해두기
//fileleader. filewriter 공부
//CSV파일에 대해 알아두기.

//금요일날 아침에 놋북 티비에 셋팅해놓기
