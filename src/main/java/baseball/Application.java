package baseball;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        Computer computer = new Computer();
        List<Integer> RandomNumberList = computer.NumberGenerator();
//        System.out.println(RandomNumberList);

        Judgement judgement = new Judgement();
        int countCorrect = judgement.correctCount(Arrays.asList(1,2,3), Arrays.asList(1,2,3));
        System.out.println(countCorrect);

        boolean hasPlace = judgement.hasPlace(Arrays.asList(1,2,3), 2 , 3);
        System.out.println(hasPlace);



    }
}
