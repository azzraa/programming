import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel extends JPanel {
    private JPanel mainPanel;

    public StartPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mainPanel.getLayout();
                cl.show(mainPanel, "GamePanel");
                // Notify GamePanel to start the game
                ((GamePanel) mainPanel.getComponent(1)).startGame();
            }
        });

        add(startButton);
    }
}
