package JAVAPJ;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class Layouts extends JFrame {

    public Layouts(){
        super("Meu layout ");

        Container c = getContentPane();

        c.add(BorderLayout.NORTH, new JButton("Botão Norte"));
        c.add(BorderLayout.SOUTH , new JButton("Botão Sul "));
        c.add(BorderLayout.CENTER , new JButton("Botão Centro "));
        c.add(BorderLayout.EAST , new JButton("Botão Leste "));
        c.add(BorderLayout.WEST , new JButton("Botão Oeste "));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Layouts();
    }
}
