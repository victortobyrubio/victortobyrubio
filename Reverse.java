import java.util.Scanner;
public class Reverse {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int x = input.nextInt();
      int[] y = new int[x];
      
      for(int i = 0; i < x; i++){
          y[i] = input.nextInt();
      }
      for(int j = x-1; j >= 0; j--){
            System.out.println(y[j]);
      }
    }
}
