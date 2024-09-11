package chap_06;

public class _07_VariableScope {

    public static void methodA() {
        //System.out.println(number);
    }
    public static void methodB() {
        int result = 1; //지역 변수
    }
    public static void main(String[] args) {
        int number = 3;
        //System.out.println(result);

        //위에 빨간글씨 number 와 result의 경우, 각각의 메소드안에 있는 변수는 타 메소드에선 쓸 수 없다
        //위와 같은 변수를 지역변수라고 한다.

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //System.out.println(i); // for문의 i는 for 고유 변수!이므로 중괄호 벗어난 곳에선 사용할 수 없다



    }
}
