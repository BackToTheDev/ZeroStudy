package week4.day2.annotation.general.override;

public class Child extends Parent {
    public void printMessageNotOverride() {
        System.out.println("I'm Parent class [not override]");
    }


    @Override
    public void printMessage() {
        System.out.println("I'm Child class");
    }

}
