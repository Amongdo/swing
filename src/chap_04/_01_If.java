package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 IF
        int hour = 10; // 10 A.M
        if (hour <14)
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        System.out.println("커피 주문 완료");

        //다른 조건, If조건에 부합하지 않으므로 1번째 문장은 안 뜬다.
        hour = 15;
        if (hour < 14)
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        System.out.println("커피 주문 완료#1");
        //즉, 2개 이상의 조건을 묶고 싶을땐,{}로 묶어주면 댐

        //오존 10시, 모닝커피 안 마신 경우?
        hour = 10;
        boolean morningCoffee = false; //모닝커피
        //if (hour <14 && morningCoffee == false) {
        if (hour <14 && !morningCoffee) {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료#2");

        // 오후 2시 이후 이거나, 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = true;
        //if(hour >= 14 || morningCoffee == true) {
        if(hour >= 14 || morningCoffee) {
            System.out.println("아이스 아메리카노 (디카페인)");
        }
        System.out.println("커피 주문 완료#3");




    }
}
