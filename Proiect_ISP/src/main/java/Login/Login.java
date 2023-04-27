package Login;

import Design.ChooseComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Login extends JFrame {

    HashMap<String, String> accounts = new HashMap<>();

    JLabel user, pwd;
    JTextField tUser, tPwd, tAge;
    JButton bLogin;

    public Login() {

        accounts.put("Marian", "PCGARAGE");
        setTitle("LOGIN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(250, 260);
        setVisible(true);
        getContentPane().setBackground(Color.BLUE);

    }

    public void run(){
        setVisible(true);
    }

    public void init() {

        this.setLayout(null);
        int width = 80;
        int height = 20;

        user = new JLabel("Username ");
        user.setBounds(10, 50, width, height);

        pwd = new JLabel("Password ");
        pwd.setBounds(10, 100, width, height);


        tUser = new JTextField();
        tUser.setBounds(70, 50, 150, height);

        tPwd = new JTextField();
        tPwd.setBounds(70, 100, 150, height);

        tAge = new JTextField();
        tAge.setBounds(70, 150, 150, height);

        bLogin = new JButton("Login");
        bLogin.setBounds(10, 200, width, height);

        bLogin.addActionListener(new ButtonLogin());

        add(user);
        add(pwd);
        add(tUser);
        add(tPwd);
        add(tAge);
        add(bLogin);

    }

    class ButtonLogin implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String usr = Login.this.tUser.getText();
            String pwd = Login.this.tPwd.getText();

            if (Login.this.accounts.containsKey(usr)) {
                String correctPwd = Login.this.accounts.get(usr);

                if (correctPwd.equals(pwd)) {
                    new ChooseComponent();

                    this.dispose();
                }
            }
        }

        private void dispose() {

            setVisible(false);
        }
    }
}