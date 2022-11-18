import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameScreen extends JFrame implements ActionListener {

    //klass för själva spelet

    GameProtocol gp = new GameProtocol();
    Database database = new Database();
    JPanel gamePanel = new JPanel(new BorderLayout());
    JPanel answerButtonPanel = new JPanel(new GridLayout(2,2));
    JPanel labelPanel = new JPanel(new BorderLayout());
    JLabel questionLabel = new JLabel("Which year did the first iPhone come out"); // remove text
    JLabel currentQuestion = new JLabel("Question 1"); // remove text
    JButton answerOne = new JButton("1");
    JButton answerTwo = new JButton("2");
    JButton answerThree = new JButton("3");
    JButton answerFour = new JButton("4"); // don't keep numbers in here just for test
    GameScreen(){


        add(gamePanel);
        answerButtonPanel.add(answerOne);
        answerButtonPanel.add(answerTwo);
        answerButtonPanel.add(answerThree);
        answerButtonPanel.add(answerFour);
        gamePanel.add(answerButtonPanel, BorderLayout.SOUTH);
        labelPanel.add(currentQuestion,BorderLayout.NORTH);
        labelPanel.add(questionLabel,BorderLayout.SOUTH);
        gamePanel.add(labelPanel,BorderLayout.NORTH);


        setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,400);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
