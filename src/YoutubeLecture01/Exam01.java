package YoutubeLecture01;

public class Exam01 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printI();
        System.out.println("-----------------");

        Child c1= new Child();
        System.out.println(c1.i);
        c1.printI();
        System.out.println("-----");

        Parent p2 = new Child();
        System.out.println(p2.i); //필드는 부모의 필드를 따라가기 때문에 5
        p2.printI(); //그치만, 메소드는 자식의 메소드를 따라가기 때문에 15

        //필드만 부모 클래스를 따라가는 이유
        //부모 클래스에 자식클래스가 생성되는거까진 예측할 수 없기 때문에
        //부모클래스에 있는 메소드를 잘 실행시키기 위해 필드는 기본적으로 부모클래스
        //메소드 오버라이딩만 기억하면 된다~!

    }
}
