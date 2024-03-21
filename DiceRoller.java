import java.util.Scanner;
public class DiceRoller {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        PairOfDice diceToRoll = new PairOfDice();
        int resultPlayer, resultComputer, playerWins, computerWins, ties;
        boolean cont = true;
        playerWins = computerWins = ties = 0;
    
    
        do 
        {
            diceToRoll.roll();
            resultPlayer = diceToRoll.getTotal();
            System.out.println("Player roll: " + diceToRoll);

            diceToRoll.roll();
            resultComputer = diceToRoll.getTotal();
            System.out.println("Computer roll: " + diceToRoll);

            if (resultPlayer > resultComputer){
                System.out.println("You win!");
                playerWins++;
            } else if (resultPlayer < resultComputer) {
                System.out.println("You lose!");
                computerWins++;
            } else {
                ties++;
            }
            System.out.println("Player Score: " + playerWins + "\t Computer Score: " + computerWins + "\tties: " + ties);
            System.out.println("Do you wish to continue? y/n ");

            cont = keyboard.nextLine().trim().toLowerCase().charAt(0) == 'y';
        } while (cont);
        System.out.println("Thanks for playing!");
    }
}