import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {

    private static final int WIDTH = 800, HEIGHT = 600;
    private static final int BIRD_WIDTH = 30, BIRD_HEIGHT = 30;
    private static final int PIPE_WIDTH = 60, PIPE_GAP = 200;
    private int birdY = HEIGHT / 2, birdVelocity = 0;
    private int score = 0;
    private boolean gameOver = false;
    private boolean gameStarted = false;
    private ArrayList<Rectangle> pipes;
    private Random random;
    private Timer timer;

    public GamePanel() {
        this.setBackground(Color.cyan);
        pipes = new ArrayList<>();
        random = new Random();
        timer = new Timer(20, this);
    }

    public void startGame() {
        birdY = HEIGHT / 2;
        birdVelocity = 0;
        score = 0;
        gameOver = false;
        gameStarted = true;
        pipes.clear();
        for (int i = 0; i < 4; i++) {
            addPipe();
        }
        timer.start();
    }

    private void addPipe() {
        int height = 50 + random.nextInt(300);
        pipes.add(new Rectangle(WIDTH + PIPE_WIDTH, HEIGHT - height, PIPE_WIDTH, height));
        pipes.add(new Rectangle(WIDTH + PIPE_WIDTH, 0, PIPE_WIDTH, HEIGHT - height - PIPE_GAP));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.fillRect(100, birdY, BIRD_WIDTH, BIRD_HEIGHT);

        g.setColor(Color.green);
        for (Rectangle pipe : pipes) {
            g.fillRect(pipe.x, pipe.y, pipe.width, pipe.height);
        }

        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 36));
        g.drawString("Score: " + score, 10, 50);

        if (gameOver) {
            g.setFont(new Font("Arial", Font.BOLD, 72));
            g.drawString("Game Over", WIDTH / 4, HEIGHT / 2);
        } else if (!gameStarted) {
            g.setFont(new Font("Arial", Font.BOLD, 36));
            g.drawString("Click Start to Begin", WIDTH / 4, HEIGHT / 2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameOver) {
            timer.stop();
            return;
        }

        if (gameStarted) {
            birdY += birdVelocity;
            birdVelocity += 1;

            ArrayList<Rectangle> toRemove = new ArrayList<>();
            for (Rectangle pipe : pipes) {
                pipe.x -= 5;
                if (pipe.x + pipe.width < 0) {
                    toRemove.add(pipe);
                }
                if (pipe.intersects(new Rectangle(100, birdY, BIRD_WIDTH, BIRD_HEIGHT))) {
                    gameOver = true;
                }
            }
            pipes.removeAll(toRemove);
            if (pipes.size() < 4) {
                addPipe();
            }
            if (birdY > HEIGHT || birdY < 0) {
                gameOver = true;
            }

            if (!gameOver) {
                score++;
            }
        }

        repaint();
    }
}
