package Design;

import HardWare.CPU;
import HardWare.GPU;
import HardWare.RAM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class ChooseComponent extends JFrame {

    JLabel user, user1;
    JButton bCPU, bBack, bGPU, bRAM, bReceipt;


    public ChooseComponent() {

        System.out.println("Marian has the following components in cart :\n");
        BoughtStuff.viewBoughtStuff();
        System.out.println("\n");

        setTitle("ChooseComponent");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        init();
        setSize(380, 290);
        setVisible(true);
        getContentPane().setBackground(Color.gray);

    }

    public void init() {
        this.setLayout(null);
        int width = 150;
        int height = 30;

        user = new JLabel("Welcome Customer");
        user.setBounds(150, 50, width, height);
        user.setFont(user.getFont().deriveFont(15f));

        user1 = new JLabel("Pick component type ");
        user1.setBounds(100, 80, 200, height);
        user1.setFont(user1.getFont().deriveFont(13f));


        bCPU = new JButton("CPU");
        bCPU.setBounds(20, 150, 100, height);
        bCPU.addActionListener(new ButtonCPU());
        bCPU.setBackground(Color.lightGray);

        bGPU = new JButton("GPU");
        bGPU.setBounds(130, 150, 100, height);
        bGPU.addActionListener(new ButtonGPU());
        bGPU.setBackground(Color.lightGray);

        bRAM = new JButton("RAM");
        bRAM.setBounds(240, 150, 100, height);
        bRAM.addActionListener(new ButtonRAM());
        bRAM.setBackground(Color.lightGray);

        bBack = new JButton("BACK");
        bBack.setBounds(20, 200, width, height);
        bBack.addActionListener(new ButtonBack());
        bBack.setBackground(Color.lightGray);

        bReceipt=new JButton("Get Receipt");
        bReceipt.setBounds(200, 200, width, height);
        bReceipt.addActionListener(new ButtonReceipt());
        bReceipt.setBackground(Color.lightGray);

        add(user);
        add(user1);
        add(bCPU);
        add(bBack);
        add(bGPU);
        add(bRAM);
        add(bReceipt);

    }

    public static void main(String[] args) {
        new ChooseComponent();
    }

    class ButtonCPU implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            new CPU();
            this.dispose();
        }

        private void dispose() {
            setVisible(false);
        }

    }

    class ButtonGPU implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            new GPU();
            this.dispose();
        }

        private void dispose() {
            setVisible(false);
        }

    }

    class ButtonRAM implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            new RAM();
            this.dispose();
        }

        private void dispose() {
            setVisible(false);
        }

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

    class ButtonReceipt implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            try {
                File myObj = new File("Receipt.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException r) {
                System.out.println("An error occurred.");
                r.printStackTrace();
            }

            try {
                FileWriter myWriter = new FileWriter("Chitanta.txt");
                myWriter.write("CHITANTA  \n");
                myWriter.write("Pret Total: "+BoughtStuff.getTotalCost()+" RON "+"\n");
                myWriter.write("\n");
                myWriter.close();
                System.out.println("Actiune finalizata cu succes");
            } catch (IOException c) {
                System.out.println("An error occurred.");
                c.printStackTrace();
            }

            System.exit(0);
        }

    }
}



