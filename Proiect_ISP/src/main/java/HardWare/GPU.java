package HardWare;

import Components.RADEON6900XT;
import Components.RTX3090;
import Design.ChooseComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GPU extends JFrame {
    JLabel user, label, label1;
    JButton bBack;
    JButton bVisualize, bVisualize1;

    public GPU() {
        setTitle("Graphic Processing Unit");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(380, 340);
        setVisible(true);
        getContentPane().setBackground(Color.yellow);

    }

    public void init() {

        this.setLayout(null);
        int width = 150;
        int height = 20;

        user = new JLabel("Choose a GPU ");
        user.setBounds(20, 30, width, height);

        bBack = new JButton("BACK");
        bBack.setBounds(10, 250, width, height);

        bVisualize = new JButton("Buy RTX3090");
        bVisualize.setBounds(10, 200, width, height);

        bVisualize1 = new JButton("Buy RADEON6900XT");
        bVisualize1.setBounds(200, 200, width, height);

        bBack.addActionListener(new ButtonBack());
        bBack.setBackground(Color.yellow);

        bVisualize.addActionListener(new ButtonRTX3090());
        bVisualize.setBackground(Color.yellow);

        bVisualize1.addActionListener(new ButtonRADEON6900XT());
        bVisualize1.setBackground(Color.yellow);

        ImageIcon RTX3090 = new ImageIcon("D:\\Faculta\\PROGRAME ISP\\REPOS\\30124_2_morar_marian_isp_labs\\Proiect\\gpu2.jpg");
        label = new JLabel(RTX3090,JLabel.CENTER);
        label.setBounds(10,70,150,120);

        ImageIcon RADEON6900XT = new ImageIcon("D:\\Faculta\\PROGRAME ISP\\REPOS\\30124_2_morar_marian_isp_labs\\Proiect\\gpu1.jpg");
        label1 = new JLabel(RADEON6900XT,JLabel.CENTER);
        label1.setBounds(200,70,150,120);

        add(user);
        add(bBack);
        add(bVisualize);
        add(bVisualize1);
        add(label);
        add(label1);

    }
    class ButtonBack implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            new ChooseComponent();
            this.dispose();
        }

        private void dispose() {
            setVisible(false);
        }
    }

    class ButtonRTX3090 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            new RTX3090();
            this.dispose();
        }

        private void dispose() {
            setVisible(false);
        }
    }

    class ButtonRADEON6900XT implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            new RADEON6900XT();
            this.dispose();
        }

        private void dispose() {

            setVisible(false);
        }
    }

}
