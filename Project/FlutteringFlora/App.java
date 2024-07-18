import javax.swing.*;

public class App {
    public static void main(String[] args) {
        // Game Window dimensions
        int boardWidth = 360;
        int boardHeight = 640;

        // Using SwingUtilities.invokeLater to ensure thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Fluttering Flora"); // Creating JFrame
                frame.setSize(boardWidth, boardHeight); // Setting size of JFrame
                frame.setLocationRelativeTo(null); // Centering JFrame on screen
                frame.setResizable(false); // Preventing JFrame from being resized
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting close operation

                // Creating instance of FlutteringFlora (your game panel)
                FlutteringFlora flutteringFlora = new FlutteringFlora();
                frame.add(flutteringFlora); // Adding game panel to JFrame
                frame.setVisible(true); // Making JFrame visible

                // Requesting focus for game panel to receive key events
                flutteringFlora.requestFocus();
            }
        });
    }
}
