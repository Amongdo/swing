package YoutubeLecture01;

public class Person {
    String name;            //static이 안붙어 있는 얘들은 다 인스턴트필드,static이 붙은 얘들은 클래스 필드
    String address;     //요런게 인스턴트 필드
    boolean isVip;
    static int count = 0;       //요런게 클래스 필드

    public void printName(){        //요런건 인스턴트 메소드,즉 클래스가 인스턴트돼야지만 사용가능한 메소드
        System.out.println("내 이름은 " + name );
    }

    public static void printCount(){        //요게 클래스 메소드. 클래스가 인스턴트안돼도 사용가능한 메소드
        System.out.println("count :" + count);
    }
}
