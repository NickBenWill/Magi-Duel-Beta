package Online;
import java.net.*;
import java.io.*;

// use home pc as temp server, meanwhile talk to Jthumm about server architecture

public class ShowdownClient {
    public static ShowdownClient mdC = new ShowdownClient();
    static ClientLogin board = new ClientLogin(mdC);
    public String username;
    public String pass;

    public static void main(String[] args) throws IOException {



        DataOutputStream os = null;
        DataInputStream is = null;
        try {
            Socket clientSocket = new Socket("127.0.0.1", 4444);
            os = new DataOutputStream(clientSocket.getOutputStream());
            is = new DataInputStream(clientSocket.getInputStream());
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: hostname");
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: hostname");
        }



    }
}
