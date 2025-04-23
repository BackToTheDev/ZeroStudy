package week4.day2.annotation;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class ReflectionTest {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("week4.day2.annotation.Hello");
        
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Deprecated.class)) {
                System.out.println(method.getName() + "는 @Deprecated가 붙어 있음");
            }
        }
    }
}