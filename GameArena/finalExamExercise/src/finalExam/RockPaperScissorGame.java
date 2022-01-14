package finalExam;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Gamer g1 = new Gamer("Player 1");
        Gamer g2 = new Gamer("Player 2");

        Arena arena = new Arena();
        arena.addGamers(g1,g2);

        arena.startGame();
    }
}
