public class MyClass {
    public static void main(String args[]) {
      boolean additional = true;
      
      for(int i = 9; i >= 0; i--){//reverse iteration from 9 to 0
          System.out.println(i);//displays i every loop
          if(i == 5){//if i reaches 5 code will continue to check
              if(additional == true){//if additional is set to true, display Found 5!
                  System.out.println("Found 5!");
              }
          }
      }
    }
}
