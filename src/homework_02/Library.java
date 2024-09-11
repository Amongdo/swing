package homework_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    Scanner sc = new Scanner(System.in);

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("'" + book.getTitle() + "'이(가) 도서 목록에 추가되었습니다.");
    }

    public void sellBook(String title, int quantity) {
        System.out.println("책 제목을 입력하셈 :");

        String bkName = sc.nextLine();
        sc.nextLine();

        if (bkName.equals(title)) {
            System.out.println(title + "의 희망판매 권수를 숫자로 입력하세요 : ");
            int sellBook = sc.nextInt();
            int sellBook1 = quantity;
            sellBook1 -= sellBook;
            sc.nextLine();

            if ( sellBook1 < 0) {
                System.out.println(title + "의 판매 권수가 재고 수보다 많습니다. 다시 입력하세요");
                sellBook1 +=sellBook;
                sellBook(title, quantity);
            } else {
                System.out.println("감사합니다. " + title + "의 남은 권수는 " + sellBook1 + "입니다.");
            }
        } else {
            System.out.println("책 제목을 다시 입력해주세요");
        }


    }

    public void showAllBooks() {
        System.out.println("도 서 목 록");
        for ( Book book : books) {
            System.out.println(book.getDetails());
        }
    }










}
