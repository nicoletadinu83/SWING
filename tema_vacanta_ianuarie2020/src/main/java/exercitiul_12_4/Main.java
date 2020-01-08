package exercitiul_12_4;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Rama0 rama = new Rama0();

        PAnel panou_1 = new PAnel();
        panou_1.setBackground(Color.GREEN);
        rama.add(panou_1, BorderLayout.SOUTH);

        PAnel panou_2 = new PAnel();
        panou_2.setBackground(Color.CYAN);
        rama.add(panou_2, BorderLayout.NORTH);
    }
}
