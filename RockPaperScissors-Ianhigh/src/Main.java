import java.util.Scanner;       //import scanner

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;                            // if in while loop it reset everytime
        int computerScore = 0;
    while (true) {
    System.out.println("****************************************************************");
    System.out.println("Rock Paper Scissors"); // start screen


           // adding using input

    String playerMove;

    while (true)     //while loop makes sure player uses valid input
    {
        System.out.println("'r' for rock, 'p' for paper and 's' for scissors.");
        playerMove = scanner.nextLine();
        if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
            break;  // breaks loop if input is valid
        }
        System.out.println(playerMove + "is not a valid input");    //restarts loop if not valid

    }

    String[] rps;
    rps = new String[3];
    rps[0] = "r";           // array of values
    rps[1] = "p";
    rps[2] = "s";


    int computerMove = (int) Math.floor(Math.random() * 3);           // computer picking random numbers

    // taking random number associate that number with string ex. 1 = p


    System.out.println("You played:" + playerMove + "  Computer played:" + rps[computerMove]);


    String result = "congrats";


    if (playerMove.equals(rps[computerMove])) {
        result = "The game is a tie";          //checks for tie first,
    } else if (playerMove.equals("r")) {                               // checks for outcome of game
        if (rps[computerMove].equals("p")) {
            result = "You lost :(";
            computerScore++;
        } else if (rps[computerMove].equals("s")) {
            result = " YOU WIN CONGRATS!!!!";
            playerScore++;
        }
    } else if (playerMove.equals("p")) {
        if (rps[computerMove].equals("r")) {
            result = " YOU WIN CONGRATS!!!!";
            playerScore++;
        } else if (rps[computerMove].equals("s")) {
            result = "You lost :(";
            computerScore++;
        }
    } else if (playerMove.equals("s")) {
        if (rps[computerMove].equals("p")) {
            result = " YOU WIN CONGRATS!!!!";
            playerScore++;
        } else if (rps[computerMove].equals("r")) {
            result = "You lost :(";
            computerScore++;
        }
    }
    System.out.println("");/* not sure why but if this is not there the output is (rResult: The game is a tie)*/
    System.out.println("");
    System.out.println("Result: " + result);
    System.out.println("");
    System.out.println("Player score: " + playerScore + "  Computer Score: " +computerScore);
    System.out.println("Do you want to play again (y/n)");
    String playAgain = scanner.nextLine();                             // checking if player wants to play again
        if (computerScore == 3){
            System.out.println(" you are really bad at this ");
        }
            if (!playAgain.equals("y")){
                break;                                          // if player does not input y it ends the program
            }




}
    }
}
