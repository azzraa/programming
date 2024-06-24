class Book {
  private String title;

  public Book(String title) {
      this.title = title;
  }

  public String getTitle() {
      return title;
  }

  @Override
  public String toString() {
      return title;
  }
}

class Container<T> {
  private T data;

  public Container(T data) {
      this.data = data;
  }

  public T getData() {
      return data;
  }
}

public class Main {
  public static void main(String[] args) {
      String myWord = "Hello";
      Book myBook = new Book("My Book");
      Container<String> wordContainer = new Container<>(myWord);
      Container<Book> bookContainer = new Container<>(myBook);

      System.out.println(wordContainer.getData());
      System.out.println(bookContainer.getData());
  }
}
