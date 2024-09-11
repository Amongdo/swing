package YoutubeLecture01;

public class MathBeanTest {
    public static void main(String[] args) {
        MathBean math = new MathBean(); //heap 메모리에 올라간다
        //예시
        // TV 리모콘 = new TV();
        math.printClassName();
        math.printNumber(8);
        int x = math.getOne();
        System.out.println(x);
        int y = math.plus(100, 100);
        System.out.println(y);


    }
}
