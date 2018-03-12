package Online;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientSignupForm {
    private JTextField usernameField;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton submitButton;
    private JPanel mainPanel;
    private JFrame mainFrame = new JFrame("Showdown Beta");
    private ShowdownClient showdownClient;


    public ClientSignupForm(ShowdownClient client) {
        this.showdownClient = client;
        this.mainFrame.setContentPane(this.getMainPanel());
        this.mainFrame.pack();
        this.mainFrame.setResizable(true);
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (getUsernameFieldText().isEmpty()){
                    JOptionPane.showMessageDialog(mainFrame, "Please enter a valid username");
                }
                else if (getPasswordField1Text().isEmpty() || getPasswordField2Text().isEmpty()){
                    JOptionPane.showMessageDialog(mainFrame, "Please enter a valid password");
                }
                else if (!getPasswordField1Text().equals(getPasswordField2Text())){
                    JOptionPane.showMessageDialog(mainFrame, "Passwords do not match");
                }
                else{

                }

            }
        });
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(String usernameField) { this.usernameField.setText(usernameField); }

    public String getUsernameFieldText(){ return usernameField.getText();}


    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    public void setPasswordField1(String passwordField1) {
        this.passwordField1.setText(passwordField1);
    }

    public String getPasswordField1Text(){ return passwordField1.getText();}


    public JPasswordField getPasswordField2() {
        return passwordField2;
    }

    public void setPasswordField2(String passwordField2) {
        this.passwordField2.setText(passwordField2);
    }

    public String getPasswordField2Text(){ return passwordField2.getText();}


    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
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
        setPasswordField2("");
    }
}
