import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    String toDo2 = "Drink";
    String toDo3 = "Eat";

    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);
  
    System.out.println(toDoList);

{
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    System.out.println(sherlocksToDos.size());
    System.out.println(poirotsToDos.size());

    System.out.println("Poirot");
    
    
    }
  }
}
  