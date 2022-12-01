package baseball;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        Computer computer = new Computer();
        List<Integer> RandomNumberList = computer.NumberGenerator();
        System.out.println(RandomNumberList);
    }
}
