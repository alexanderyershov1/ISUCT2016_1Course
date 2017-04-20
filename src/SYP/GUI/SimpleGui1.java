package SYP.GUI;
import javax.swing.*;

/**
 * Created by maxim-mac on 24/03/2017.
 */
public class SimpleGui1 {
    public static void main (String[] args){

        JFrame frame = new JFrame();
        JButton button = new JButton("Сlick me!");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane() .add(button);

        frame.setSize(300,300);

        frame.setVisible(true);

        button.setText("I've been clicked!");
    }

}
