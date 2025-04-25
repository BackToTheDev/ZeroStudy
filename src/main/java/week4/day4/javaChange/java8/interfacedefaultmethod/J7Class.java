package week4.day4.javaChange.java8.interfacedefaultmethod;

public class J7Class implements J7Interface{
    @Override
    public void printClassName() {
        System.out.println(getClass().getSimpleName());
    }
}
