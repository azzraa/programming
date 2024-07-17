class TwoDimensionalArrays {
    public static void main(String[] args) {
      String[][] colors = {{"rojo", "red"}, {"azul", "yellow"}, {"verde", "green"}};
  
      System.out.println(colors[1][1]);
      colors[1][1] = "blue";
      System.out.println(colors[1][1]);
  
      char[][] arr2D = new char[3][2];
      arr2D[0][0] = '1';
      arr2D[0][1] = 'A';
      arr2D[1][0] = '2';
      arr2D[1][1] = 'B';
      arr2D[2][0] = '3';
      arr2D[2][1] = 'C';
  
      for (int i = 0; i < arr2D.length; i++){
        for (int j = 0; j < arr2D[0].length; j++){
            System.out.println(arr2D[i][j]);
        }
      }
    }
  }