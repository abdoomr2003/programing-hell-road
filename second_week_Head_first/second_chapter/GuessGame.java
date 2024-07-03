/**
 * Player
 */
class Player {
    int Number = 0;
    public void guess() {
        Number = (int) (Math.random() * 10);
        System.out.println("i'm guessing " + Number);
    }
}
/**
 * Game
 */
class Game {
    Player p1;
    Player p2;
    Player p3;
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1state = false;
        boolean p2state = false;
        boolean p3state = false;

        int guessedNumber = (int) (Math.random() * 10);
        System.out.println("the number must guess from player is " + guessedNumber);

        while (true) {
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1 = p1.Number;
            System.out.println("Number guessed from Player 1 is " + guessp1);
            guessp2 = p2.Number;
            System.out.println("Number guessed from Player 2 is " + guessp2);
            guessp3 = p3.Number;
            System.out.println("Number guessed from Player 3 is " + guessp3);
            if (guessp1 == guessedNumber) {
                p1state = true;
            }
            if (guessp2 == guessedNumber) {
                p2state = true;
            }
            if (guessp3 == guessedNumber) {
                p3state = true;
            }

            if (p1state || p2state || p3state) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1state);
                System.out.println("Player two got it right? " + p2state);
                System.out.println("Player three got it right? " + p3state);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
        }
    }
public class GuessGame {
    public static void main(String[] args) {
        Game MyGame = new Game();
        MyGame.startGame();
    }
}
