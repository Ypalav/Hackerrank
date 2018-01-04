import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LowestTriangle {

    static int lowestTriangle(int base, int area){
       // Complete this function
       float k = 2*(float)area/base;
       //System.out.println(k);
       return (int)Math.ceil(k);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int area = in.nextInt();
        int height = lowestTriangle(base, area);
        System.out.println(height);
    }
}
