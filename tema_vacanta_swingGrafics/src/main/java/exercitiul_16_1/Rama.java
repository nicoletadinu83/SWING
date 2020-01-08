package exercitiul_16_1;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rama extends JFrame {
    JButton buton1 = new JButton("Buton1");
    JButton buton2 = new JButton("Buton2");
    JButton buton3 = new JButton("Buton3");

    public Rama() {
        setTitle("Linii colorate");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout(FlowLayout.LEFT, 4, 4));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        add(panel1);
        add(panel2);

        //JButton buton1 = new JButton("Buton1");
        //  JButton buton2 = new JButton("Buton2");
        //JButton buton3 = new JButton("Buton3");
        panel1.add(buton1);
        panel1.add(buton2);
        panel1.add(buton3);


        for (int i = 0; i < 3; i++) {
            panel2.add(new JButton("Calcul " + i));
        }

        panel1.setBackground(Color.BLUE);
        panel1.setBorder(new TitledBorder("Primul panou"));
        panel2.setBackground(Color.CYAN);

        Ascultator ascultator = new Ascultator();
        buton1.addActionListener(ascultator);
        buton2.addActionListener(ascultator);
        buton3.addActionListener(ascultator);
    }

    class Ascultator implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buton1) {
                System.out.println("Ati apasat butonul 1");
            } else if (e.getSource() == buton2) {
                System.out.println("Ati apasat butonul 2");
            } else if (e.getSource() == buton3) {
                System.out.println("Ati apasat butonul 3");
            }
        }
    }


}
