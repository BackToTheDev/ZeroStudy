package week4.day4.javaChange.java16;

import org.w3c.dom.ls.LSOutput;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Jane", 26);
        System.out.println(person.name() + ", " + person.age());

        Object obj = "문자열";
        if (obj instanceof String str) {
            System.out.println(str.toUpperCase());
        }
    }


}
