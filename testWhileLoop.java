import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the password: ");
        String password = "Programming";
        String guess = scan.nextLine();
    
        while(!guess.equals(password)){
            System.out.println("Try again: ");
            guess = scan.nextLine();
        }
        
        System.out.println("Welcome");
        scan.close();
    }
}


/* parts of a loop
            - Initialization
            - Comparison/Condition
            - Update
        
        
        int i = 10;//init
        while(i != 0){//comparison
            System.out.println("Wow");
            i--;//update
        }
*/
