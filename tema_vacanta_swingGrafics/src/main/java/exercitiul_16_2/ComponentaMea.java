package exercitiul_16_2;

import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class ComponentaMea extends JFrame {
    public static void main(String[] args) {
        ComponentaMea c1 = new ComponentaMea();

        c1.setSize(400, 400);
        c1.setTitle("Componenta Mea");
        c1.setVisible(true);
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setLocationRelativeTo(null);
    }

    public ComponentaMea() {
        addComponentListener(new ComponentListener() {
            //@Override
            public void componentResized(ComponentEvent e) {
                System.out.println("The component is resized");

            }

            //  @Override
            public void componentMoved(ComponentEvent e) {
                System.out.println("The component is moved");
            }

            // @Override
            public void componentShown(ComponentEvent e) {
                System.out.println("Show the component");
            }

            //  @Override
            public void componentHidden(ComponentEvent e) {
                System.out.println("Hide the component");
            }
        });
    }
    //aici orice actiune intreprind asupra ferestrei pe consola  listeaza toate metodele,
    //nu listeaza doar mesajul aferent actiunii realizate(asa cum ar trebui);
    //ar mai trebui adaugat ceva...un if ..else(poate), dar nu imi dau seama cum...

}
