package chap_06;

public class _01_Method {
    //메소드 정의
    public static void sayHello() {
        System.out.println("Hi. I am Method");
    }

    public static void main(String[] args) {
        //Method<<어떤 기능을 하는 코드들의 묶음 (함수랑 유사)
        //메소드 호출
        System.out.println("메소드 호출 전");

        sayHello();

        System.out.println("메소드 호출 후");


    }
}
