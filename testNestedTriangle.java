public class MyClass {
    public static void main(String args[]) {

      for(int i = 0; i <= 9; i++){
          for(int j = i; j >= 0; j--){
              System.out.print("*");
          }
          System.out.print("\n");
      }
    }
}

/* sample output

        * first output of j = i(0)
        ** j = i(1)loops twice
        *** j = i(2)
        ****
        *****
        ******
        *******
        ********
        *********
        **********

*/
