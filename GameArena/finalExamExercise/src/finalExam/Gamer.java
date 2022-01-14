package finalExam;

import java.util.Scanner;

enum HandSign{
    ROCK,
    SCISSOR,
    PAPER
}

public class Gamer {
    private String name;
    private int wins;
    private HandSign sign;
    private static int draws;

    public Gamer(String name) {
        this.name = name;
    }

    public void move(){
        boolean inputInvalid;

        Scanner input = new Scanner(System.in);
            do{
                inputInvalid = false;
                char userChoice = input.next().charAt(0);

                switch(userChoice){
                    case 'r':
                        this.sign = HandSign.ROCK;
                        break;
                    case 's':
                        this.sign = HandSign.SCISSOR;
                        break;
                    case 'p':
                        this.sign = HandSign.PAPER;
                        break;
                    case 'q':
                        Arena.setIsGameOver(true);
                        break;
                    default:
                        inputInvalid = true;
                        System.out.println("Please enter a valid keyword");
                        break;
                        
                }
            }while(inputInvalid);
    }

    public HandSign getSign(){
        return sign;
    }

    public void upWin(){
        ++wins;
    }

    public static void upDraw(){
        ++draws;
    }

    public static int getDraws(){
        return draws;
    }

    public int getWins(){
        return wins;
    }
    
}
