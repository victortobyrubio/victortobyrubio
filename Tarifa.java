import java.util.Scanner;
public class Tarifa {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int data = input.nextInt();
      int size = input.nextInt();
      int usage = 0;
      int remaining = 0;
      
      for(int i = 0; i < size; i++){
          usage = input.nextInt();
          remaining = (remaining - usage) + data;
         
      }
      System.out.println(remaining + data);
    }
}
