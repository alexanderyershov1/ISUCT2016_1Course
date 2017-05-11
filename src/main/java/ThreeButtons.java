import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by stud_6 on 25.03.17.
 */
public class ThreeButtons{
    JFrame frame;
    JLabel label;

    public static void main (String[] args) {
        ThreeButtons gui = new ThreeButtons();
        gui.go();
    }

    public void go(){
        frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener());

        JButton secretButton = new JButton("Change Secret");
        secretButton.addActionListener(new SecretListener());

        label = new JLabel("I'm a label");

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);

        frame.getContentPane().add(BorderLayout.EAST,  labelButton);
        frame.getContentPane().add(BorderLayout.WEST,  label);
        frame.getContentPane().add(BorderLayout.NORTH, secretButton);

        frame.setSize(350,350);
        frame.setVisible(true);
    }



    class LabelListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            label.setText("Ауч");
        }
    }

    class ColorListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            frame.repaint();
        }
    }

    class SecretListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            label.setText("Секрет");
        }
    }
}
