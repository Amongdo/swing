package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        //이중 반복문

        //(*)별로 사각형 만들기
        /*
        *****
        * *****
        * ****
        * *****
        * *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // (*)별 삼각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----Triangle3");
        //(*) 별 오른쪽으로 삼각형 만들기
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
                
            }
            System.out.println();

        }

        }

    }



