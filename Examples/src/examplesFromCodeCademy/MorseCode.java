
package examplesFromCodeCademy;

public class MorseCode {
  
    public static void main(String[] args) {
      
      String code = ".... .. / .. .----. -- / ... --- -. -. -.-- / .- -. -.. / .. / .-.. .. -.- . / - --- / . .- - / .-. .- -- . -.";
  
        // Find the index where the substring . .- - (which means “eat”) begins!
      // Write the code:
      System.out.println(code.indexOf(". .- -"));
      
    }
    
  }