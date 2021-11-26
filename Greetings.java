import java.util.Scanner;

public class Greetings {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      String s = scan.nextLine();

      for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == 'e'){
            System.out.print("ee");
        }else{
            System.out.print(s.charAt(i));
        }
      }
    }
}