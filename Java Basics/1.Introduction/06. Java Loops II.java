import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
       int scan = sc.nextInt();
        
        for(int i = 0; i < scan; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            for(int j = 0; j < n; j++){
                a += Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            
            System.out.println();
        }
        
        
    }
}
