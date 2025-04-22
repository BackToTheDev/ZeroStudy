package week4.day2.annotation.general.override;

public class OverrideMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printMessage();
        parent.printMessageNotOverride();

        Parent child = new Child();
        child.printMessage();
        child.printMessageNotOverride();
    }
}
