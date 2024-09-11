package YoutubeLecture01;

public class PersonTest {
    public static void main(String[] args) {
        //Person p1; //p1은 null이다

        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "ABD"; //문자열은 new를 사용하지 않고 인스턴스를 사용할 수 있다
        p2.name = "ANNA";

        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        System.out.println(p1.isVip);
        System.out.println("-------");
        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip);
    }
}
