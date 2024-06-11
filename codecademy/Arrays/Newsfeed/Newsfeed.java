public class Newsfeed {
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    public int[] views = {0, 0, 0, 0};
    
    public Newsfeed(){
  
    }
      
    public String[] getTopics(){
      return topics;
    }
    
    // Create getFirstTopic() below
    public String getFirstTopic() {
      return topics[0];
    }
  
    
    public void viewTopic(int topicIndex){
      views[topicIndex] ++;
      
    }
  }