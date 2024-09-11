package YoutubeLecture01;

public class PersonTest2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "abd";
        p2.name = "anna";

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1.count);
        p1.count++;
        System.out.println(p2.count); //p1을 증가시켰는데, p2도 증가됐다?! ㅎㄷㄷ
    }
}
