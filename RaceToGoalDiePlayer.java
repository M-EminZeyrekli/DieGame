/**
 * Eğer tsi >= 71 yada maxTS >= 71, toplam 100’ü bulana (yani oyunu kazanana)
 * kadar atmaya devam et. Diğer durumlarda tur skoru >= 21 + round((maxTS - tsi)
 * / 8), olana kadar yada tur skoru ile toplam skorun toplamı 100 yada büyük
 * olana kadar atmaya devam et.
 */

public class RaceToGoalDiePlayer implements DiePlayer { 

    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        int round = (maxScore - myScore) / 8;
        while (myScore >= 71 || maxScore >= 71) {
            if (myScore >= 100) {
                return false;
            }
            return true;
        }
        if (turnTotal >= (21 + round)) {
            return false;
        }
        if (myScore + turnTotal >= 100) {
            return false;
        }

        return true;

    }
}
