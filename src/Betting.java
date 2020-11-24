import java.util.ArrayList;


/**
 * This class extends the Round Class and implements the Betting round of the Game.
 * If the player answers correctly he gains points equal to the ones he bet. Otherwise, they are deducted from his score.
 * @author Anastasios Kachrimanis
 * @author Charalampos Georgiadis
 * @version 24/11/2020
 */



public class Betting extends Round{


    public void bettingPoints(ArrayList<Questions> availableQuestions, String chosenCategory, ArrayList<Player> players, Menu menu) {
        for (int i = 0; i < 5; i++) {
            //for (Player p : players) {  //Will be added in version 2
                int bet = menu.betPoints(players.get(0));
                if (randomQuestion(availableQuestions, chosenCategory, players))
                    players.get(0).addPoints(bet);
                else
                    players.get(0).addPoints(-bet);
                System.out.println("Player's current points: " + players.get(0).getPoints() + "\n");

        }
    }
}
