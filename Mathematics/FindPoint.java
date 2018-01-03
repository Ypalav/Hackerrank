import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindPoint {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int setOfPoints = sc.nextInt();
        for(int i=0;i<setOfPoints;i++){
            int px = sc.nextInt();
            int py = sc.nextInt();
            int qx = sc.nextInt();
            int qy = sc.nextInt();
            
            System.out.println(((qx-px)+qx) + " " + ((qy-py)+qy));
        }
    }
}