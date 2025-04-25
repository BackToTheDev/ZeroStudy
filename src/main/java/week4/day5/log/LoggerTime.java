package week4.day5.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoggerTime {
}

class MyService {
    @LoggerTime
    public void doWork() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("일을 끝냈습니다.");
    }

    public void noLogMethod() {
        System.out.println("로그 안찍어");
    }
}
     class ExecutionTimer {
         public static void main(String[] args) throws Exception{
             MyService myService = new MyService();
             Method[] methods = MyService.class.getDeclaredMethods();

             for (Method method : methods) {
                 if (method.isAnnotationPresent(LoggerTime.class)) {
                     long start = System.currentTimeMillis();
                     method.invoke(myService);
                     long end = System.currentTimeMillis();
                     System.out.println("실행 시간: " + (end - start) + "ms");
                 } else {
                     method.invoke(myService);
                 }
             }
         }
    }

