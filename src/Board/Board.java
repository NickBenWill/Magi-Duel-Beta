package Board;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Player.Player;
import sun.misc.Launcher;

/**
 * Created by 18rpaolucci on 9/25/2017.
 */
public class Board {
    private JPanel mainPanel;
    private JButton userAsset1;
    private JButton userAsset2;
    private JButton userAsset3;
    private JButton userAsset4;
    private JButton userAsset5;
    private JButton opAsset5Button;
    private JButton opAsset4Button;
    private JButton opAsset3Button;
    private JButton opAsset2Button;
    private JButton opAsset1Button;
    private JButton _opInPlay1;
    private JButton userInPlay1;
    private JButton _opInPlay2;
    private JButton userInPlay2;
    private JButton __opInPlay3;
    private JButton userInPlay3;
    private JButton __opInPlay4;
    private JButton userInPlay4;
    private JButton __opInPlay5;
    private JButton userInPlay5;
    private JButton __opInPlay6;
    private JButton userInPlay6;
    private JLabel userHealth;
    private JButton userCard5;
    private JButton userCard6;
    private JButton userCard7;
    private JButton userCard8;
    private JButton userCard9;
    private JButton userCard10;
    private JButton userCard4;
    private JButton userCard3;
    private JButton userCard2;
    private JButton userCard1;
    private JButton opCard1;
    private JButton opCard2;
    private JButton opCard3;
    private JButton opCard4;
    private JButton opCard5;
    private JButton opCard6;
    private JButton opCard7;
    private JButton opCard8;
    private JButton opCard9;
    private JButton opCard10;
    private JLabel opHealth;
    private JFrame mainFrame = new JFrame("Magi-Duel Alpha Board.GameClient");
    public static boolean playerDeciding = true;
    private GameClient gameClient;

