package Online;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;

public class ShowdownServerThread implements Runnable {
    protected Socket clientSocket = null;
    protected String textFromServer = null;

    public ShowdownServerThread(Socket clientSocket, String textFromClient){
        this.clientSocket = clientSocket;
        this.textFromServer = textFromClient;
    }

    public void run(){
        try {
            InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
