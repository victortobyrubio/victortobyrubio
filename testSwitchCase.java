import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Hi, how are you feeling?");
      String greet = scan.nextLine();
      
      switch(greet){// can be used when there are fixed inputs
          case "Great":
              System.out.println("Nice!");
              break;
          case "Sad":
              System.out.println("That's okay, it'll get better soon.");
              break;
          default:
              System.out.println("Okay, cool.");
            
      }
      
    }
}

/*    //if else version
      if(greet.equals("Great")){
          System.out.println("Nice!");
      }else
      if(greet.equals("Sad")){
          System.out.println("That's okay, it'll get better soon.");
      }else
          System.out.println("Okay, cool");*/
