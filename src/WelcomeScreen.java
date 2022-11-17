import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JFrame implements ActionListener {
    JPanel backPanel = new JPanel(new BorderLayout());
    JLabel welcomeText = new JLabel("Welcome to our Quiz Game!");
    JButton newGameButton = new JButton("New Game");
    JTextField userNameTextField = new JTextField("Write your username:",20);

    public WelcomeScreen() {
        add(backPanel);
        backPanel.add(welcomeText,BorderLayout.NORTH);
        backPanel.add(newGameButton,BorderLayout.SOUTH);
        backPanel.add(userNameTextField,BorderLayout.WEST);
        userNameTextField.addActionListener(e -> {
            String userName = userNameTextField.getText();
        });
        newGameButton.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,400);
    }
    public String getUserName(){
        return userNameTextField.getText();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGameButton){
            setVisible(false);
            CategoryScreen categoryScreen = new CategoryScreen();
            categoryScreen.setVisible(true);
        }
    }
}
