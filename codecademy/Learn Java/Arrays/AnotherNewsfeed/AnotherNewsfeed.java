package codecademy.Arrays.AnotherNewsfeed;

public class AnotherNewsfeed {
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  String[] favoriteArticles;
  
  public AnotherNewsfeed(){
    favoriteArticles = new String[10];
    
  }
  
  public void setFavoriteArticle(int favoriteIndex, String newArticle){
    favoriteArticles[favoriteIndex] = newArticle;
    
  }
}

