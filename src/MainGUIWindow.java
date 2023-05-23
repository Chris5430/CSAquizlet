import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class MainGUIWindow extends JFrame implements ActionListener{
    private JPanel mainPanel;
    private JLabel title;
    private JButton button1;
    private JLabel question;
    private JTextField answerFieldTextField;
    private JButton checkButton;

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
                runQuiz();
            }
        }
    }

    public void runQuiz(){
        button1.setVisible(false);
        question.setVisible(true);
        answerFieldTextField.setVisible(true);
        checkButton.setVisible(true);
    }
}
