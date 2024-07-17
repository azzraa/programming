public class CombineNames {
  public static void main(String[] args) {
      // Add your first names:
      String firstName = "";
      String lastName = "";

      // What's the full name?
      System.out.println(firstName.concat(" " + lastName));

      // Convert hashtag to lowercase
      String hashtag = "#100DaysOfCode";
      System.out.println(hashtag.toLowerCase());

      // Add a first name and a last name:
      String firstN = "Azra";
      String lastN = "Korkmaz";

      // What are the initials?
      System.out.println(firstN.charAt(0));
      System.out.println(lastN.charAt(0));

      // Find the index of a substring
      String code = ".... .. / .. .----. -- / ... --- -. -. -.-- / .- -. -.. / .. / .-.. .. -.- . / - --- / . .- - / .-. .- -- . -. ";
      System.out.println(code.indexOf(". .- -"));

      // Check string equality
      String password = "correcthorsebatterystaple";
      System.out.println(password.equals("correcthorsebatterystaple"));

      // Extract a substring
      String line = "The Heav'ns and all the Constellations rung";
      System.out.println(line.substring(4, 11));

      // Calculate the length of a string
      String tweet = "Liz Lemon, ninjas are kind of cool... I just dont know any personally. Get on that.";
      System.out.println(tweet.length());
  }
}
