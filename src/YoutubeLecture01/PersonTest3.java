package YoutubeLecture01;

public class PersonTest3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "ABD";

        p1.printName();
        Person.printCount();

        Person.count++;
        Person.printCount();

    }






}
