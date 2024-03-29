package examplesFromCodeCademy;

import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
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
    
    System.out.println("Sherlock's third to-do:");
    // Print Sherlock's third to-do:
    System.out.println(sherlocksToDos.get(2));
    
    
    System.out.println("\nPoirot's second to-do:");
    // Print Poirot's second to-do:
    System.out.println(poirotsToDos.get(1));

    System.out.println("-----------------------------------------");

    // Calculate to-dos until case is solved:
    int toDosUntilCaseSolved = sherlocksToDos.indexOf("solve the case");

    System.out.println("ToDos until case solved: (the same number as index of String 'solve the case'");
    System.out.println(toDosUntilCaseSolved);    

    System.out.println("-----------------------------------------");

    System.out.println(sherlocksToDos.toString());
    System.out.println(poirotsToDos.toString() + "\n");

    // Remove each to-do below:
    sherlocksToDos.remove(0);
    sherlocksToDos.remove(0);
    poirotsToDos.remove(0);
    
    System.out.println(sherlocksToDos.toString());
    System.out.println(poirotsToDos.toString() + "\n");

    System.out.println("-----------------------------------------");

    // Set each to-do below:
    sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
    poirotsToDos.set(3, "listen to Captain Hastings for amusement");
    
    System.out.println(sherlocksToDos.toString());
    System.out.println(poirotsToDos.toString() + "\n");

}
  
}