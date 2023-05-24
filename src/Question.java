import java.util.ArrayList;

public class Question {

    private String question;
    private String answer;

    private static ArrayList<Question> list = new ArrayList<>();

    public Question(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() { return question; }
    public boolean checkAnswer(String answer){
        return this.answer.equals(answer);
    }

    public static void setList(ArrayList<Question> list1) { list = list1; }

    public static ArrayList<Question> getList() { return list; }
}
