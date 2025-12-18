package Main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Setting frame for the launch
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Aukult");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Adding methods and fields from GamePanel class
        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.pack();
        gamePanel.startGameThread();
    }
}
