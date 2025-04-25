package week4.day5.practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface MyAnnotation {
    String value();
}

@MyAnnotation("This is MyClass")
class MyClass {

    String value = "This is MyClass";

    @MyAnnotation ("This is MyMethod")
    public void myMethod() {
        System.out.println("이게 메서드다: ");
    }
}

class ClassMain {
    public static void main(String[] args) {
        Class<MyClass> myClass = MyClass.class;

        if (myClass.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation classAnnotation = myClass.getAnnotation(MyAnnotation.class);
            System.out.println("Class Anntation: " + classAnnotation.value());
        }

        try {
            Method method = MyClass.class.getMethod("myMethod");
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation methodAnnotation = method.getAnnotation(MyAnnotation.class);
                System.out.println("Method Annotation: " + methodAnnotation.value());

            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
