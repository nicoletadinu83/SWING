package exercitiul_12_6;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class RamaY extends JFrame {
    private ImageIcon image1 = new ImageIcon("C:/Users/Niko/Desktop/imagini/s.png");
    private ImageIcon image2 = new ImageIcon("C:/Users/Niko/Desktop/imagini/sFrantei.png");
    private ImageIcon image3 = new ImageIcon("C:/Users/Niko/Desktop/imagini/steagulRomaniei.png");
    private ImageIcon image4 = new ImageIcon("C:/Users/Niko/Desktop/imagini/sGermaniei.png");

    JPanel panou = new JPanel();

    public RamaY() {
        setTitle("Rama cu imagini");
        setVisible(true);
        setSize(500, 300);
        add(panou);
        panou.setLayout(new GridLayout(2, 1, 5, 4));


        JLabel label1 = new JLabel(image1);
        panou.add(label1);
        label1.setBorder(new LineBorder(Color.BLACK, 2));

        JLabel label2 = new JLabel(image2);
        panou.add(label2);
        label2.setBorder(new LineBorder(Color.black, 2));

        JLabel label3 = new JLabel(image3);
        panou.add(label3);
        label3.setBorder(new LineBorder(Color.black, 2));

        JLabel label4 = new JLabel(image4);
        panou.add(label4);
        label4.setBorder(new LineBorder(Color.black, 2));
        //exista vreo varianta sa pot crea aceste label-uri si sa le setez bordura printr-o cale mai scurta?
        //initial ma gindisem la panou.add(new JLabet(image1));- dar nu puteam seta bordura


    }


}
