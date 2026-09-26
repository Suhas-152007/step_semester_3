import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if (playerMove.equals("Rock") && computerMove.equals("Scissors")) {
            return "Player Wins";
        }

        if (playerMove.equals("Paper") && computerMove.equals("Rock")) {
            return "Player Wins";
        }

        if (playerMove.equals("Scissors") && computerMove.equals("Paper")) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        String[] playerMoves = new String[5];
        String[] computerMoves = new String[5];
        String[] results = new String[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            String playerMove = sc.next();

            int randomNumber = random.nextInt(3);
            String computerMove = moves[randomNumber];

            String result = playRound(playerMove, computerMove);

            playerMoves[i] = playerMove;
            computerMoves[i] = computerMove;
            results[i] = result;

            System.out.println("Computer chose: " + computerMove);
            System.out.println(result);
            System.out.println();

            if (result.equals("Player Wins")) {
                playerWins++;
            } else if (result.equals("Computer Wins")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        System.out.println("----- Final Summary -----");
        System.out.println("Round\tPlayer\tComputer\tResult");

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "\t" + playerMoves[i]
                    + "\t" + computerMoves[i]
                    + "\t\t" + results[i]);
        }

        double winPercentage = (playerWins / 5.0) * 100;

        System.out.println();
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Draws: " + draws);
        System.out.println("Player Win Percentage: " + winPercentage + "%");

        sc.close();
    }
}