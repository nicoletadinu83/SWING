package exercitiul_16_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JLabel label1 = new JLabel("Number 1");
    JTextField text1 = new JTextField(8);
    JLabel label2 = new JLabel("Number 2");
    JTextField text2 = new JTextField(8);
    JLabel label3 = new JLabel("Result");
    JTextField text3 = new JTextField(12);

    JButton butonAdd = new JButton("Add");
    JButton butonSubstract = new JButton("Substract");
    JButton butonMultiply = new JButton("Multiply");
    JButton butonDivide = new JButton("Divide");

    private Calculator calculator= new Calculator();

    public Calculator() {
        setVisible(true);
        setSize(500, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**creem panoul1
         * */
        JPanel panou1 = new JPanel();
        JPanel panou2 = new JPanel();

        panou1.add(label1);
        panou1.add(text1);
        panou1.add(label2);
        panou1.add(text2);
        panou1.add(label3);
        panou1.add(text3);
        panou1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

        text3.setBackground(Color.GRAY);
        add(panou1);// adaugam panoul in rama



        panou2.add(butonAdd);
        panou2.add(butonSubstract);
        panou2.add(butonMultiply);
        panou2.add(butonDivide);
        //panou2.setLayout(new FlowLayout(FlowLayout.LEFT, 10,20));

        add(panou2, BorderLayout.SOUTH);

        ActionListener1 ascultator = new ActionListener1();
        butonAdd.addActionListener(ascultator);
        butonSubstract.addActionListener(ascultator);
        butonMultiply.addActionListener(ascultator);
        butonDivide.addActionListener(ascultator);

    }
        private double x1 = Double.parseDouble(text1.getText());
        private double y1 = Double.parseDouble(text2.getText());
        private double z1 = Double.parseDouble(text3.getText());


    public double getX1() {
        return x1;
    }


    public double getY1() {
        return y1;
    }

    public double getZ() {
        return z1;
    }

    class ActionListener1 implements ActionListener {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() ==butonAdd){
                    //calculator.add(getX1(), getY1());
                    System.out.println("Am efectuat adunarea");

                }
                    System.out.println();

            }
        }



    public double add(double x, double y){
        return x+y;
    }
    public double substract(double x, double y){
        return x-y;
    }
    public double multiply(double x, double y){
        return x*y;
    }
    public double divide(double x, double y){
        return x/y;
    }
}
