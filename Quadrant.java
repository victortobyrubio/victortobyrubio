import java.util.Scanner;

public class Quadrant {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int x = scan.nextInt();
      int y = scan.nextInt();
      
      if(x > 0 && y > 0){//Q1
          System.out.println("1");
      }else 
      if(x < 0 && y > 0){//Q2
          System.out.println("2");
      }else
      if(x < 0 && y < 0){//Q3
          System.out.println("3");
      }else
      if(x > 0 && y < 0){//Q4
          System.out.println("4");
      }
    }
}