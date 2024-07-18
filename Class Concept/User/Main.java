package User;

public class Main {
    public static void main(String[] args) {
        // Creating a new User object using the constructor
        User user1 = new User("azzra", "password123");

        // Attempting to log in
        user1.login("123password"); // Output: Login failed.
        user1.login("password123"); // Output: Login successful.

        // Checking login status
        System.out.println(user1.getUsername() + " is logged in: " + user1.isLoggedIn()); // Output: azzra is logged in: true

        // Logging out
        user1.logout(); // Output: Logged out.
        System.out.println(user1.getUsername() + " is logged in: " + user1.isLoggedIn()); // Output: azzra is logged in: false
    }
}
