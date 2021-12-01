import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String password = "Programming";
        String guess;
        do{
            System.out.println("Guess the password: ");
            guess = scan.nextLine();
            
        }while(!guess.equals(password));
        System.out.println("Welcome");
        scan.close();
    }
}
