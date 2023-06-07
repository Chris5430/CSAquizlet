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
        list0.add(questiona3);
        list0.add(questiona4);
        list0.add(questiona5);
        list0.add(questiona6);
        list0.add(questiona7);
        list0.add(questiona8);
        list0.add(questiona9);
        list0.add(questiona10);

        Question.addList(list0);

        ArrayList<Question> list1 = new ArrayList<Question>();

        Question questionb1 = new Question("A law passed as part of the Compromise of 1850, which provided southern slaveholders with legal weapons to capture slaves who had escaped to the free states. The law was highly unpopular in the North and helped to convert many previously indifferent northerners to antislavery.", "fugitive slave act");
        Question questionb2 = new Question("Former US senator who in 1861, was chosen president of the Confederate States of America; had wide military and administrative experience", "jefferson davis");
        Question questionb3 = new Question("Lincoln's statement affirming the abolition of slavery as a war aim (1862) following the battle of Antietam. 4 million slaves were automatically freed.", "emancipation proclamation");
        Question questionb4 = new Question("The plan to rebuild the South after the Civil War and extend the ideas of liberty and equality to the slaves that had been freed during the war. There are three brands: Presidential (Lincoln and Johnson), Radical (Radical Republicans), and Johnsonian (Johnson).", "reconstruction");
        Question questionb5 = new Question("Northerner who moved to the South after the American Civil War, especially during Reconstruction, in order to profit from the instability and power vacuum that existed at this time.", "carpetbagger");
        Question questionb6 = new Question("An organization of workers formed for the purpose of advancing its members' interests in respect to wages, benefits, and working conditions.", "labor union");
        Question questionb7 = new Question("The process of people moving to cities.", "urbanization");
        Question questionb8 = new Question("A social movement against the consumption of alcoholic beverages.", "temperance movement");
        Question questionb9 = new Question("He was a writer of novels of social protest and political tracts; he is best known for his 1906 expose of the meatpacking industry, \"The Jungle.\"", "upton sinclair");
        Question questionb10 = new Question("Was the movement of 6 million African Americans out of the rural Southern United States to the urban Northeast, Midwest, and West that occurred between 1910 and 1970.", "great migration");

        list1.add(questionb1);
        list1.add(questionb2);
        list1.add(questionb3);
        list1.add(questionb4);
        list1.add(questionb5);
        list1.add(questionb6);
        list1.add(questionb7);
        list1.add(questionb8);
        list1.add(questionb9);
        list1.add(questionb10);

        Question.addList(list1);
    }
}
