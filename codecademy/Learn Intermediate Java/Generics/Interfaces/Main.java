package Interfaces;

public class Main {
    public static void main(String[] args) {
      int myNumber = 24;
      String bookName = "Hello Book!";
      
      Retriever<Integer> containerRetriever = new Container<>(myNumber);
      Retriever<String> bookRetriever = new Book(bookName);
  
      System.out.println("Container retrieved data: "+ containerRetriever.retrieveData());
      System.out.println("Book retrieved data: " + bookRetriever.retrieveData());
  
    }
  }