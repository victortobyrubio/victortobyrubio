import java.util.Scanner;

public class TwoSum{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if(a >= 0 && a <= 1000 && b >= 0 && b <= 1000){
            System.out.println(a+b);
        }
    }
}
