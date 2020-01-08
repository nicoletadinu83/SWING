package exercitiul_12_4;

import javax.swing.*;

public class PAnel extends JPanel {
    public PAnel() {
        for (int i = 0; i < 3; i++) {
            add(new JButton("" + i));
        }

    }
}
