import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class GameClient{

    protected final String host = "127.0.0.1";
    protected final int port = 54321;

    public GameClient() {
        try (Socket s = new Socket(host, port);
             PrintWriter writeToServer = new PrintWriter(s.getOutputStream(), true);
             BufferedReader readFromServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
             BufferedReader readUserInput = new BufferedReader(new InputStreamReader(System.in));
        ) {
            String fromUser = "";
            String fromServer = "";
            String userName = "";

            WelcomeScreen welcomeScreen = new WelcomeScreen();
            userName = welcomeScreen.userNameTextField.getText();
            System.out.println(userName);

            while ((fromServer = readFromServer.readLine()) != null) {
                System.out.println("Server: " + fromServer);
                if ((fromUser = readUserInput.readLine()) != null) {
                    System.out.println("Client: " + fromUser);
                    writeToServer.println(fromUser);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        GameClient gameClient = new GameClient();
    }
}
