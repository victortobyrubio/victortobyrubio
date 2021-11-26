import java.util.Scanner;
public class RatingProblems {
    public static void main(String args[]) {//method
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int k = scan.nextInt();
      double x = 0;
      double min = 0, max = 0;
      
      for(int i = 0; i < k; i++){
         x += scan.nextInt();
      }
         if(k < n){
             min = (x - (3*(n-k)))/n;
             max = (x + (3*(n-k)))/n;
         }else{
             min = x/n;
             max = x/n;
         }
         
        System.out.print(min + " " + max);
    }
}

