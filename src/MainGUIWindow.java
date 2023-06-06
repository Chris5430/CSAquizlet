import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.util.ArrayList;


public class MainGUIWindow extends JFrame implements ActionListener{
    private JPanel mainPanel;
    private JPanel menuPanel;
    private JLabel title;
    private JButton csaButton;
    private JButton preCalcButton;
    private JButton usHistoryButton;
    private JLabel choose;
    private JButton button1;
    private JTextArea question;
    private JTextField answerFieldTextField;
    private JButton checkButton;

    private static boolean correct = false;

    private static Question current;

    private static int count = 0;

    private static int num = 0;


    public MainGUIWindow(){
        createUIComponents();
        //setQuiz();
    }

    private void createUIComponents(){
       menuPanel = new JPanel();
        menuPanel.setBackground(Color.darkGray);
       setContentPane(menuPanel);
        setSize(800,600);
        setLocation(500,200);
        setTitle("Quiz App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       csaButton = new JButton();
       preCalcButton = new JButton();
       usHistoryButton = new JButton();
       JButton[] buttons = {csaButton, preCalcButton, usHistoryButton};
       for (int i = 0; i < buttons.length; i++){
           buttons[i].setMaximumSize(new Dimension(250,100));
          buttons[i].setMinimumSize(new Dimension(250,100));
          buttons[i].setPreferredSize(new Dimension(250,100));
       }
       csaButton.setBackground(Color.red);
       preCalcButton.setBackground(Color.BLUE);
       usHistoryButton.setBackground(Color.GREEN);
       csaButton.setText("Computer Science A");
       csaButton.setForeground(Color.LIGHT_GRAY);
       preCalcButton.setText("Pre Calculus");
       preCalcButton.setForeground(Color.MAGENTA);
       usHistoryButton.setText("United States History");
       usHistoryButton.setForeground(Color.darkGray);
       csaButton.setFont(new Font(null, 1,20));
        preCalcButton.setFont(new Font(null, 1, 20));
        usHistoryButton.setFont(new Font(null, 1, 20));
        choose = new JLabel();
        choose.setMinimumSize(new Dimension(700,400));
        choose.setMaximumSize(new Dimension(701,401));
        choose.setPreferredSize(new Dimension(700,400));
        choose.setText("Choose a subject you want to study.");
        choose.setFont(new Font(null, 1, 40));
        choose.setForeground(Color.BLACK);
       menuPanel.add(csaButton);
       menuPanel.add(preCalcButton);
       menuPanel.add(usHistoryButton);
       menuPanel.add(choose);
       csaButton.addActionListener(this);
       preCalcButton.addActionListener(this);
       usHistoryButton.addActionListener(this);

       setVisible(true);

    }

    private void setQuiz(){
        setContentPane(mainPanel);
        setSize(800,600);
        setLocation(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        if (num == 0){
            title.setText("Welcome to the CSA quiz");
        }else if (num == 1){
            title.setText("Welcome to the Pre Calculus quiz");

            }  else if (num == 2){
            title.setText("Welcome to the US History quiz");
        }

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
            }else if(button.getText().equals("Computer Science A")){
                num = 0;
                setQuiz();
            }else if(button.getText().equals("Pre Calculus")){
                num = 1;
                setQuiz();
            }else if(button.getText().equals("United States History")){
                num = 2;
                setQuiz();
            }
        }
    }

    public void changeQuestion(){
        if (count < Question.getList().get(num).size()) {
            current = Question.getList().get(num).get(count);
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
