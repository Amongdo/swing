package hwatstract;
abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + "얌얌");
    }
    abstract void sound();
}
abstract class Mammal extends Animal{
    public Mammal(String name) {
        super(name);
    }
    public void sleep() {
        System.out.println(name + "zzZ");
    }
    abstract void walk();
}

interface Pet {
    abstract void play();
}


class Dog extends Mammal implements Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + "걀걀");
    }
    @Override
    void walk() {
        System.out.println(name + "할짝");
    }
    @Override
    public void play() {
        System.out.println(name + "같이노올자");
    }
}
class Cat extends Mammal implements Pet{
    public Cat(String name) {
        super(name);
    }
    @Override
    void sound() {
        System.out.println("걀걀2");
    }
    @Override
    void walk() {
        System.out.println("할짝2");
    }
    @Override
    public void play() {
        System.out.println("같이노올자222");
    }
}class Tiger extends Mammal implements Pet{
    public Tiger(String name) {
        super(name);
    }
    @Override
    void sound() {
        System.out.println("걀걀3");
    }
    @Override
    void walk() {
        System.out.println("할짝3");
    }
    @Override
    public void play() {
        System.out.println("뭘봐");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("111");
        Cat cat = new Cat("222");
        Tiger tiger = new Tiger("333");

        dog.sound();
        dog.walk();
        dog.play();
        dog.eat();
        System.out.println("------");

        cat.sound();
        cat.walk();
        cat.play();
        cat.eat();
        System.out.println("------");

        tiger.sound();
        tiger.walk();
        tiger.play();
        tiger.eat();
    }
}
