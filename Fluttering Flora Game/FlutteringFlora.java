import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class FlutteringFlora extends JPanel implements ActionListener, KeyListener {
    // Game Window
    private int boardWidth = 360;
    private int boardHeight = 640;

    // Images
    private Image birdImg;
    private Image topPipeImg;
    private Image bottomPipeImg;

    // Bird
    private int birdX = boardWidth / 8;
    private int birdY = boardWidth / 2;
    private int birdWidth = 34;
    private int birdHeight = 24;

    class Bird {
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;

        // Constructor
        Bird(Image img) {
            this.img = img;
        }
    }

    // Pipe class
    private int pipeX = boardWidth;
    private int pipeY = 0;
    private int pipeWidth = 64; // Scaled by 1/6
    private int pipeHeight = 512;

    class Pipe {
        int x = pipeX;
        int y = pipeY;
        int width = pipeWidth;
        int height = pipeHeight;
        Image img;
        boolean passed = false;

        Pipe(Image img) {
            this.img = img;
        }
    }

    // Game logic
    private Bird bird;
    private int velocityX = -4; // Move pipes to the left speed (simulates bird moving right)
    private int velocityY = 0; // Move bird up/down speed
    private int gravity = 1;

    private ArrayList<Pipe> pipes;
    private Random random = new Random();

    private Timer gameLoop;
    private Timer placePipeTimer;
    private boolean gameOver = false;
    private double score = 0;
    private int highScore = 0; // Track high score

    private JButton restartButton;
    private JButton exitButton;

    // Sound
    private Clip jumpSound;

    FlutteringFlora() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.PINK); // Set background color to pink
        setFocusable(true); // Set focus to the JPanel to receive key events
        addKeyListener(this); // Add key listener to JPanel

        // Load images
        birdImg = new ImageIcon(getClass().getResource("flutteringflora.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("bottompipe.png")).getImage();

        // Load sounds
        try {
            AudioInputStream jumpAudioIn = AudioSystem.getAudioInputStream(getClass().getResource("jump.wav"));
            jumpSound = AudioSystem.getClip();
            jumpSound.open(jumpAudioIn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Bird
        bird = new Bird(birdImg);
        pipes = new ArrayList<Pipe>();

        // Place pipes timer
        placePipeTimer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePipes();
            }
        });
        placePipeTimer.start();

        // Game Timer
        gameLoop = new Timer(1000 / 60, this); // Timer for game loop
        gameLoop.start();

        // Initialize buttons
        restartButton = new JButton("Restart");
        exitButton = new JButton("Exit");

        restartButton.setBounds(120, 300, 120, 40);
        exitButton.setBounds(120, 350, 120, 40);

        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartGame();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setLayout(null);
        add(restartButton);
        add(exitButton);

        restartButton.setVisible(false);
        exitButton.setVisible(false);
    }

    void placePipes() {
        int randomPipeY = (int) (pipeY - pipeHeight / 4 - Math.random() * (pipeHeight / 2));
        int openingSpace = boardHeight / 4;

        Pipe topPipe = new Pipe(topPipeImg);
        topPipe.y = randomPipeY;
        pipes.add(topPipe);

        Pipe bottomPipe = new Pipe(bottomPipeImg);
        bottomPipe.y = topPipe.y + pipeHeight + openingSpace;
        pipes.add(bottomPipe);
    }

    // Override the paintComponent method
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // Bird
        g.drawImage(birdImg, bird.x, bird.y, bird.width, bird.height, null);

        // Pipes
        for (int i = 0; i < pipes.size(); i++) {
            Pipe pipe = pipes.get(i);
            g.drawImage(pipe.img, pipe.x, pipe.y, pipe.width, pipe.height, null);
        }

        // Score
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.PLAIN, 32));
        if (gameOver) {
            g.drawString("Game Over", 10, 35);
            g.drawString("Score: " + (int) score, 10, 70);
            g.drawString("High Score: " + highScore, 10, 105);
            restartButton.setVisible(true);
            exitButton.setVisible(true);
        } else {
            g.drawString(String.valueOf((int) score), 10, 35);
        }
    }

    public void move() {
        // Bird
        velocityY += gravity;
        bird.y += velocityY;
        bird.y = Math.max(bird.y, 0); // Apply gravity to current bird.y, limit the bird, y to top of the canvas

        // Pipes
        for (int i = 0; i < pipes.size(); i++) {
            Pipe pipe = pipes.get(i);
            pipe.x += velocityX;

            if (!pipe.passed && bird.x > pipe.x + pipe.width) {
                score += 0.5; // Increment score
                pipe.passed = true;
            }

            if (collision(bird, pipe)) {
                gameOver = true;
                if (score > highScore) { // Check for new high score
                    highScore = (int) score;
                }
            }
        }

        if (bird.y > boardHeight) {
            gameOver = true;
            if (score > highScore) { // Check for new high score
                highScore = (int) score;
            }
        }
    }

    boolean collision(Bird a, Pipe b) {
        return a.x < b.x + b.width && // a's left edge is to the left of b's right edge
               a.x + a.width > b.x && // a's right edge is to the right of b's left edge
               a.y < b.y + b.height && // a's top edge is above b's bottom edge
               a.y + a.height > b.y; // a's bottom edge is below b's top edge
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move(); // Move objects
        repaint(); // Redraw screen
        if (gameOver) {
            placePipeTimer.stop();
            gameLoop.stop();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) { // Handle spacebar press
            velocityY = -9; // Set jump velocity

            // Play jump sound
            if (jumpSound != null) {
                jumpSound.stop(); // Stop previous instance if still playing
                jumpSound.setFramePosition(0); // Rewind to the beginning
                jumpSound.start(); // Play the sound
            }

            if (gameOver) { // Restart game if game over
                restartGame();
            }
        }
    }

    private void restartGame() {
        bird.y = birdY; // Reset bird position
        velocityY = 0; // Reset velocity
        pipes.clear(); // Clear pipes
        gameOver = false; // Reset game over flag
        score = 0; // Reset score
        gameLoop.start(); // Restart game loop timer
        placePipeTimer.start(); // Restart pipe placement timer
        restartButton.setVisible(false); // Hide restart button
        exitButton.setVisible(false); // Hide exit button
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
