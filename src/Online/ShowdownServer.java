package Online;

import Board.GameClient;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.json.JSONException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShowdownServer {
    static Map<String, String> loginDB = new HashMap<String, String>();

    public static void main(String[] args) throws IOException {
        initializeAccounts();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(4444);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 4444.");
            System.exit(1);
        }
        GameClient mainClient = new GameClient(); // the fat one

        try {
            Socket clientSocket = serverSocket.accept();
            DataInputStream Sis = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream Sos = new DataOutputStream(clientSocket.getOutputStream());
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }


    // oh my god it's time to parse CSV files
    public static void updateAccounts()  {


    }

    public static void initializeAccounts() throws IOException {
        String filename = "/Resources/logins.json";
        JSONObject jsonObject = parseJSONFile(filename);
    }


    public static JSONObject parseJSONFile(String filename) throws JSONException, IOException {
        String content = new String(Files.readAllBytes(Paths.get(filename)));
        return new JSONObject(content);
    }


}
