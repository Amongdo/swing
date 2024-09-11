package homework_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title ="";
        int quantity = 0;
        Book bk1 = new Book("we", "안병도", 1200.12, 10);
        Book bk2 = new Book("a", "신주쿠", 1500.15, 5);
        Book bk3 = new Book("vus", "교엔마에", 1900.55, 2);

        Library library = new Library();

        library.addBook(bk1);
        library.addBook(bk2);
        library.addBook(bk3);

        library.showAllBooks();
        library.sellBook(title, quantity);









    }
}
