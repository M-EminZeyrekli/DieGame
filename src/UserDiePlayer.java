import java.util.Scanner;

public class UserDiePlayer implements DiePlayer {
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        System.out.println(turnTotal);
        System.out.println("Roll or Hold?");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a == null) {
            return true;
        }
        return false;
    }

}
