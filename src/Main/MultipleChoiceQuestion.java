package Main;

public class MultipleChoiceQuestion extends Question {

    //variables

    //constructor
    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }

    //method
    @Override
    public boolean checkAnswer(String answer) {

       String actualAnswer = getTheAnswer();

        if(answer.toUpperCase().equals(actualAnswer.toUpperCase())){
            return true;
        }else {
            return false;
        }
    }
}
