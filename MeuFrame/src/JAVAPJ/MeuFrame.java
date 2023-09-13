package JAVAPJ;

import javax.swing.*;

public class MeuFrame extends JFrame {
   public MeuFrame(){

       super ("Meu Frame");

       JFrame frame = new JFrame();

       JButton botao =  new JButton("Clique-me");

       frame.getContentPane().add(botao);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(350,350);
       frame.setVisible(true);

   }

    public static void main(String[] args) {
        new MeuFrame();
    }
}