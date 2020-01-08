package exercitiul_12_3;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Rama3 extends JFrame {
    public Rama3() {
        setTitle("Fereastra mea");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 500);

        setLayout(new GridLayout(2, 3));

        JPanel panoulmic = new JPanel();
        JPanel panoulmare = new JPanel();

        add(panoulmic);
        add(panoulmare);

        for (int i = 0; i < 3; i++) {
            panoulmic.add(new JButton("Button " + i));
        }

        for (int j = 0; j < 3; j++) {
            panoulmare.add(new JButton("Calculeaza " + j));

            panoulmic.setBackground(Color.yellow);
            // panoulmic.setLayout(new GridLayout(2,1));
            panoulmare.setBackground(Color.GREEN);

        }

    }

}
