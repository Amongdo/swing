package homework_02;

import java.util.Scanner;

public class Book {
    //Book 클래스 변수 생성
    String title;
    String author;
    double price;
    int quantity;
    //스캐너 셋팅
    Scanner sc = new Scanner(System.in);

    //  인스턴스 셋팅
    public Book(String title, String author, double price
    , int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    // 클래스 정보 구체화 메소드
    public String getDetails() {
        return "제목: "+ title + ", 저자: " + author + ", 가격: " +
                price + "엔" + ", 재고: " + quantity + "권";
    }

    //클래스의 quantity 판매 메소드
    public void sellBook(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            System.out.println("'" + title + "'의 남은 재고: " + this.quantity);
        } else {
            System.out.println("'" + title + "'의 재고가 부족합니다.");
        }
    }

    //클래스의 quantity 추가 메소드
    public void addStock(int quantity) {
        System.out.println("추가하실 권수를 숫자로 입력하세요 ");
        int addBook = sc.nextInt();
        int addBook1 = quantity;
        addBook1 += addBook;
        if (addBook1 < 0) {
            System.out.println("에러.다시 입력해주세요");
            addBook1 += addBook;
            addStock(quantity);
        } else {
            System.out.println("감사합니다. " + title + "의 남은 권수는 " + addBook1 + "입니다.");
        }

    }
    public String getTitle() {
        return title;
    }

}
