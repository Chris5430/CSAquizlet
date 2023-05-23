public class Question {

    private String question;
    private String answer;

    public Question(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public boolean checkAnswer(String answer){
        return this.answer.equals(answer);
    }
}
