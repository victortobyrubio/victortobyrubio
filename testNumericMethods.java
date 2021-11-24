public class MyClass {
    public static void main(String args[]) {
      //numeric methods
      int x = 10;
      int y = 20;
      System.out.println(Integer.max(x, y));//this is a static method
      System.out.println(Integer.compare(x, y));//if output is 0 = equal
                                                //if output is less than 0 = x is smaller
                                                //if output is greater than 0 = x is larger
                                                
      String money = "300";
      
      System.out.println(Integer.valueOf(money)); // converts string to int(as object)
      System.out.println(Integer.parseInt(money));// converts string to int(as primitive)
      
      Integer a = Integer.valueOf(money);//sometimes used
      int b = Integer.parseInt(money);//used often
      
      /*Integer myInt = 5;
      myInt."something"  // this is an instance method
      */
    }
}
