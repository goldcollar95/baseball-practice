package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void judgementMethod(Inputview inputview, Referee referee) {
        Computer computer = new Computer();
        List<Integer> computerRandom = computer.NumberGenerator();
        System.out.println(computerRandom.get(0));
        System.out.println(computerRandom.get(1));
        System.out.println(computerRandom.get(2));

        String result = "";
        while (true) {
            List<Integer> numbers = new ArrayList<>();

            inputview.startMessage(); // 숫자야구게임을 시작합니다
            inputview.startInputMessage();

                String gameNumber = inputview.numberInputGame();


            for (String number : gameNumber.split("")) {
                numbers.add(Integer.valueOf(number));
            }

            result = referee.Judgement(computerRandom, numbers);
            if (result.equals("0볼 3스트라이크")){
                result = "3스트라이크";
            }
            System.out.println(result);
            if (result.equals("3스트라이크")) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                break;
                }
            }
        }


    public static void main(String[] args) {
        // TODO: 프로그램 구현

//        Computer computer = new Computer();
//        List<Integer> computerRandom = computer.NumberGenerator(); //135
//        System.out.println(computerRandom.get(0));
//        System.out.println(computerRandom.get(1));
//        System.out.println(computerRandom.get(2));
        Judgement judgement = new Judgement();
        Inputview inputview = new Inputview();
        Referee referee = new Referee();
        judgementMethod(inputview, referee);


        inputview.allCorretMessage();
        inputview.restartMessage();
        String re = inputview.restartGame();

            if (Integer.parseInt(re) == 1) {
                judgementMethod(inputview, referee);
            }
            if (Integer.parseInt(re) == 2){

            }

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

