package Online;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created by 18nbenjung on 3/12/2018.
 */
public class ClientLogin {
    private JPanel mainPanel;
    private JTextField usernameField;
    private JPasswordField passwordField1;
    private JButton connectButton;
    private JLabel logoLabel;
    private JButton createAccountButton;
    public JFrame mainFrame = new JFrame("Showdown Beta");
    private ShowdownClient showdownClient;

    public ClientLogin(ShowdownClient client){
        this.showdownClient = client;
        this.mainFrame.setContentPane(this.getMainPanel());
        this.mainFrame.pack();
        this.mainFrame.setResizable(true);
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                client.username = getUsernameField().getText();
                client.pass = getPasswordField1().getText();
            }
        });

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                client.createAccount();
            }
        });
    }


    private void createUIComponents() {
    }


    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(String usernameField) { this.usernameField.setText(usernameField); }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    public void setPasswordField1(String passwordField1) {
        this.passwordField1.setText(passwordField1);
    }

    public JButton getConnectButton() {
        return connectButton;
    }

    public void setConnectButton(JButton connectButton) {
        this.connectButton = connectButton;
    }

    public JLabel getLogoLabel() {
        return logoLabel;
    }

    public void setLogoLabel(JLabel logoLabel) {
        this.logoLabel = logoLabel;
    }

    public JFrame getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(JFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void setVisible(){ this.mainFrame.setVisible(true); }

    public void setInvisible(){ this.mainFrame.setVisible(false); }

    public void clearOut(){
        setUsernameField("");
        setPasswordField1("");
    }
}
