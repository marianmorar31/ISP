package HardWare;

import Components.I9_10700k;
import Components.Ryzen5_3600;
import Design.ChooseComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CPU extends JFrame  {
    JLabel user, label, label1 ;
    JButton bBack;
    JButton bVisualize, bVisualize1;

    public CPU() {
        setTitle("Central Processing Unit");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
    }

    public void init() {

        this.setLayout(null);
        int width = 150;
        int height = 20;

        setSize(380, 340);
        setVisible(true);
        getContentPane().setBackground(Color.blue);

        user = new JLabel("Choose a CPU ");
        user.setBounds(20, 30, width, height);

        bBack = new JButton("BACK");
        bBack.setBounds(10, 250, width, height);
        bBack.addActionListener(new ButtonBack());
        bBack.setBackground(Color.blue);

        bVisualize = new JButton("Buy I9_10700k");
        bVisualize.setBounds(10, 200, width, height);
        bVisualize.addActionListener(new ButtonI9_10700k());
        bVisualize.setBackground(Color.blue);

        bVisualize1 = new JButton("Buy Ryzen5_3600");
        bVisualize1.setBounds(200, 200, width, height);
        bVisualize1.addActionListener(new ButtonRyzen5_3600());
        bVisualize1.setBackground(Color.blue);

        ImageIcon I9_10700k = new ImageIcon("D:\\Faculta\\PROGRAME ISP\\REPOS\\30124_2_morar_marian_isp_labs\\Proiect\\cpu2.jpg");
        label = new JLabel(I9_10700k,JLabel.CENTER);
        label.setBounds(10,70,150,120);

        ImageIcon Ryzen5_3600 = new ImageIcon("D:\\Faculta\\PROGRAME ISP\\REPOS\\30124_2_morar_marian_isp_labs\\Proiect\\cpu1.jpg");
        label1 = new JLabel(Ryzen5_3600,JLabel.CENTER);
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

    class ButtonI9_10700k implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            new I9_10700k();
            this.dispose();
        }

        private void dispose() {
            setVisible(false);
        }
    }

    class ButtonRyzen5_3600 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            new Ryzen5_3600();
            this.dispose();
        }

        private void dispose() {

            setVisible(false);
        }
    }

}
