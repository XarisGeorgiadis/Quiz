import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Round {

    private ArrayList<String> rounds;


    public Round() {
        rounds = new ArrayList<>();
        rounds.add("RIGHT ANSWER");
        rounds.add("BETTING");
    }

    public ArrayList<String> getRounds() {
        return rounds;
    }


    public void addPoints(ArrayList<Player> player, int points) {
        int tempPoints = player.get(0).getPoints() + points;
        player.get(0).setPoints(tempPoints);
    }


    public int randomQuestion(ArrayList<Questions> availableQuestions,String chosenCategory) {
        while (true) {
            for (int i = 0; i < availableQuestions.size(); i++) {
                if (chosenCategory.equals(availableQuestions.get(i).getCategory())) {
                    System.out.println(availableQuestions.get(i).getQuestion());
                    System.out.println("A. " + availableQuestions.get(i).getAnswers().get(0));
                    System.out.println("B. " + availableQuestions.get(i).getAnswers().get(1));
                    System.out.println("C. " + availableQuestions.get(i).getAnswers().get(2));
                    System.out.println("D. " + availableQuestions.get(i).getAnswers().get(3));
                    Scanner console = new Scanner(System.in);
                    while (true) {
                        int chosenAnswer = console.nextInt();
                        if (chosenAnswer > 0 && chosenAnswer < 5) {
                            if (availableQuestions.get(i).getAnswers().get(chosenAnswer - 1).equals(availableQuestions.get(i).correctAnswer)) {
                                System.out.println("The correct answer was: " + availableQuestions.get(i).getCorrectAnswer());
                                availableQuestions.remove(availableQuestions.get(i));
                                return 1000;
                            } else {
                                System.out.println("The correct answer was: " + availableQuestions.get(i).getCorrectAnswer());
                                availableQuestions.remove(availableQuestions.get(i));
                                return 0;
                            }
                        } else
                            System.out.println("Please choose a suitable answer!");
                    }
                }
                }
            }
        }


        public void startRound ( int numberOfRound, ArrayList<Questions > availableQuestions, String
        chosenCategory, ArrayList < Player > playerCount ){
            if (numberOfRound == 1) {
                RightAnswer r = new RightAnswer();
                r.rightAnswerPoints(availableQuestions, chosenCategory, playerCount);

            }
            if (numberOfRound == 2) {

            }

        }
    }