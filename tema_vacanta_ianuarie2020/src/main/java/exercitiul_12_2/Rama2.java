package exercitiul_12_2;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Rama2 extends JFrame {
    public Rama2() {
        setTitle("My window");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(15, 13));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        add(panel1, BorderLayout.SOUTH);
        add(panel2, BorderLayout.CENTER);

        JButton buton1 = new JButton("Buton1");
        JButton buton2 = new JButton("Buton2");
        JButton buton3 = new JButton("Buton3");
        panel1.add(buton1);
        panel1.add(buton2);
        panel1.add(buton3);


        for (int i = 0; i < 3; i++) {
            panel2.add(new JButton("Calcul " + i));
        }

        panel1.setBackground(Color.BLUE);
        //  panel1.setBorder(new TitledBorder("Primul panou"));
        panel2.setBackground(Color.CYAN);
    }

}
