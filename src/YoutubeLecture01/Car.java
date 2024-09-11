package YoutubeLecture01;

public class Car {
    private String name; //필드는 가지는 것.
    //생성자는 메소드와 비슷하다
    //리턴 타입이 없고,클래스 이름과 같아야 한다.
    //매개변수가 없는 생성자를 디폴트 생성자라고 말한다.
    //생성자를 안만들어주면, 아무 일도 안하는 기본 생성자가 자동으로 만들어진다.
    public Car(){
        System.out.println("자동차가 한 대 생성됩니다.");
    }

    //이름을 가지고 태어나게 하고 싶다.
    public Car(String name){
        this.name = name;

    }

    public void printName(){
        System.out.println("자동차 이름: "+ name);
    }
    public void run(){
        System.out.println("전륜구동으로 달리다");
    }

    @Override
    public String toString() {
        return "자동차!@!@";
}

}
