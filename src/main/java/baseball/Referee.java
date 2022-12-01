package baseball;

import java.util.List;

public class Referee {


    public String Judgement(List<Integer> computer, List<Integer> player){
        Judgement judgement = new Judgement();
        // 몇 개의 숫자가 같은지 알아낸 뒤
        int correctCount = judgement.correctCount(computer, player);

        // 스트라이크의 개수를 구해 뺀다.
        int strike = 0;
        for(int index = 0; index < player.size(); index++){
            if(judgement.hasPlace(computer, player.get(index), index )){
                strike++;
            }
        }
        // 남은 수는 볼의 개수이다.
        int ball = correctCount - strike;

        if(correctCount == 0){
            return "낫싱";
        }

        return ball + " 볼 " + strike + " 스트라이크 ";
    }
}
