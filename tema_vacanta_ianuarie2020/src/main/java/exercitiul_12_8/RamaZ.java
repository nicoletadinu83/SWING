package exercitiul_12_8;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class RamaZ extends JFrame {
    public RamaZ() {
        setTitle("My window");
        setSize(500, 500);
        setVisible(true);

        JPanel panou = new JPanel();
        add(panou);

        JLabel label1 = new JLabel("Black");
        label1.setBackground(Color.WHITE);
        label1.setForeground(Color.BLACK);
        label1.setBorder(new LineBorder(Color.YELLOW, 3));
        Font font1 = new Font("Times New Roman", Font.BOLD, 20);
        Border border1 = new LineBorder(Color.YELLOW, 2);

        label1.setFont(font1);
        label1.setToolTipText("Black");
        panou.add(label1);


        JLabel label2 = new JLabel("Blue");
        label2.setBackground(Color.WHITE);
        label2.setForeground(Color.BLUE);
        label2.setBorder(border1);
        label2.setFont(font1);
        label2.setToolTipText("Blue");
        panou.add(label2);

        JLabel label3 = new JLabel("Cyan");
        label3.setBackground(Color.WHITE);
        label3.setForeground(Color.CYAN);
        label3.setBorder(border1);
        label3.setFont(font1);
        label3.setToolTipText("Cyan");
        panou.add(label3);

        JLabel label4 = new JLabel("Green");
        label4.setBackground(Color.WHITE);
        label4.setForeground(Color.GREEN);
        label4.setBorder(border1);
        label4.setFont(font1);
        label4.setToolTipText("Green");
        panou.add(label4);

        JLabel label5 = new JLabel("Magenta");
        label5.setBackground(Color.WHITE);
        label5.setForeground(Color.MAGENTA);
        label5.setBorder(border1);
        label5.setFont(font1);
        label5.setToolTipText("Magenta");
        panou.add(label5);

        JLabel label6 = new JLabel("Orange");
        label6.setBackground(Color.WHITE);
        label6.setForeground(Color.ORANGE);
        label6.setBorder(border1);
        label6.setFont(font1);
        label6.setToolTipText("Orange");
        panou.add(label6);

        panou.setLayout(new GridLayout(2,3,4,4));
    }


}
