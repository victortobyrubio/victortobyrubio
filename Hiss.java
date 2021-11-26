import java.util.Scanner;
public class Hiss {
    public static void main(String args[]) {//method
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine();
      
          if(input.contains("ss")){
              System.out.println("hiss");
          }else{
              System.out.println("no hiss");
          }
      
    }
}
