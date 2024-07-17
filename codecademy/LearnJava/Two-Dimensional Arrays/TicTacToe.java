public class TicTacToe {
  public static void main(String[] args) {
      float[][] floatTwoD = new float[4][10];

      char[][] ticTacToe = {
          {'X', 'O', 'O'},
          {'O', 'X', ' '},
          {'X', ' ', 'X'}
      };

      System.out.println("Initial state:");
      printBoard(ticTacToe);

      ticTacToe = new char[][] {
          {'O', 'X', 'X'},
          {'X', 'O', ' '},
          {'O', ' ', 'O'}
      };

      System.out.println("\nUpdated state:");
      printBoard(ticTacToe);
  }

  public static void printBoard(char[][] board) {
      for (int i = 0; i < board.length; i++) {
          for (int j = 0; j < board[i].length; j++) {
              System.out.print(board[i][j] + " ");
          }
          System.out.println();
      }
  }
}
