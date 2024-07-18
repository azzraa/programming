package User;

public class User {
    // Fields with access modifiers
    private String username;
    private String password;
    private boolean isLoggedIn;

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLoggedIn = false; // Initialize as not logged in
    }

    // Method to log in
    public void login(String password) {
        if (this.password.equals(password)) {
            this.isLoggedIn = true;
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");
        }
    }

    // Method to log out
    public void logout() {
        this.isLoggedIn = false;
        System.out.println("Logged out.");
    }

    // Getter for username (public access)
    public String getUsername() {
        return username;
    }

    // Getter for login status (public access)
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}