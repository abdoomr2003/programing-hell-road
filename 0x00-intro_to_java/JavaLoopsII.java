import java.util.*;

public class JavaLoopsII {
    public static void main(String []arg){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int z = a;
        for (int j = 0; j < n; j++) {
            z += b * (1 << j);
            System.out.print(z + " ");
        }
        System.out.println();
        }
        in.close();
    }
}
