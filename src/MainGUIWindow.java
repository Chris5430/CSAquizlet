import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.util.ArrayList;


public class MainGUIWindow extends JFrame implements ActionListener{
    private JPanel mainPanel;
    private JLabel title;
    private JButton button1;
    private JTextArea question;
    private JTextField answerFieldTextField;
    private JButton checkButton;

    private static boolean correct = false;

    private static Question current;

    private static int count = 0;


    public MainGUIWindow(){
        createUIComponents();
    }

    private void createUIComponents(){
        setContentPane(mainPanel);
        setTitle("Quizlet");
        setSize(800,600);
        setLocation(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button1.addActionListener(this);
        checkButton.addActionListener(this);
        question.setVisible(false);
        answerFieldTextField.setVisible(false);
        checkButton.setVisible(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if (source instanceof JButton){
            JButton button = (JButton) source;
            if (button.getText().equals("Click to begin")){
                startQuiz();
            }else if (button.getText().equals("Check")){
                if(current.checkAnswer(answerFieldTextField.getText())){
                    changeQuestion();
                }
            }
        }
    }

    public void changeQuestion(){
        if (count < Question.getList().size()) {
            current = Question.getList().get(count);
            question.setText(current.getQuestion());
            answerFieldTextField.setText("");
            count++;
        }else {
            answerFieldTextField.setVisible(false);
            checkButton.setVisible(false);
            question.setText("Congratulations, you answered all the questions");
        }
    }

    public void startQuiz(){
        button1.setVisible(false);
        question.setVisible(true);
        answerFieldTextField.setVisible(true);
        checkButton.setVisible(true);
        changeQuestion();
    }




}
