package examplesFromCodeCademy;

public class CombineNames {
  
	public static void main(String[] args) {
    
    // Add your first names:
    String firstName = "Bartosz";  
    String lastName = "Maleta";

    // What's the full name?
    String fullName = firstName.concat(" " + lastName);
    System.out.println(fullName);
    
    System.out.println(firstName.concat(lastName));
  }
  
}