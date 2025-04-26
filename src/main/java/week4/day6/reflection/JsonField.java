package week4.day6.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonField {
    String value();
    boolean skipYn() default false;
}

class Person {

    @JsonField(value = "full_name")
    private String name = "John Doe";

    @JsonField(value = "age")
    private int age = 30;

    @JsonField(value = "age", skipYn = true)
    private String gender = "F";


}

class PersonMain{
    public static void main(String[] args) {
        Person person = new Person();

        Field[] fields = person.getClass().getDeclaredFields();
        List<String> jsonPairs = new ArrayList<>();

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);

                if (annotation.skipYn()) continue;

                field.setAccessible(true);

                try {
                    Object value = field.get(person);
                    String key = annotation.value();
                    String formattedValue = (value instanceof String)
                            ? "\"" + value + "\"" : value.toString();

                    field.setAccessible(false);
                    jsonPairs.add(key + ": " + formattedValue);

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        String json = "{" + String.join(", ", jsonPairs) + "}";
        System.out.println(json);

    }
}
