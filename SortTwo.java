import java.util.Scanner;
public class SortTwo {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int a = input.nextInt();
      int b = input.nextInt();
      
      if(a > b){
          System.out.println(b + " " + a);
      }else{
           System.out.println(b + " " + b);
      }
    }
}
