import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

// Encapsulates attributes related to the game (boardWidth, boardHeight, birdX, birdY, birdImg etc.)
public class FlutteringFlora extends JPanel implements ActionListener, KeyListener {
    
    // Game Window
    private int boardWidth = 360;
    private int boardHeight = 640;

    // Images
    private Image birdImg;
    private Image topPipeImg;
    private Image bottomPipeImg;
    private Image opponentBirdImg;

    // Bird
    private int birdX = boardWidth / 8;
    private int birdY = boardHeight / 2;
    private int birdWidth = 34;
    private int birdHeight = 24;

    // Buttons
    private JButton restartButton; // Declare as instance variable
    private JButton exitButton; // Declare as instance variable

    // Bird class
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

    // OpponentBird class (Defined within FlutteringFlora class)
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
            this.width = 34;
            this.height = 24;
            this.x = boardWidth;
            this.y = boardHeight / 2;
            this.velocityX = -2;
            this.velocityY = 0;
        }

        void move() {
            x += velocityX;
            y += velocityY;

            if (x <= -width) {
                x = boardWidth;
                y = boardHeight / 2;;
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


    // Defined within FlutterinFlora
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
    private int velocityX = -4;
    private int velocityY = 0;
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

    public FlutteringFlora() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.PINK);
        setFocusable(true);
        addKeyListener(this);

        // Initialize buttons
        restartButton = new JButton("Restart");
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartGame();
            }
        });
        restartButton.setVisible(false); // Initially hide restart button
        add(restartButton);

        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exitButton.setVisible(false); // Initially hide exit button
        add(exitButton);

        // Load images
        birdImg = new ImageIcon(getClass().getResource("/resources/flutteringflora.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("/resources/toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("/resources/bottompipe.png")).getImage();
        opponentBirdImg = new ImageIcon(getClass().getResource("/resources/opponent.png")).getImage();

        // Load sound
        try {
            AudioInputStream jumpAudioIn = AudioSystem.getAudioInputStream(getClass().getResource("/resources/jump.wav"));
            jumpSound = AudioSystem.getClip();
            jumpSound.open(jumpAudioIn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Initialize Birds and Pipes
        bird = new Bird(birdImg);
        opponentBird = new OpponentBird(opponentBirdImg);
        pipes = new ArrayList<>();

        // Timer for placing pipes
        placePipeTimer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePipes();
            }
        });
        placePipeTimer.start();

        // Timer for game loop
        gameLoop = new Timer(1000 / 60, this);
        gameLoop.start();
    }

    // Method to place pipes
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

    // Override paintComponent to draw graphics
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        bird.draw(g);
        opponentBird.draw(g);

        for (Pipe pipe : pipes) {
            g.drawImage(pipe.img, pipe.x, pipe.y, pipe.width, pipe.height, null);
        }

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
        velocityY += gravity;
        bird.y += velocityY;
        bird.y = Math.max(bird.y, 0);

        opponentBird.move();

        // Check collision with opponent bird
        if (bird.getBounds().intersects(opponentBird.getBounds())) {
            gameOver = true; // Game over if collision with opponent bird
            if (score > highScore) {
                highScore = (int) score;
            }
        }

        // Move pipes
        for (int i = 0; i < pipes.size(); i++) {
            Pipe pipe = pipes.get(i);
            pipe.x += velocityX;

            // Check if bird passed the pipe
            if (!pipe.passed && bird.x > pipe.x + pipe.width) {
                score += 0.5;
                pipe.passed = true;
            }

            // Check collision with pipes
            if (collision(bird, pipe)) {
                gameOver = true;
                if (score > highScore) {
                    highScore = (int) score;
                }
            }
        }

        // Check if bird is out of bounds
        if (bird.y > boardHeight) {
            gameOver = true;
            if (score > highScore) {
                highScore = (int) score;
            }
        }
    }

    // Method to handle collision detection
    boolean collision(Bird a, Pipe b) {
        return a.x < b.x + b.width &&
               a.x + a.width > b.x &&
               a.y < b.y + b.height &&
               a.y + a.height > b.y;
    }

    // ActionListener implementation
    @Override
    public void actionPerformed(ActionEvent e) {
        move(); // Move game objects
        repaint(); // Redraw graphics

        // Check game over condition
        if (gameOver) {
            placePipeTimer.stop(); // Stop placing pipes
            gameLoop.stop(); // Stop game loop
            restartButton.setVisible(true); // Show restart button
            exitButton.setVisible(true); // Show exit button
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (gameOver) {
                restartGame(); // Restart game if game over
            } else {
                bird.jump(); // Bird jumps
            }
        }
    }

    // Method to restart the game
    private void restartGame() {
        bird.x = birdX;
        bird.y = birdY;
        velocityY = 0;

        // Clear pipes and reset game state
        pipes.clear();
        gameOver = false;
        score = 0;

        // Restart timers
        placePipeTimer.start();
        gameLoop.start();

        restartButton.setVisible(false);
        exitButton.setVisible(false);

        requestFocus();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
