import java.util.Scanner;
//import java.math.BigDecimal; <- used for bigdecimal

public class MyClass {
    public static void main(String args[]) {

      System.out.println("What is your name?");
      
      Scanner scanner = new Scanner(System.in);
      String name = scanner.nextLine();
      
      System.out.println("Hello " + name);
        
    }
}
    //other samples:
      //String w = scan.nextLine(); // takes string type values
      //System.out.println(w);
      //int y = scan.nextInt(); // takes int type values
      //System.out.println(y);
      //int a = y + 10;
      //System.out.println(a);
      //BigDecimal money = scan.nextBigDecimal(); //<- takes precise decimal number
      //boolean b = scan.nextBoolean(); // takes boolean values(true or false not 1 or 0)

//casting values
//int x = (int)scan.nextDouble(); <- allows input to have decimal but only displays int before decimal
