package exercitiul_16_3;

import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mingea extends JFrame {
    private JButton buton1 = new JButton("Left");
    private JButton buton2 = new JButton("Right");
    private JButton buton3 = new JButton("Up");
    private JButton buton4 = new JButton("Down");
    private Circle mingea = new Circle();

    public Mingea() {//cream constructorul
        JPanel panou = new JPanel();
        panou.add(buton1);
        panou.add(buton2);
        panou.add(buton3);
        panou.add(buton4);

        add(panou, BorderLayout.SOUTH);//adaugam panoul in rama; panoul contine 4 butoane;
        add(mingea, BorderLayout.CENTER);//adaugam mingea in rama;

        setVisible(true);//setari rama
        setTitle("Jocul cu mingea");
        setSize(400, 400);

        buton1.addActionListener(new Ascultator());//adaugam ascultatorul pe fiecare buton
        buton2.addActionListener(new Ascultator());
        buton3.addActionListener(new Ascultator());
        buton4.addActionListener(new Ascultator());

    }

    class Ascultator implements ActionListener {//Inner class

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buton1) {
                mingea.left();
                repaint();
                System.out.println("Minge la stanga");

            } else if (e.getSource() == buton2) {
                mingea.right();
                repaint();
                System.out.println("Minge la dreapta");
            } else if (e.getSource() == buton3) {
                mingea.up();
                repaint();
                System.out.println("Mingea s-a deplasat sus");
            } else if (e.getSource() == buton4) {
                mingea.down();
                repaint();
                System.out.println("Mingea a cazut");
            }

        }
    }

    int radius = 40;

    class Circle extends JPanel {//Inner Class
        //int radius = 10;
        int x = 20;
        int y = 30;

        @Override
        public int getX() {
            return x;
        }

        @Override
        public int getY() {
            return y;
        }

        public void left() {
            mingea.x += 50;
        }

        public void right() {
            mingea.x -= 50;
        }

        public void up() {
            mingea.y -= 80;
        }

        public void down() {
            mingea.y += 50;
        }

        protected void paintComponent(Graphics g) {
            super.paintComponents(g);
            g.drawOval(100, 200, 50, 50);
            //getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius)

        }


    }

}