    public Board(GameClient gameClient){
        this.gameClient = gameClient;
        this.mainFrame.setContentPane(this.getMainPanel());
        this.mainFrame.pack();
        this.mainFrame.setVisible(true);
        this.mainFrame.setResizable(true);
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        userCard1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameClient.getPlayer1turn()){

                }
            }
        });
        userCard2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        userCard3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        userCard4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        userCard5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        userCard6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        userCard7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        userCard8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        userCard9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        userCard10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    private void createUIComponents() {

        //custom creating components
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JButton getUserAsset1() {
        return userAsset1;
    }

    public void setUserAsset1(JButton userAsset1) {
        this.userAsset1 = userAsset1;
    }

    public JButton getUserAsset2() {
        return userAsset2;
    }

    public void setUserAsset2(JButton userAsset2) {
        this.userAsset2 = userAsset2;
    }

    public JButton getUserAsset3() {
        return userAsset3;
    }

    public void setUserAsset3(JButton userAsset3) {
        this.userAsset3 = userAsset3;
    }

    public JButton getUserAsset4() {
        return userAsset4;
    }

    public void setUserAsset4(JButton userAsset4) {
        this.userAsset4 = userAsset4;
    }

    public JButton getUserAsset5() {
        return userAsset5;
    }

    public void setUserAsset5(JButton userAsset5) {
        this.userAsset5 = userAsset5;
    }

    public JButton getOpAsset5Button() {
        return opAsset5Button;
    }

    public void setOpAsset5Button(JButton opAsset5Button) {
        this.opAsset5Button = opAsset5Button;
    }

    public JButton getOpAsset4Button() {
        return opAsset4Button;
    }

    public void setOpAsset4Button(JButton opAsset4Button) {
        this.opAsset4Button = opAsset4Button;
    }

    public JButton getOpAsset3Button() {
        return opAsset3Button;
    }

    public void setOpAsset3Button(JButton opAsset3Button) {
        this.opAsset3Button = opAsset3Button;
    }

    public JButton getOpAsset2Button() {
        return opAsset2Button;
    }

    public void setOpAsset2Button(JButton opAsset2Button) {
        this.opAsset2Button = opAsset2Button;
    }

    public JButton getOpAsset1Button() {
        return opAsset1Button;
    }

    public void setOpAsset1Button(JButton opAsset1Button) {
        this.opAsset1Button = opAsset1Button;
    }

    public JButton get_opInPlay1() {
        return _opInPlay1;
    }

    public void set_opInPlay1(JButton _opInPlay1) {
        this._opInPlay1 = _opInPlay1;
    }

    public JButton getUserInPlay1() {
        return userInPlay1;
    }

    public void setUserInPlay1(JButton userInPlay1) {
        this.userInPlay1 = userInPlay1;
    }

    public JButton get_opInPlay2() {
        return _opInPlay2;
    }

    public void set_opInPlay2(JButton _opInPlay2) {
        this._opInPlay2 = _opInPlay2;
    }

    public JButton getUserInPlay2() {
        return userInPlay2;
    }

    public void setUserInPlay2(JButton userInPlay2) {
        this.userInPlay2 = userInPlay2;
    }

    public JButton get__opInPlay3() {
        return __opInPlay3;
    }

    public void set__opInPlay3(JButton __opInPlay3) {
        this.__opInPlay3 = __opInPlay3;
    }

    public JButton getUserInPlay3() {
        return userInPlay3;
    }

    public void setUserInPlay3(JButton userInPlay3) {
        this.userInPlay3 = userInPlay3;
    }

    public JButton get__opInPlay4() {
        return __opInPlay4;
    }

    public void set__opInPlay4(JButton __opInPlay4) {
        this.__opInPlay4 = __opInPlay4;
    }

    public JButton getUserInPlay4() {
        return userInPlay4;
    }

    public void setUserInPlay4(JButton userInPlay4) {
        this.userInPlay4 = userInPlay4;
    }

    public JButton get__opInPlay5() {
        return __opInPlay5;
    }

    public void set__opInPlay5(JButton __opInPlay5) {
        this.__opInPlay5 = __opInPlay5;
    }

    public JButton getUserInPlay5() {
        return userInPlay5;
    }

    public void setUserInPlay5(JButton userInPlay5) {
        this.userInPlay5 = userInPlay5;
    }

    public JButton get__opInPlay6() {
        return __opInPlay6;
    }

    public void set__opInPlay6(JButton __opInPlay6) {
        this.__opInPlay6 = __opInPlay6;
    }

    public JButton getUserInPlay6() {
        return userInPlay6;
    }

    public void setUserInPlay6(JButton userInPlay6) {
        this.userInPlay6 = userInPlay6;
    }

    public JLabel getUserHealth() {
        return userHealth;
    }

    public void setUserHealth(JLabel userHealth) {
        this.userHealth = userHealth;
    }

    public JButton getUserCard5() {
        return userCard5;
    }

    public void setUserCard5(JButton userCard5) {
        this.userCard5 = userCard5;
    }

    public JButton getUserCard6() {
        return userCard6;
    }

    public void setUserCard6(JButton userCard6) {
        this.userCard6 = userCard6;
    }

    public JButton getUserCard7() {
        return userCard7;
    }

    public void setUserCard7(JButton userCard7) {
        this.userCard7 = userCard7;
    }

    public JButton getUserCard8() {
        return userCard8;
    }

    public void setUserCard8(JButton userCard8) {
        this.userCard8 = userCard8;
    }

    public JButton getUserCard9() {
        return userCard9;
    }

    public void setUserCard9(JButton userCard9) {
        this.userCard9 = userCard9;
    }

    public JButton getUserCard10() {
        return userCard10;
    }

    public void setUserCard10(JButton userCard10) {
        this.userCard10 = userCard10;
    }

    public JButton getUserCard4() {
        return userCard4;
    }

    public void setUserCard4(JButton userCard4) {
        this.userCard4 = userCard4;
    }

    public JButton getUserCard3() {
        return userCard3;
    }

    public void setUserCard3(JButton userCard3) {
        this.userCard3 = userCard3;
    }

    public JButton getUserCard2() {
        return userCard2;
    }

    public void setUserCard2(JButton userCard2) {
        this.userCard2 = userCard2;
    }

    public JButton getUserCard1() {
        return userCard1;
    }

    public void setUserCard1(JButton userCard1) {
        this.userCard1 = userCard1;
    }

    public JButton getOpCard1() {
        return opCard1;
    }

    public void setOpCard1(JButton opCard1) {
        this.opCard1 = opCard1;
    }

    public JButton getOpCard2() {
        return opCard2;
    }

    public void setOpCard2(JButton opCard2) {
        this.opCard2 = opCard2;
    }

    public JButton getOpCard3() {
        return opCard3;
    }

    public void setOpCard3(JButton opCard3) {
        this.opCard3 = opCard3;
    }

    public JButton getOpCard4() {
        return opCard4;
    }

    public void setOpCard4(JButton opCard4) {
        this.opCard4 = opCard4;
    }

    public JButton getOpCard5() {
        return opCard5;
    }

    public void setOpCard5(JButton opCard5) {
        this.opCard5 = opCard5;
    }

    public JButton getOpCard6() {
        return opCard6;
    }

    public void setOpCard6(JButton opCard6) {
        this.opCard6 = opCard6;
    }

    public JButton getOpCard7() {
        return opCard7;
    }

    public void setOpCard7(JButton opCard7) {
        this.opCard7 = opCard7;
    }

    public JButton getOpCard8() {
        return opCard8;
    }

    public void setOpCard8(JButton opCard8) {
        this.opCard8 = opCard8;
    }

    public JButton getOpCard9() {
        return opCard9;
    }

    public void setOpCard9(JButton opCard9) {
        this.opCard9 = opCard9;
    }

    public JButton getOpCard10() {
        return opCard10;
    }

    public void setOpCard10(JButton opCard10) {
        this.opCard10 = opCard10;
    }

    public JLabel getOpHealth() {return opHealth;}

    public void setOpHealth(JLabel opHealth) {this.opHealth = opHealth;}
}
