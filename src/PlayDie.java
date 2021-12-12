public class PlayDie {
    public static void main(String[] args) {
        HoldAt20DiePlayer p1 = new HoldAt20DiePlayer(); 
        HoldAt25DiePlayer p2 = new HoldAt25DiePlayer();
        MyDiePlayer p3 = new MyDiePlayer();
        RaceToGoalDiePlayer p4 = new  RaceToGoalDiePlayer();
        DiePlayer [] players ={p1,p2,p3,p4};
        DieGame d =new DieGame(players);
        System.out.println(d.play());
    }
}

