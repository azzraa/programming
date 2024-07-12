import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
    private Timer timer;
    private int birdY = 300;
    private int birdVelocity = 0;
    
    public GamePanel() {
        timer = new Timer(20, this);
        timer.start();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    birdVelocity = -10;
                }
            }
        });
        
        setFocusable(true);
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(100, birdY, 30, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        birdVelocity += 1;
        birdY += birdVelocity;
        repaint();
    }
}
