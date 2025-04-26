package week4.day6.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Book {

    @JsonField(value = "title")
    private String name = "The Hobbit";

    @JsonField(value = "writer")
    private String author = "J.R.R. Tolkien";

    @JsonField(value = "price")
    private int price = 15000;

    @JsonField(value = "internal_code", skipYn = true)
    private String secretCode = "HBT123";
}

class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        Field[] fields = book.getClass().getDeclaredFields();
        ArrayList<String> resultList = new ArrayList<>();

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);

                if (annotation.skipYn()) continue;

                field.setAccessible(true);

                try {
                    Object value = field.get(book);
                    String key = annotation.value();
                    String formattedValue = (value instanceof String)
                            ? "\"" + value + "\"" : value.toString();


                    resultList.add(key + ": " + formattedValue);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } finally {
                    field.setAccessible(false);
                }
            }
        }
        String json = "{" + String.join(", ", resultList) + "}";
        System.out.println(json);

    }
}
