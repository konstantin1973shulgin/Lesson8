package Lesson8;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Window extends JFrame {

    public Window() throws HeadlessException {
        setSize(500, 500);
        FlowLayout fl; // -> -> ->
        BorderLayout bl; // N, S, W, E, CENTER
        GridLayout gl; // N x M
        JPanel panel = new JPanel(new GridLayout(3,3));
        JButton button = new JButton("CLEAR TEXT");
        JTextField text = new JTextField();

        button.addActionListener(a -> text.setText(""));

        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println(e.getKeyChar());
                if (e.getKeyChar() == 'r') {
                    button.setText("OLOLO");
                }
            }
        });
        panel.add(button);
        panel.add(text);
        panel.add(new JButton("CLICK ME HJHJHJHJH"));
        panel.add(new JButton("DON'T CLICK ME"));
        panel.add(new JButton("CLICK ME HJHJHJHJH"));
        panel.add(new JButton("DON'T CLICK ME"));
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}