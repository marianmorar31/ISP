package Components;

import Design.BoughtStuff;
import Design.ChooseComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class BaseComponent extends JFrame{
    public BaseComponent instance = this;
    public String title;
    public String imagePath;
    public String productName;
    public String type;
    public boolean available = true;
    JLabel productLabel, typeLabel, label;
    JButton bBack, bBuy;

    public BaseComponent(String title, String imagePath, String productName, String type) {
        this.title=title;
        this.imagePath=imagePath;
        this.productName=productName;
        this.type=type;
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 300);
        setVisible(true);
        init();
        getContentPane().setBackground(Color.pink);
    }

    public void init() {

        this.setLayout(null);
        int width = 150;
        int height = 20;

        ImageIcon baseImageIcon = new ImageIcon(imagePath);
        label = new JLabel(baseImageIcon,JLabel.CENTER);
        label.setBounds(10, 50, 150, 120);

        productLabel = new JLabel(this.productName);
        productLabel.setBounds(170, 70, width, height);



        typeLabel = new JLabel(this.type);
        typeLabel.setBounds(170, 100, width, height);



        bBack = new JButton("BACK");
        bBack.setBounds(10, 200, width, height);

        bBuy = new JButton("BUY");
        bBuy.setBounds(160, 200, width, height);

        bBack.addActionListener(new ButtonBack());
        bBack.setBackground(Color.pink);

        bBuy.addActionListener(new ButtonBuy());
        bBuy.setBackground(Color.pink);


        add(typeLabel);
        add(productLabel);
        add(bBack);
        add(label);
        add(bBuy);
    }

    @Override
    public String toString(){
        return this.productName;
    }

    public void setAvailable(boolean state){
        available=state;
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

    class ButtonBuy implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (available) {
                setAvailable(false);
                BoughtStuff.addComponent(instance);
                this.dispose();
                new ChooseComponent();
            } else {
                System.out.println("Not available");
                this.dispose();
                new ChooseComponent();
            }
        }

        private void dispose() {
            setVisible(false);
        }
    }

}
