import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {

      System.out.println("What is your name?");
      
      Scanner scanner = new Scanner(System.in);
      String name = scanner.nextLine();
      
      System.out.println("Hello " + name);
    }
}
