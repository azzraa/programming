import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlappyBird {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flappy Bird");
        JPanel mainPanel = new JPanel(new CardLayout());
        StartPanel startPanel = new StartPanel(mainPanel);
        GamePanel gamePanel = new GamePanel();

        mainPanel.add(startPanel, "StartPanel");
        mainPanel.add(gamePanel, "GamePanel");

        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
