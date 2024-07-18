import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

// Encapsulates attributes related to the game, such as boardWidth, boardHeight, birdX, birdY, birdImg etc.
public class FlutteringFlora extends JPanel implements ActionListener, KeyListener { // Extends JPanel to create a game panel
    // Game Window
    private int boardWidth = 360;
    private int boardHeight = 640;

    // Images
    private Image birdImg;
    private Image topPipeImg;
    private Image bottomPipeImg;
    private Image opponentBirdImg; // Added opponent bird image

    // Bird
    private int birdX = boardWidth / 8;
    private int birdY = boardHeight / 2;
    private int birdWidth = 34;
    private int birdHeight = 24;

    // Defined within FlutteringFlora
    class Bird {
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;

        Bird(Image img) {
            this.img = img;
        }

        void draw(Graphics g) {
            g.drawImage(img, x, y, width, height, null);
        }

        void jump() {
            velocityY = -9;
            if (jumpSound != null) {
                jumpSound.stop();
                jumpSound.setFramePosition(0);
                jumpSound.start();
            }
        }

        Rectangle getBounds() {
            return new Rectangle(x, y, width, height);
        }
    }

    // Defined within FlutteringFlora
    class OpponentBird {
        int x;
        int y;
        int width;
        int height;
        int velocityX;
        int velocityY;
        Image img;
        
        OpponentBird(Image img) {
            this.img = img;
            this.width = 34; // Adjust width as needed
            this.height = 24; // Adjust height as needed
            this.x = boardWidth * 3 / 4; // Initial x position (adjust as needed)
            this.y = boardHeight / 2; // Initial y position (adjust as needed)
            this.velocityX = -2; // Initial horizontal velocity (adjust as needed)
            this.velocityY = 0; // Initial vertical velocity (adjust as needed)
        }
    
        void move() {
            // Example movement logic (you can customize this)
            x += velocityX; // Horizontal movement
            y += velocityY; // Vertical movement
    
            // Example: Reverse direction if hitting walls (adjust as needed)
            if (x <= 0 || x + width >= boardWidth) {
                velocityX *= -1;
            }
    
            if (y <= 0 || y + height >= boardHeight) {
                velocityY *= -1;
            }
        }
    
        void draw(Graphics g) {
            g.drawImage(img, x, y, width, height, null);
        }
    
        Rectangle getBounds() {
            return new Rectangle(x, y, width, height);
        }
    }
    
    
    // Pipe class
    private int pipeX = boardWidth;
    private int pipeY = 0;
    private int pipeWidth = 64;
    private int pipeHeight = 512;

    // Defined within FlutteringFlora
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
    private OpponentBird opponentBird;
    private int velocityX = -4; // Pipe movement speed
    private int velocityY = 0; // Bird movement speed (up/down)
    private int gravity = 1;

    private ArrayList<Pipe> pipes;
    private Random random = new Random();

    private Timer gameLoop;
    private Timer placePipeTimer;
    private boolean gameOver = false;
    private double score = 0;
    private int highScore = 0;

    // Sound
    private Clip jumpSound;

    FlutteringFlora() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.PINK);
        setFocusable(true);
        addKeyListener(this);

        // Load images
        birdImg = new ImageIcon(getClass().getResource("/resources/flutteringflora.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("/resources/toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("/resources/bottompipe.png")).getImage();
        opponentBirdImg = new ImageIcon(getClass().getResource("/resources/opponent.png")).getImage();

        // Load sounds
        try {
            AudioInputStream jumpAudioIn = AudioSystem.getAudioInputStream(getClass().getResource("/resources/jump.wav"));
            jumpSound = AudioSystem.getClip();
            jumpSound.open(jumpAudioIn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Initialize bird
        bird = new Bird(birdImg);
        opponentBird = new OpponentBird(opponentBirdImg); // Initialize opponent bird
        pipes = new ArrayList<>();

        // Place pipes timer
        placePipeTimer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePipes();
            }
        });
        placePipeTimer.start();

        // Game loop timer
        gameLoop = new Timer(1000 / 60, this);
        gameLoop.start();
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

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // Draw bird
        bird.draw(g);
        // Draw opponent bird
        opponentBird.draw(g);

        // Draw pipes
        for (int i = 0; i < pipes.size(); i++) {
            Pipe pipe = pipes.get(i);
            g.drawImage(pipe.img, pipe.x, pipe.y, pipe.width, pipe.height, null);
        }

        // Draw score and game over screen
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.PLAIN, 32));
        if (gameOver) {
            g.drawString("Game Over", 10, 35);
            g.drawString("Score: " + (int) score, 10, 70);
            g.drawString("High Score: " + highScore, 10, 105);
        } else {
            g.drawString(String.valueOf((int) score), 10, 35);
        }
    }

    public void move() {
        // Move bird
        velocityY += gravity;
        bird.y += velocityY;
        bird.y = Math.max(bird.y, 0);

        // Move opponent bird
        opponentBird.move();

        // Check collision with opponent bird
        if (bird.getBounds().intersects(opponentBird.getBounds())) {
            gameOver = true; // Game over if collided with opponent bird
            if (score > highScore) {
                highScore = (int) score; // Update high score
            }
        }

        // Move pipes
        for (int i = 0; i < pipes.size(); i++) {
            Pipe pipe = pipes.get(i);
            pipe.x += velocityX;

            // Check if bird passed the pipe
            if (!pipe.passed && bird.x > pipe.x + pipe.width) {
                score += 0.5; // Increment score
                pipe.passed = true;
            }

            // Check collision with pipes
            if (collision(bird, pipe)) {
                gameOver = true;
                if (score > highScore) {
                    highScore = (int) score; // Update high score
                }
            }
        }

        // Check if bird is out of bounds
        if (bird.y > boardHeight) {
            gameOver = true;
            if (score > highScore) {
                highScore = (int) score; // Update high score
            }
        }
    }

    boolean collision(Bird a, Pipe b) {
        return a.x < b.x + b.width &&
               a.x + a.width > b.x &&
               a.y < b.y + b.height &&
               a.y + a.height > b.y;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move(); // Move player's bird, opponent bird, and pipes
        repaint(); // Redraw screen
        if (gameOver) {
            placePipeTimer.stop(); // Stop placing pipes
            gameLoop.stop(); // Stop game loop
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (gameOver) {
                restartGame(); // Restart game if game over
            } else {
                bird.jump(); // Bird jump action
            }
        }
    }

    private void restartGame() {
        bird.x = birdX; // Reset bird position
        bird.y = birdY;
        velocityY = 0; // Reset velocity
        pipes.clear(); // Clear pipes
        gameOver = false; // Reset game over flag
        score = 0; // Reset score
        placePipeTimer.start(); // Restart pipe placement
        gameLoop.start(); // Restart game loop
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
