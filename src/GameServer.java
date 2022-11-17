import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class GameServer {
    int port = 54321;
    public GameServer(){
        try(ServerSocket ss = new ServerSocket(port);
            Socket s = ss.accept();
            PrintWriter writeToClient = new PrintWriter(s.getOutputStream(),true);
            BufferedReader readFromClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        ){
            String input;
            String output;

            GameProtocol gameProtocol = new GameProtocol();
            output = gameProtocol.processInput(null);
            writeToClient.println(output);

            while ((input = readFromClient.readLine()) != null){
                output = gameProtocol.processInput(input);
                writeToClient.println(output);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        GameServer gameServer = new GameServer();
    }
}
