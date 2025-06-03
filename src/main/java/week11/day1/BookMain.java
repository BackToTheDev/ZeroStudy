package week11.day1;
import java.util.*;
import java.util.stream.*;

class Book {
    String title;
    String author;
    int price;

    public Book (String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}

public class BookMain {
    public static void main(String[] args) {
    List<Book> books = Arrays.asList(
            new Book("자바의 정석", "남궁성", 25000),
            new Book("토비의 스프링", "이일민", 35000),
            new Book("Do it! 자바", "박은종", 18000)
    );

    List<String> bookNames = books.stream()
            .filter(book -> book.getPrice() >= 20000)
            .map(Book::getTitle)
            .collect(Collectors.toList());

    System.out.println(bookNames);
    }
}
