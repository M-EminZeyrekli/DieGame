/**
* ya 1 gelene kadar yada tur skoru 20 yada büyük olana kadar yada alınan tur
* skoru ile toplam skorun toplamı 100 yada büyük olana kadar atmaya devam et
*/
public class HoldAt20DiePlayer implements DiePlayer {
    
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        if (rolls == 1) {
            return false;
        }
        if (turnTotal >= 20) {
            return false;
        }
        if (myScore + turnTotal >= 100) {
            return false;
        } else {
            return true;
        }
        

    }
}
