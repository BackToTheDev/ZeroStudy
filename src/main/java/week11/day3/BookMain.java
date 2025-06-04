package week11.day3;
import java.util.*;
import java.util.stream.*;

class Book{
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
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
                new Book("토비의 스프링", "이일민", 25000),
                new Book("Do it! 자바", "박은종", 18000),
                new Book("Effective Java", "조슈아 블로크", 30000)
        );

        List<String> result = books.stream()
                .filter(b -> b.price >= 20000)
                .sorted(Comparator.comparing(Book::getPrice)
                        .thenComparing(Book::getTitle))
                .map(Book::getTitle)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
