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

    public boolean hasPlace(List<Integer> computer, int indexNumber, int outsideNumber) {
        if (computer.get(indexNumber) == outsideNumber) {
            return true;
        }
        return false;
    }

    public int continueOREnd(int GameNumber) {
        while (true) {
            if (GameNumber == 2) {
                break;
            } else {
                if (GameNumber == 1) {
                    continue;
                }
            }
        }
        return GameNumber;
    }
}