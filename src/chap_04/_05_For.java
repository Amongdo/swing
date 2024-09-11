package chap_04;

public class _05_For {
    public static void main(String[] args) {
        //반복문 for
        //나코 라는 매장
        System.out.println("어서오세요. 나코입니다");
        //또 다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        //만약 인사법이 바뀌면?
        System.out.println("환영합니다. 나코입니다");
        System.out.println("환영합니다. 나코입니다");
        System.out.println("환영합니다. 나코입니다");


        //인사법이 바뀐게 아니고, 매장 이름이 바뀐다면?
        //나코 >>>>코나
        System.out.println("환영합니다. 코나입니다");
        System.out.println("환영합니다. 코나입니다");
        System.out.println("환영합니다. 코나입니다");

//        for(선언 ;조건 ;증감 ) {
//
//        }
        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요. 나코입니다" + i);
        }

        //짝수만 출력하고 싶을 때
        //0.2.4.6.8
        for(int i = 0; i < 10; i += 2) {
            System.out.println(i);
            System.out.print(i); // ln이 빠지면?
        }

        // 홀수만 출력
        //1.3.5.7.9
        for (int i = 1; i < 10; i +=2) {
            System.out.println(i);
        }

        //거꾸로 출력
        //54321
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        //1부터 10까지의 합
        //1+2+3,,,,=55
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.println("현재까지의 총 합은 "+ sum + "입니다");
        }
        System.out.println("1부터10까지의 총 합은 " + sum + "입니다");

    }
}