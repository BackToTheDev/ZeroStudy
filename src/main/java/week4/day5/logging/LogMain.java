// BE 36_권준성

package week4.day5.logging;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
 @interface Log {
}

class MyService {
    @Log
    public void greet(String name, int age) {
        System.out.println("Hello " + name + ", age " + age);
    }

    @Log
    public void sayGoodbye() {
        System.out.println("Goodbye!");
    }
}

public class LogMain {
    public static void main(String[] args) throws Exception{
        MyService service = new MyService();

        for (Method method : MyService.class.getDeclaredMethods()) {
            Object[] params;

            if (method.getParameterCount() == 2) {
                params = new Object[] {"교훈", 22};
            } else {
                params = new Object[]{};
            }

            System.out.print("로그: 호출된 매개변수: ");
            for (Object param : params) {
                System.out.print(param + " ");
            }
            System.out.println();

            method.invoke(service, params);
        }
    }
}
