import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);       //imports the user input scanner
            System.out.println("***********************************");
            System.out.println("Please Enter a Random String to be Scrambled");
            String userInput = scanner.nextLine();      // taking user input and turing it into a array for each word
            char[] chars = userInput.toCharArray();//spilts at each space in string
            System.out.println("---------------------------");


            int max = 100;
            int min = 1;        //defining where this random number can be between
            int range = max - min + 1;
            int random = 0;


            for (int i = 0; i < 1; i++) {
                random = (int) (Math.random() * range) + min; 
            }

            System.out.println("here is your message encrypted:");


            for (int i = 0; i < chars.length; i++) {                 // using the idiom : does not let you reference outside of the for loop so (character : chars does not work)

                if (userInput.contains(" ")) {
                    chars[i] -= random;         // checking for the space and it there is one putting ASCII character down by the random number  which is just space
                } else {
                    chars[i] += random; // chars[i]s that are not space are just added ASCII by the random number
                }
                System.out.print(chars[i]);
            }


            System.out.println();
            System.out.println("---------------------------");

            System.out.println("would you like to decrypt it y/n");
            String answer = scanner.nextLine();
            System.out.println("---------------------------");
            if (!answer.equals("y")) {
                System.out.println("why would you not?!?");
                System.exit(0);
            }
            System.out.println("here is your message decrypted");
            for (int i = 0; i < chars.length; i++) {
                if (userInput.contains(" ")) {
                    chars[i] += random;         // insted of substracint it adds to reverse the effect
                } else {
                    chars[i] -= random;          // subtracts instead of adding
                }
                System.out.print(chars[i]);
            }
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("Do you want to play again (y/n)");
            String playAgain = scanner.nextLine();                             // checking if player wants to play again
            if (!playAgain.equals("y")) {
                break;                                          // if player does not input y it ends the program
            }
        }

    }
}


