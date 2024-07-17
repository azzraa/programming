class Pho extends Noodle {
    public Pho() {
      super("flat");
    }
  }
  
  class Noodle {
    boolean isCooked = false;
    String shape;
    
    public Noodle(String shape) {
       this.shape = shape;
    }
    
    public static void main(String[] args) {
       Pho lunch = new Pho();
       System.out.println(lunch.shape);
       System.out.println(lunch.isCooked);
    }
  }
  