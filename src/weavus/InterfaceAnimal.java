package weavus;

interface Animal1 {
    ;
    void sound();
    void eat();

}
class Dog1 implements Animal1 {

    @Override
    public void sound() {
        System.out.println("wow");
    }

    @Override
    public void eat() {
        System.out.println("yummy");
    }
}
class Cat1 implements Animal1 {

    @Override
    public void sound() {
        System.out.println("n");
    }

    @Override
    public void eat() {
        System.out.println("commy");
    }
}


public class InterfaceAnimal {
    public static void main(String[] args) {
        Dog1 myDog = new Dog1();
        Cat1 myCat = new Cat1();

        myDog.sound();
        myDog.eat();

        myCat.sound();
        myCat.eat();

    }
}
