public class MyClass {
    public static void main(String args[]) {
      /*
        + addition
        - minus
        / division
        * multiplication
        % modulus
      */
      
      int x = 5 % 2; // modulus operator evaluates the remainder so 5/2 = 2 with 1 as remainder
      System.out.println(x);
      
      //precedence - order of operators evaluated
      //5 + 3 / 2 -> 3/2 gets evaluated first
      //5 + 3 / 2 * 3 -> 3/2 first then * 3
      //(5 +3) / 2 -> use parenthesis to force precedence
      
      //increment decrement operator
        // x--; x++;
        // --x; x++; <- this is just preference 
        
      int a = 5;
      int b = a++; //note: variable b gets the original value of a before it increments
      System.out.println(a);
      System.out.println(b);
      
      //assignment operator
      int i = 5;
      x += 1;//same as x = x + 1;
    }
}
