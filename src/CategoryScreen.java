import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CategoryScreen extends JFrame implements ActionListener {

    JPanel backpanel = new JPanel(new BorderLayout());
    JPanel optionspanel = new JPanel(new GridLayout(2,2));
    JLabel chooseCategory = new JLabel("Choose Category");
    JButton option1 = new JButton("1");
    JButton option2 = new JButton("2");
    JButton option3 = new JButton("3");
    JButton option4 = new JButton("4");

    JButton goToGame = new JButton("Go to Game!");

    public CategoryScreen(){

        add(backpanel);
        optionspanel.add(option1);
        optionspanel.add(option2);
        optionspanel.add(option3);
        optionspanel.add(option4);
        option1.addActionListener(this);
        option2.addActionListener(this);
        option3.addActionListener(this);
        option4.addActionListener(this);
        backpanel.add(optionspanel,BorderLayout.SOUTH);
        backpanel.add(chooseCategory,BorderLayout.NORTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,400);

    }

    public static void main(String[] args) {
        CategoryScreen categoryScreen = new CategoryScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == option1){
            backpanel.add(chooseCategory,BorderLayout.CENTER);
            chooseCategory.setText("You chose: "+ option1.getText());
            backpanel.add(goToGame);
        } else if (e.getSource() == option2) {
            backpanel.add(chooseCategory,BorderLayout.CENTER);
            chooseCategory.setText("You chose: "+ option2.getText());
            backpanel.add(goToGame);
        }else if (e.getSource() == option3) {
            backpanel.add(chooseCategory,BorderLayout.CENTER);
            chooseCategory.setText("You chose: "+ option3.getText());
            backpanel.add(goToGame);
        } else if (e.getSource() == option4) {
            backpanel.add(chooseCategory,BorderLayout.CENTER);
            chooseCategory.setText("You chose: "+ option4.getText());
            backpanel.add(goToGame);
        }
        GameScreen gameScreen = new GameScreen();
        setVisible(false);
        gameScreen.setVisible(true);

    }
}
