package weavus;

abstract class Animal {
    String name;
    void eat(){
        System.out.println(name + "가 먹이를 먹습니다");
    }
    abstract void sound();

}
class Dog extends Animal{
    void bark() {
        System.out.println(name + "가 멍멍 짖습니다");
    }
    void sleep() {
        System.out.println(name + "가 코를 곱니다");
    }

    @Override
    void sound() {
        System.out.println("냐옹");
    }
}
class Cat extends Animal{

    @Override
    void sound() {
        System.out.println("멍냥멍냥");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.name = "ㅂㄷㅇ";
        myDog.sound();

        Cat myCat = new Cat();
        myCat.sound();
    }
}
