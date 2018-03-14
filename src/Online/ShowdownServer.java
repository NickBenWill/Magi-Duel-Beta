package Online;

import Board.GameClient;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import org.json.JSONObject;
import org.json.JSONException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.*;


public class ShowdownServer implements Runnable{
    static Map<String, String> loginDB = new HashMap<String, String>();
    ServerSocket serverSocket = null;
    Socket clientSocket = null;
    GameClient mainClient = new GameClient(); // the fat one

    public void run(){

    }

    public void main(String[] args) throws IOException {
        initializeAccounts();
        try {
            serverSocket = new ServerSocket(4444);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 4444.");
            System.exit(1);
        }


        try {
            Socket clientSocket = serverSocket.accept();
            DataInputStream Sis = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream Sos = new DataOutputStream(clientSocket.getOutputStream());
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public void createAccount(String username, String password) throws IOException {
        boolean nameTaken = false;
        for (int i = 0; i <loginDB.size(); i++){
            if (loginDB.containsKey(username)){
                nameTaken = true;
            }
        }

        if (nameTaken){
                sendToPort("UsernameTaken");
        }
        else{
            loginDB.put(username, password);
            updateAccounts();
            sendToPort("AccountCreated");
        }
    }

    // oh my god it's time to parse CSV files
    public static void updateAccounts()  {

    }

    public static void initializeAccounts() throws IOException {
        JSONObject dataJson = parseJSONFile("/Resources/logins.json");
        loginDB = new Gson().fromJson(dataJson.toString(), new TypeToken<HashMap<String, String>>(){}.getType());
        System.out.println(loginDB);
    }


    public static JSONObject parseJSONFile(String filename) throws JSONException, IOException {
        return new JSONObject(new String(Files.readAllBytes(Paths.get(filename))));
    }

    public void sendToPort(String command) throws IOException{
        OutputStreamWriter osw;
        try {
            osw =new OutputStreamWriter(clientSocket.getOutputStream(), "UTF-8");
            osw.write(command, 0, command.length());
        }
        catch (IOException e) {
            System.err.print(e);
        }

    }


}
