import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnClouds {

    static int jumpingOnClouds(int[] c, int k) {
        // Complete this function
        int E = 100;
        int i = 0;
        while(i<c.length){
            E-=1;
            i=(i+k)%c.length;
            
            if(c[i] == 1)
                E-=2;
            if(i==0)
                break;
        }
        return E;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        in.close();
    }
}
