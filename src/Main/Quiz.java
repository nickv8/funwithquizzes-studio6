package Main;

import Main.Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    //variables
    private final ArrayList<Question> questions = new ArrayList<Question>();

    private int numberOfCorrectAnswers = 0;

    private final Scanner scanner = new Scanner(System.in);


    //constructor
    public Quiz(){

    }


    //methods
    public void addQuestion(Question question){
        this.questions.add(question);
    }

    public void runQuiz() {

        for (Question question : questions) {
            //print question
            System.out.println(question.getTheQuestion());
            //get user input
            String userAnswer = this.getUserAnswer();
            //check the answer
            boolean checkUserAnswer = question.checkAnswer(userAnswer);
            //increment the number of correct questions answered
            if (checkUserAnswer) {
                numberOfCorrectAnswers++;
            }
        }

        //grade the quiz

        double percentCorrect = ((double) numberOfCorrectAnswers / questions.size()) * 100;
        System.out.println("You scored a: " + percentCorrect + "%");
    }

    private String getUserAnswer() {
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }

}
