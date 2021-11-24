import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      String input = s.nextLine();
      String newst = "";
      char c;
      
      for(int i = 0; i < input.length(); i++){
          c = input.charAt(i);//takes each character by index
          newst = c+newst;//adds each character after each loop 
          //newst += c; //only copies as is //no reverse
      }
      System.out.println(input);
      System.out.println(newst);
      if(input.equals(newst)){
          System.out.println("Palindrome!!!");
      }else{
          System.out.println("Not a palidrome :(");
      }
    }
}
/* -----------------------!!!IMPORTANT!!!---------------------------
"==" tests for reference equality (whether they are the same object).
    SO USING if(input == newst) to test if they have the same value will always output the ELSE part "Not a palindrome :("

".equals()" tests for value equality (whether they are logically "equal").


    // These two have the same value
    new String("test").equals("test") // --> true 
    
    // ... but they are not the same object
    new String("test") == "test" // --> false 
    
    // ... neither are these
    new String("test") == new String("test") // --> false 
    
    // ... but these are because literals are interned by 
    // the compiler and thus refer to the same object
    "test" == "test" // --> true 
    
    // ... string literals are concatenated by the compiler
    // and the results are interned.
    "test" == "te" + "st" // --> true
    
    // ... but you should really just call Objects.equals()
    Objects.equals("test", new String("test")) // --> true
    Objects.equals(null, "test") // --> false
    Objects.equals(null, null) // --> true
*/
