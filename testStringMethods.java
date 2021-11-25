public class MyClass {
    public static void main(String args[]) {
      String x = "hello you, how are you?";
      System.out.println(x.charAt(x.length() - 1));
      String answer =  x + " I'm good, thanks!";
      System.out.println(answer);
      System.out.println(answer.contains("hello"));//returns true if "hello" exists
      System.out.println(answer.indexOf("hello"));//returns the index of the first letter of the string
      System.out.println(answer.indexOf("you", 0));//overloaded version, returns index starting at index 0, if doesnt exist returns -1
      System.out.println(x.lastIndexOf("you"));//searches for the index of the last possible "you" string
      System.out.println(x.lastIndexOf("you", 18));//searches for the index of the last possible "you" string to/from(idk) index 18 
      
      System.out.println(x.toUpperCase());
      System.out.println(x.toLowerCase());
      System.out.println(x.strip());// removes white spaces at the beggining
      System.out.println(x.stripTrailing()); // removes whitespaces only at the ending
      
      System.out.println(x.substring(6, 9));//extracts chars from index 6 to 9
      System.out.println(x.equals("hello"));//used for conditionals
    }
}
