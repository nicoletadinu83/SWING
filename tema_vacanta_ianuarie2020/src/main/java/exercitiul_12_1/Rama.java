package exercitiul_12_1;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Rama extends JFrame {

    public Rama() {
        setTitle("My window");
        setSize(800, 900);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout(FlowLayout.LEFT, 4, 4));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        add(panel1);
        add(panel2);

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
        panel1.setBorder(new TitledBorder("Primul panou"));
        panel2.setBackground(Color.CYAN);
    }


}
