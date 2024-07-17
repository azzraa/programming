class Whale {
    String whaleSpecies;
    int whaleWeight;
    
    public Whale(String name, int weight) {
      whaleSpecies = name;
      whaleWeight = weight;
    }
  
    public String toString(){
      return "This is a " + whaleSpecies + " whale which weighs about " + whaleWeight + " pounds.";
    }
    
    public static void main(String[] args){
      Whale whale1 = new Whale("narwhal", 2100);
      Whale whale2 = new Whale("beluga", 3000);
      System.out.println(whale1);
      System.out.println(whale2);
    }
  }