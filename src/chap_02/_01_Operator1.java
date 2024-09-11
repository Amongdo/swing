package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산
        System.out.println(4+2); //6
        System.out.println(4-2); //2
        System.out.println(4*2); //8
        System.out.println(4/2); //2

        System.out.println(5/2); //2.5 but result is 2
        System.out.println(2/4); //0.5 but result is 0
        System.out.println(4%2); //0
        System.out.println(5%2); //1

        //우선 순위에 따른 연산
        System.out.println(2+2*2); //6

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b ;
        System.out.println(c); //30

        c = a - b;
        System.out.println(c); //10

        c = a * b ;
        System.out.println(c); //200

        c = a / b ;
        System.out.println(c); //2

        //증감 연산 ++, --

        int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); //11
        System.out.println(val); //11

        val = 10;
        System.out.println(val); //10
        System.out.println(val++); //10
        System.out.println(val); //11

        //예시. 은행 대기 번호표,문장 복사는 컨트롤 디
        int waiting = 0;
        System.out.println("대기 인원: " + waiting++); // 대기인원0명
        System.out.println("대기 인원: " + waiting++); // 대기인원1명
        System.out.println("대기 인원: " + waiting++); // 대기인원2 명
        System.out.println("총 대기인원: " + waiting);










    }
}
