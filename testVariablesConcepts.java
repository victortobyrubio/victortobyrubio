import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      
      String string = new String("This is a string");
      String easier = "Wow, that was easy!";//can be used instead of declaring new String()
      
      int x = 5; // declare a primitive int
      Integer y = 5; // object (5 is autoboxed) class equivalent of int 
      
      System.out.println(string + easier);
      System.out.println(x);
        
      int x;
      x = 5;//initialization
      x = 10;//variables can be changed
      
      final int Y = 5; //<-to store a constant/unchangeable value
      //Y = 10; <- will cause an error due to "final"
      final double PI = 3.14159; //used double due to decimal points 
        
      boolean isPizzaDelicious = true; //true false
      byte b = 127; // 101010 small data type either number or character
      char c = '2'; //allows to store unicode
      short s = 32767; //chat but with small numbers
      int i = 4;
      long l = 5050505L;//same with int but twice the size of int
        
      float f = 20.5f;//float not exact number, smaller container than double
      double d = 20.5;//exact number 
    }
}

//primitive types - boolean, byte, char, short, int, long, float, double
//objects - instance of a class(the data type)

//statically typed - variables up front(before compiling)
//dynamically typed - variables do not have types
//data types -

//literals - the value ( whats inside -> " " );

//variable - stores value
//expression - evaluates value
//operator - work/combine on operands to produce a value( + - * / )
//operand - thing operator works on

/*  Wrong variable sample
    if(){
        int x;    
    }
    x = 5; <- x is not defined
*/

//variable creation
//1. Declare
//2. Initialize
