import javax.swing.*;
import java.awt.event.*;

public class Converter {

    protected static final double d = 0;

    public static void converter() {

        JFrame f = new JFrame("CURRENCY CONVERTER");

        JLabel l1, l2,l3,l4;

        JTextField t1, t2, t3,t4;

        JButton b1, b11, b2, b12, b3, b13, b4, b5, b6, b16, b26, b36, b46, b56;

        l1 = new JLabel("Enter Rupees:");
        l1.setBounds(20, 40, 100, 50);
        l2 = new JLabel("Enter Dollars:");
        l2.setBounds(20, 100, 100, 50);
        l3 = new JLabel("Enter Euro:");
        l3.setBounds(20, 160, 100, 50);
        l4 = new JLabel("Enter Yuan:");
        l4.setBounds(20, 220, 100, 50);

        t1 = new JTextField("");
        t1.setBounds(300, 40, 950, 45);
        t2 = new JTextField("");
        t2.setBounds(300, 100, 950, 45);
        t3 = new JTextField("");
        t3.setBounds(300, 160, 950, 45);
        t4 = new JTextField("");
        t4.setBounds(300, 220, 950, 45);
        

        b1 = new JButton("Rupees to Dollar");
        b1.setBounds(250, 400, 200, 50);
        b11 = new JButton("Euro to Dollar");
        b11.setBounds(250, 500, 200, 50);
        b2 = new JButton("Rupees to Euro");
        b2.setBounds(675, 400, 200, 50);
        b12 = new JButton("Dollars to Euro");
        b12.setBounds(675, 500, 200, 50);
        b3 = new JButton("Dollars to Rupees");
        b3.setBounds(1100, 400, 200, 50);
        b13 = new JButton("Euro to Rupees");
        b13.setBounds(1100, 500, 200, 50);
        b4 = new JButton("Clear All");
        b4.setBounds(250, 700, 200, 50);
        b5 = new JButton("Close");
        b5.setBounds(1100, 700, 200, 50);
        b6 = new JButton("Rupees to Yuan");
        b6.setBounds(250, 600, 200, 50);
        b16 = new JButton("Dollar to Yuan");
        b16.setBounds(675, 600, 200, 50);
        b26 = new JButton("Euro to Yuan");
        b26.setBounds(1100, 600, 200, 50);
        b36 = new JButton("Yuan to Rupees");
        b36.setBounds(250, 300, 200, 50);
        b46 = new JButton("Yuan to Dollar");
        b46.setBounds(675, 300, 200, 50);
        b56 = new JButton("Yuan to Euro");
        b56.setBounds(1100, 300, 200, 50);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(t1.getText());

                double d1 = (d / 83.13);

                String str1 = String.valueOf(d1);

                t2.setText(str1);
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d2 = Double.parseDouble(t2.getText());

                double d3 = (d2 * 83.13);

                String str2 = String.valueOf(d3);

                t1.setText(str2);
            }
        });

        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d4 = Double.parseDouble(t2.getText());

                double d5 = (d4 * 0.94);

                String str3 = String.valueOf(d5);

                t3.setText(str3);
            }
        });


        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double d6 = Double.parseDouble(t1.getText());

                double d7 =(d6 / 88.31);

                String str4 = String.valueOf(d7);

                t3.setText(str4);
            }
        });



        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double d8 = Double.parseDouble(t3.getText());

                double d9 =(d8 * 88.31);

                String str5 = String.valueOf(d9);

                t1.setText(str5);
            }
        });

        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double d10 = Double.parseDouble(t3.getText());

                double d11 =(d10 / 0.94);

                String str6 = String.valueOf(d11);

                t2.setText(str6);
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double d12 = Double.parseDouble(t1.getText());

                double d13 =(d12 * 0.088);

                String str7 = String.valueOf(d13);

                t4.setText(str7);
            }
        });

        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double d14 = Double.parseDouble(t2.getText());

                double d15 =(d14 * 7.20);

                String str8 = String.valueOf(d15);

                t4.setText(str8);
            }
        });

        b26.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double d16 = Double.parseDouble(t3.getText());

                double d17 =(d16 * 7.76);

                String str9 = String.valueOf(d17);

                t4.setText(str9);
            }
        });

        b36.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double d18 = Double.parseDouble(t4.getText());

                double d19 =(d18 / 0.088);

                String str10 = String.valueOf(d19);

                t1.setText(str10);
            }
        });

        b46.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double d20 = Double.parseDouble(t4.getText());

                double d21 =(d20 / 7.20);

                String str11 = String.valueOf(d21);

                t2.setText(str11);
            }
        });

        b56.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double d22 = Double.parseDouble(t4.getText());

                double d23 =(d22 / 7.76);

                String str12 = String.valueOf(d23);

                t3.setText(str12);
            }
        });



         b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });


        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b6);
        f.add(b16);
        f.add(b26);
        f.add(b36);
        f.add(b46);
        f.add(b56);


        f.setLayout(null);
        f.setSize(1550, 825);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        converter();
    }
}