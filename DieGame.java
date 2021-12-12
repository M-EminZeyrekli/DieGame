
public class DieGame {
    public static final int GOAL_SCORE = 100;
    private DiePlayer[] players;
    private int scores[];

    public DieGame(DiePlayer[] players) {
        this.players = players;
        scores = new int[players.length];
    }

    public int playTurn(DiePlayer p, int playerNum) { // oyuncunun turdaki toplam skorunu return eder.
        Die d = new Die();
        int turtoplami = 0; // tur sonucu toplam skor
        int dieScor;// zar attiginda aldigi skor
        boolean decision;
        // oyuncunun verdigi karar
        do {
            dieScor = d.nextRoll();
            decision = p.isRolling(scores[playerNum], turtoplami, getMaxScore(), dieScor);
            turtoplami = turtoplami + dieScor;
            //System.out.println(dieScor);
            //System.out.println(decision);
        } while (dieScor != 1);
        if (decision == false) {
            return turtoplami;
        }
        if (dieScor == 1) {
            return 0;
        } else
            return -1;
    }

    public int play() {
        int indexofMaxScore = -1;
        while (getMaxScore() != 100) {
            for (int i = 0; i < players.length; i++) {
               this.scores[i] = playTurn(players[i], i);
                //System.out.println("test");
            }
            for (int i = 0; i < players.length; i++) {
                for (int j = i + 1; j < players.length; j++) {
                    if (scores[i] > scores[j]) {
                        indexofMaxScore = i;
                        //System.out.println("test2");
                    }
                }
            }
        }
        printScores();
        return indexofMaxScore;
    }

    public int getMaxScore() {
        int maximum = 0;
        for (int i = 0; i < players.length; i++) {
            for (int j = i + 1; j < players.length; j++) {
                if (scores[i] >= scores[j]) {
                    maximum = scores[i];
                }
            }
        }
        return maximum;
    }

    public void printScores() {
        for (int i = 0; i < players.length; i++) {
            System.out.print(this.players[i]+"-> Score:"+this.scores[i]);
            System.out.println("");
        }
    }

}
