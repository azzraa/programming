public class RainWater {

    public int efficientSolution(int[] heights) {
      int totalWater = 0;
      int leftPointer = 0;
      int rightPointer = heights.length - 1;
      int leftBound = 0;
      int rightBound = 0;
  
      while (leftPointer < rightPointer) {
        if (heights[leftPointer] < heights[rightPointer]) {
          if (heights[leftPointer] >= leftBound) {
            leftBound = heights[leftPointer];
          } else {
            totalWater += leftBound - heights[leftPointer];
          }
          leftPointer++;
        } else {
          if (heights[rightPointer] >= rightBound) {
            rightBound = heights[rightPointer];
          } else {
            totalWater += rightBound - heights[rightPointer];
          }
          rightPointer--;
        }
      }
  
      return totalWater;
    }
  
    public static void main(String[] args) {
      int[] heights = new int[]{4, 2, 1, 3, 0, 1, 2};
      RainWater rainWater = new RainWater();
      System.out.println("Amount of water captured: " + rainWater.efficientSolution(heights));
    }
  }
  