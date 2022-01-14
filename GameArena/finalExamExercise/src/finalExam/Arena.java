package finalExam;

public class Arena {
    private Gamer p1;
    private Gamer p2;
    private static boolean isGameOver=false;

    public void addGamers(Gamer p1,Gamer p2){
        this.p1 = p1;
        this.p2  = p2;
    }

    public void startGame(){
        while(!isGameOver){
            p1.move();
            p2.move();

            processMoves();
            
        }
    }

    public void processMoves(){
        if(Arena.getIsGameOver())   return;

        if(p1.getSign() == HandSign.PAPER && p2.getSign() == HandSign.ROCK){
            p1.upWin();
        }else if(p1.getSign() == HandSign.ROCK && p2.getSign() == HandSign.SCISSOR){
            p1.upWin();
        }else if(p1.getSign() == HandSign.SCISSOR && p2.getSign() == HandSign.PAPER){
            p1.upWin();
        }else if(p1.getSign() == p2.getSign())
            Gamer.upDraw();
        else
            p2.upWin();
        
        displayData();
    }

    public static boolean getIsGameOver(){
        return isGameOver;
    }

    public static void setIsGameOver(boolean b){
        isGameOver = b;
    }

    private void displayData(){
        System.out.println("Player1: " + p1.getSign() + " | " + "Player2: " + p2.getSign());
        System.out.println("Player1 wins: " + p1.getWins() + " " + "Player1 wins: " + p2.getWins());
        System.out.println("Draws: " + Gamer.getDraws());
    }
}
