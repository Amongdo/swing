package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        //값이 115 인 경우
        //키가 115cm 이므로 탑승 불가능합니다

        //값이 121인 경우
        //키가 121cm 이므로 탑승 가능합니다

        //조건
        //키가 120이상인 경우에만 탑승 가능
        //삼항 연산자 이용

        int a = 115;
        int b = 121;

        String condition1 = (a >= 120) ? "키가 " + a + "이므로 탑승 가능 합니다" : "키가 " + a + "이므로 불탑승 가능 합니다";
        String condition2 = (b >= 120) ? "키가 " + b + "이므로 탑승 가능 합니다" : "키가 " + b + "이므로 탑승 불가능 합니다";

        System.out.println(condition1);
        System.out.println(condition2);

        //정답 버전

        int height = 115;
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 "+ height +"cm 이므로 " + result);


    }
}
