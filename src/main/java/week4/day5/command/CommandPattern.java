package week4.day5.command;
//Be 36_권준성
// Command Pattenr
// 요청을 객체로 캡슐화하여, 실행/취소/재실행 등을 유연하게 처리할 수 있는 행동 패턴입니다.
// 요청자와 수행자의 겹합도를 낮춰 다양한 명령을 손쉽게 관리할 수 있습니다.

class Light {
    public void turnOn() {
        System.out.println("불을 켭니다.");
    }

    public void turnOff() {
        System.out.println("불을 끕니다.");
    }
}

interface Command {
    void execute();
}

class LightOnCommand implements  Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}

class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}



public class CommandPattern {
    public static void main(String[] args) {
        Light light = new Light();
        Command on = new LightOnCommand(light);
        Command off = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(on);
        remote.pressButton();

        remote.setCommand(off);
        remote.pressButton();
    }
}

