package baseball;

import java.util.List;

public class Judgement {

    public int correctCount(List<Integer> computer, List<Integer> player) {

        int count = 0;
        for (int i = 0; i < computer.size(); i++) {
            int playNumber = player.get(i);
            if (computer.contains(playNumber)) {
                count++;
            }
        }
        return count;
    }
}