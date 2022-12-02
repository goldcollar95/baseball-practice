package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        Computer computer = new Computer();
        List<Integer> computerRandom = computer.NumberGenerator();
        Judgement judgement = new Judgement();
        Inputview inputview = new Inputview();
        Referee referee = new Referee();

        inputview.startMessage();
        String gameNumber = inputview.numberInputGame();
        inputview.startInputMessage(gameNumber);

        List<Integer> numbers = new ArrayList<>();
        for(String number : gameNumber.split("")){
            numbers.add(Integer.valueOf(number));
        }



        String result = "";
        while(!result.equals("0 볼 3 스트라이크")){

            result = referee.Judgement(computerRandom, numbers);
            System.out.println(result);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

        inputview.allCorretMessage();
        inputview.restartMessage();
        String re = inputview.restartGame();
        int gameRestart = judgement.continueOREnd(Integer.parseInt(re));
        while (true) {
            if (gameRestart == 2) {
                continue;
            }
            break;
        }
    }
//    public static List<Integer> askNumbers(){
//
//        System.out.println("숫자를 입력해 주세요 : ");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//
//
//
//        List<Integer> numbers = new ArrayList<>();
//        for(String number : input.split("")){
//            numbers.add(Integer.valueOf(number));
//        }
//        return numbers;
//    }


//        List<Integer> RandomNumberList = computer.NumberGenerator();
//        System.out.println(RandomNumberList);
//
//        int countCorrect = judgement.correctCount(Arrays.asList(1,2,3), Arrays.asList(1,2,3));
//        System.out.println(countCorrect);
//
//        boolean hasPlace = judgement.hasPlace(Arrays.asList(1,2,3), 2 , 3);
//        System.out.println(hasPlace);
//
//
//
//    }
}
