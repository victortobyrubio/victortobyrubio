import java.util.Scanner;
public class TwoStones {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int value = input.nextInt();
      if(value%2 == 0){
          System.out.println("Bob");
      }else{
          System.out.println("Alice");
      }
    }
}

//------------------NOTE--------------------
//  value%2 == 0 checks for even
//  value%2 != 0 checks for odd
