import javax.swing.*;
import javax.swing.text.html.Option;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CategoryScreen extends JFrame implements ActionListener {

    JPanel backpanel = new JPanel(new BorderLayout());
    JPanel optionspanel = new JPanel(new GridLayout(2, 2));
    JLabel chooseCategory = new JLabel("Choose Category");
    JButton goToGame = new JButton("Play!");

    Database database = new Database();

    public CategoryScreen() {

        for(String element: database.categories){
            JButton button = new JButton(element);
            optionspanel.add(button);
            button.addActionListener(this);
        }

        add(backpanel);
        backpanel.add(optionspanel, BorderLayout.SOUTH);
        backpanel.add(chooseCategory, BorderLayout.NORTH);
        goToGame.addActionListener(e -> {
            GameScreen gameScreen = new GameScreen();
            setVisible(false);
            gameScreen.setVisible(true);
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400, 400);

    }

    public static void main(String[] args) {
        CategoryScreen categoryScreen = new CategoryScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     backpanel.add(goToGame,BorderLayout.CENTER);
     repaint();
     revalidate();
    }
}
