public static String ReverseString(String text) {
  String reversed = "";
  
  for (int i = 0; i < text.length(); i++) {
    char nextCharacter = text.charAt(i);
    reversed = nextCharacter + reversed;
  }
  
  return reversed;
}

public static void main(String[] args) {
  System.out.println(ReverseString("abc")); 
  System.out.println(ReverseString("hello")); 
  System.out.println(ReverseString("Java")); 
}

