package Online;

import Board.GameClient;
import java.net.*;
import java.io.*;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;


public class ShowdownServer {
    Map<String, String> loginDB = new HashMap<String, String>();

    public static void main(String[] args) throws IOException {
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
    void initializeAccounts() throws ParseException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("/Resources/test.csv"));
        String line =  null;
        HashMap<String,String> map = new HashMap<String, String>();

        while((line=br.readLine())!=null){
            String str[] = line.split(",");
            for(int i=1;i<str.length;i++){
                String arr[] = str[i].split(":");
                map.put(arr[0], arr[1]);
            }
        }
    }

}
