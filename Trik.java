import java.util.Scanner;
public class Trik {
    public static void main(String args[]) {//method
      Scanner scan = new Scanner(System.in);
      String c = scan.nextLine();
      int ball = 0;
      
      for(int i = 0; i < c.length(); i++){
          if(c.charAt(i) == 'A'){
              if(ball == 0){
                  ball = 1;
              }else 
              if(ball == 1){
                  ball = 0;
              }else
              if(ball == 2){
                  ball = 2;
              }
          }else
          if(c.charAt(i) == 'B'){
              if(ball == 0){
                  ball = 0;
              }else
              if(ball == 1){
                  ball = 2;
              }else
              if(ball == 2){
                  ball = 1;
              }
          }else
          if(c.charAt(i) == 'C'){
              if(ball == 0){
                  ball = 2;
              }else
              if(ball == 1){
                  ball = 1;
              }else
              if(ball == 2){
                  ball = 0;
              }
          }
      }
      System.out.println(ball+1);
    }
}
