import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThrones {

    static String gameOfThrones(String word){
        // Complete this function
        Set<Character> hashSet = new HashSet<Character>();
        for(int i=0;i<word.length();i++){
            if(hashSet.size() > (word.length()-i) + 1) return "NO";
            char character = word.charAt(i);
            if(hashSet.contains(character)){
                hashSet.remove(character);
            }else{
                hashSet.add(character);
            }
        }
        return (hashSet.size() == word.length()%2)? "YES" : "NO";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
