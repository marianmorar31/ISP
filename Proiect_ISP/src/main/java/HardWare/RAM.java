package HardWare;

import Components.CorsairVengenance;
import Components.HyperXFury;
import Design.ChooseComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RAM extends JFrame {
    JLabel user, label, label1 ;
    JButton bBack;
    JButton bVisualize, bVisualize1;

    public RAM() {
        setTitle("Random Acces Memory");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(380, 340);
        setVisible(true);
        getContentPane().setBackground(Color.red);

    }

    public void init() {

        this.setLayout(null);
        int width = 150;
        int height = 20;

        user = new JLabel("Choose RAM ");
        user.setBounds(20, 30, width, height);

        bBack = new JButton("BACK");
        bBack.setBounds(10, 250, width, height);

        bVisualize = new JButton("Buy HyperXFury");
        bVisualize.setBounds(10, 200, width, height);

        bVisualize1 = new JButton("Buy Corsair Vengenance");
        bVisualize1.setBounds(200, 200, width, height);

        bBack.addActionListener(new ButtonBack());
        bBack.setBackground(Color.red);

        bVisualize.addActionListener(new ButtonHyperXFury());
        bVisualize.setBackground(Color.red);

        bVisualize1.addActionListener(new ButtonCorsairVengenance());
        bVisualize1.setBackground(Color.red);

        ImageIcon CorsairVengenance = new ImageIcon("D:\\Faculta\\PROGRAME ISP\\REPOS\\30124_2_morar_marian_isp_labs\\Proiect\\ram2.jpg");
        label = new JLabel(CorsairVengenance,JLabel.CENTER);
        label.setBounds(10,70,150,120);

        ImageIcon HyperXFury = new ImageIcon("D:\\Faculta\\PROGRAME ISP\\REPOS\\30124_2_morar_marian_isp_labs\\Proiect\\ram1.jpg");
        label1 = new JLabel(HyperXFury,JLabel.CENTER);
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

    class ButtonCorsairVengenance implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            new CorsairVengenance();
            this.dispose();
        }

        private void dispose() {
            setVisible(false);
        }
    }

    class ButtonHyperXFury implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            new HyperXFury();
            this.dispose();
        }

        private void dispose() {
            setVisible(false);
        }
    }
}