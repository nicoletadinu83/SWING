package exercitiul_12_9;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Rama extends JFrame {

    public Rama() {
        setTitle("Exercitiul 12.9");
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panou = new JPanel();

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        panou.add(label1);
        panou.add(label2);
        panou.add(label3);

        ArrayList<ImageIcon> listaImagini = new ArrayList<ImageIcon>(54);
        ImageIcon imageIcon1 = new ImageIcon("C:/Users/Niko/Desktop/imagini/s.png");
        listaImagini.add(imageIcon1);
        ImageIcon imageIcon2 = new ImageIcon("C:/Users/Niko/Desktop/imagini/sFrantei.png");
        listaImagini.add(imageIcon2);

        for (int i = 0; i < 54; i++) {
            listaImagini.add(new ImageIcon());
            //label1.add(listaImagini < > (i);
           // label2.add(listaImagini < > (i--));
          //  label3.add(listaImagini < > (i++));
        }//am incercat sa creez toate imaginile pt cele 54 de carti


    }



}

