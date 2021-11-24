import java.util.Scanner;

public class JumboJavelin{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); //get first input N(input size)
        int[] length = new int[a]; //program input(length)
        int x = 0;//final output
        
        for(int i = 0; i < N; i++){
            length[i] = scan.nextInt();//get int array input(lengths)
            x += length[i];//add from length[0+i] ex.) length[0]=1,length[1]=1,length[2]=1 | then x = 3
        }
        System.out.println(x-(N-1));//output x deducted by input size - 1 by program specification "the fused rod will lose 1 cm of their combined length."
    }
}
