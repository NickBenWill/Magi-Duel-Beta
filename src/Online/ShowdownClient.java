package Online;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.net.*;
import java.io.*;

// use home pc as temp server, meanwhile talk to Jthumm about server architecture

public class ShowdownClient {
    public static ShowdownClient mdC = new ShowdownClient();
    public static ClientLogin launcher = new ClientLogin(mdC);
    public static ClientSignupForm signupForm = new ClientSignupForm(mdC);
    public String username;
    public String pass;
    public static boolean loggedIn = false;

    public static void main(String[] args) throws IOException {
        attemptConnection();
        launcher.setVisible();
        while (!loggedIn){
            try { Thread.sleep(100); }
            catch (InterruptedException e) { e.printStackTrace(); }

        }

    }

    public static void attemptConnection(){
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

    void createAccount(){
        launcher.setInvisible();
        signupForm.setVisible();
        launcher.clearOut();
        signupForm.clearOut();
    }

    void accountCreated(){
        signupForm.setInvisible();
        launcher.setVisible();
        launcher.clearOut();
        signupForm.clearOut();
    }
}
