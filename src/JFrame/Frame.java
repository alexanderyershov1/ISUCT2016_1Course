package JFrame;

import javax.swing.*;
import java.awt.event.*;
/**
 * Created by stud_6 on 25.03.17.
 */
    public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }



        }

