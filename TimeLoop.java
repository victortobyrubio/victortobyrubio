import java.util.Scanner;
public class TimeLoop {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int value = input.nextInt();
      
      for(int i = 0; i < value; i++){
          System.out.println(i+1 + " Abracadabra");
      }
    }
}
