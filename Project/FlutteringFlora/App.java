import javax.swing.*;

public class App {
    public static void main(String[] args) {
        // Game Window dimensions
        int boardWidth = 360;
        int boardHeight = 640;

        // Using SwingUtilities.invokeLater for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Fluttering Flora"); // Creating JFrame
                frame.setSize(boardWidth, boardHeight); 
                frame.setLocationRelativeTo(null); // Centering JFrame on screen
                frame.setResizable(false); 
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

                FlutteringFlora flutteringFlora = new FlutteringFlora();
                frame.add(flutteringFlora); 
                frame.setVisible(true); // Making JFrame visible

                flutteringFlora.requestFocus();
            }
        });
    }
}
