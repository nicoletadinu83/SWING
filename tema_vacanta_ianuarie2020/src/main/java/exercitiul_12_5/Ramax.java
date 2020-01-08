package exercitiul_12_5;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Ramax extends JFrame {
    public Ramax() {
        setTitle("O fereastra cu etichete");
        setVisible(true);
        setSize(280, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel panou = new JPanel();
        add(panou);
        panou.setLayout(new GridLayout(4, 2));

        JLabel label1 = new JLabel("Department of Computer Science");
        JLabel label2 = new JLabel("School of Computing");
        JLabel label3 = new JLabel("Armstrong Atlantic State University");
        JLabel labe4 = new JLabel("Tel:(921) 921-644");

        label1.setBorder(new LineBorder(Color.BLACK, 2));
        label2.setBorder(new LineBorder(Color.BLACK, 2));
        label3.setBorder(new LineBorder(Color.BLACK, 2));
        labe4.setBorder(new LineBorder(Color.BLACK, 2));

        panou.add(label1);
        panou.add(label2);
        panou.add(label3);
        panou.add(labe4);
    }

}
