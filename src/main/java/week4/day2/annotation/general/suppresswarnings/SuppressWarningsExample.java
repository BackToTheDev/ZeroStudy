package week4.day2.annotation.general.suppresswarnings;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsExample {

    @SuppressWarnings({"unchecked", "rawtypes", "unused"})
    public void something() {
        List list = new ArrayList();
        list.add("data");
        System.out.println(list.get(0));
    }
}
