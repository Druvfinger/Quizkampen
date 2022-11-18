import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JFrame implements ActionListener {

    //klass för en välkomstskärmen

    JPanel backPanel = new JPanel(new BorderLayout());
    JPanel userNamePanel = new JPanel();
    JLabel welcomeText = new JLabel("Welcome to our Quiz Game!");
    JButton newGameButton = new JButton("New Game");
    JLabel userNameLabel = new JLabel("Write your username:");
    JTextField userNameTextField = new JTextField(20);
    JButton userNameSubmmitButton = new JButton("Submit");

    GameProtocol gameProtocol = new GameProtocol();

    public WelcomeScreen() {
        add(backPanel);
        userNamePanel.add(userNameLabel);
        userNamePanel.add(userNameTextField);
        userNamePanel.add(userNameSubmmitButton);
        userNameSubmmitButton.addActionListener(e ->  {
            gameProtocol.setUsername(userNameTextField.getText());
        });
        backPanel.add(welcomeText,BorderLayout.NORTH);
        backPanel.add(newGameButton,BorderLayout.SOUTH);
        backPanel.add(userNamePanel,BorderLayout.WEST);
        newGameButton.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,400);
    }

    public static void main(String[] args) {
        WelcomeScreen welcomeScreen = new WelcomeScreen();
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
