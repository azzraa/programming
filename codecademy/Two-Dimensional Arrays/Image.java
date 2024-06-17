import java.util.Arrays;
public class Image {
	public static void main(String[] args) {
		int[][] imageData={
      {100,90,255,80,70,255,60,50},
			{255,10,5,255,10,5,255,255},
			{255,255,255,0,255,255,255,75},
			{255,60,30,0,30,60,255,255}
    };
		int[][] newImage = new int[4][6];
		

		for(int i = 0; i < newImage.length; i++) {
      for(int j = 0; j < newImage[i].length; j++) {
        newImage[i][j] = imageData [i][j];

      }
    }
    

		System.out.println(Arrays.deepToString(newImage));
			
		for(int i=0; i<newImage.length; i++){
      for(int j=0; j<newImage[i].length; j++){
        if(newImage[i][j]-50<0) {
          newImage[i][j] = 0;
        } else {
          newImage[i][j] -= 50;
        }         
      }
    }
		System.out.println(Arrays.deepToString(newImage));
	}
}