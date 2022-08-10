package Main;

import Main.CheckBoxQuestion;
import Main.MultipleChoiceQuestion;
import Main.Quiz;

public class QuizRunner {

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultipleChoice = new MultipleChoiceQuestion("What is the color of the grass?\nA: Red\nB: Blue\nC: Green", "C");
        myQuiz.addQuestion(myMultipleChoice);
        CheckBoxQuestion myCheckBox = new CheckBoxQuestion("What are the first three letters of the Alphabet?\nA: B\nB: D\nC: A\nD: C", "CAD");
        myQuiz.addQuestion(myCheckBox);
        TrueFalseQuestion myTrueFalse = new TrueFalseQuestion("Was this studio was harder then expected?\nA: True\nB: False", "A");
        myQuiz.addQuestion(myTrueFalse);


        myQuiz.runQuiz();

    }
}
