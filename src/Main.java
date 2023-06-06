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

        Question.addList(list);

        ArrayList<Question> list0 = new ArrayList<Question>();

        Question questiona1 = new Question("What is the shape of the graph indicated by the equation?\n" +
                "\n" +
                "(x^2)/16+(y^2)/4=1", "ellipse");
        Question questiona2 = new Question("A conic section is represented by the following equation:\n" +
                "\n" +
                "(−4x^2)+(15y^2)+343=0\n" +
                "\n" +
                "What type of conic section does this equation represent?", "hyperbola");

        Question questiona3 = new Question("Find the vertex (x,y) for a parabola with equation\n" +
                "\n" +
                "y=(3x^2)−6x+1", "(1,-2)");
        Question questiona4 = new Question("What is the minimal value of \n" +
                "\n" +
                "(2x^2)+16x−7\n" +
                "\n" +
                "over all real numbers?", "-39");
        Question questiona5 = new Question("Consider the function \n" +
                "\n" +
                "f(x)=(x^2)−x\n" +
                "\n" +
                "Find the maximum of the function on the interval [0,1].", "0");
        Question questiona6 = new Question("Factor the polynomial if the expression is equal to zero when x=−6,−4, or 2.\n" +
                "\n" +
                "(x^3)+(8x^2)+4x−48", "(x+6)(x+4)(x-2)");
        Question questiona7 = new Question("The fourth term in an arithmetic sequence is -20, and the eighth term is -10. What is the hundredth term in the sequence?", "220");
        Question questiona8 = new Question("Consider the sequence: 2, 5, 8, 11, ...\n" +
                "\n" +
                "What is the fifteenth term in the sequence?", "44");
        Question questiona9 = new Question("Find the sum of all even integers from 250 to 350.", "15000");
        Question questiona10 = new Question("Find the sum of all even integers from 2 to 60.", "930");


        list0.add(questiona1);
        list0.add(questiona2);

        Question.addList(list0);
    }
}
