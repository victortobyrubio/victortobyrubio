import java.util.Scanner;
public class OddEcho {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int size = scan.nextInt();
      
      for(int i = 1; i <= size; i++){
        String s = scan.next();
            if(i%2 != 0){
                System.out.println(s);
            }
      }
    }
}
