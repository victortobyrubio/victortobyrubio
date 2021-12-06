public class MyClass {
    public static void main(String args[]) {
      int[][] student = {{75,89,90}, {74,80,21}};
      int num;
      for(int i = 0; i < student.length; i++){
          num = i+1;
          System.out.print("Student #" + num + ": ");
          for(int j = 0; j <= student.length; j++){
              System.out.print(student[i][j] + " ");
          }
         System.out.println("");
      }

    }
}
