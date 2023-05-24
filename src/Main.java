import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        MainGUIWindow window = new MainGUIWindow();
        ArrayList<Question> list = new ArrayList<Question>();

        Question question1 = new Question("A logical operator that evaluates to true only if both sides are true", "&&");
        Question question2 = new Question("A logical operator that evaluates to true if either side is true", "||");
        Question question3 = new Question("A collection of pieces of data stored as indexed items under one name", "array");
        Question question4 = new Question("A type of variable or operation that evaluates to true or false", "boolean");
        Question question5 = new Question("An operation that creates a new string out of other strings by sticking them together", "concatenation");
        Question question6 = new Question("A variable that cannot change once its initial value is assigned", "constant");
        Question question7 = new Question("A piece of code that is run when an object is instantiated/created", "constructor");
        Question question8 = new Question("The most common data type for decimal numbers", "double");
        Question question9 = new Question("A keyword used for creating a constant", "final");
        Question question10 = new Question("The concept that a single named behavior can be performed differently by various subclasses", "polymorphism");

        list.add(question1);
        list.add(question2);
        list.add(question3);
        list.add(question4);
        list.add(question5);
        list.add(question6);
        list.add(question7);
        list.add(question8);
        list.add(question9);
        list.add(question10);

        Question.setList(list);
    }
}
