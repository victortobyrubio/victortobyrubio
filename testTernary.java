public class MyClass {
    public static void main(String args[]) {
    String input = "apples";
    
    String fruit = input.equals("apples") ? "apples" : "oranges"; // ? evaluates if the input is equal, fruit will take apple as value, if not equal, fruit will take orange as value
                                                                  // ? asks if input = apples
    System.out.println(fruit);
    
    int num1 = 20;
    int num2 = 30;
    
    int max = num1 >= num2 ? num1 : num2; // num1 is not greater or equal to num2, therefore max = num2
    System.out.println(max);
    }
}

/*
    Operators:
        ! <- unary operator   (evaluates one variable)    !true -> false
  +,-,*,/ <- binary operator  (evaluates two variables)   5+5, 10-5
        ? <- ternary operator (evaluates three variables) 
        
        //ternary is the same as a single if else statement
*/
