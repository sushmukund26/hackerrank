import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int lengthSum = A.length() + B.length();
        String isGreater = A.charAt(0) > B.charAt(0) ? "Yes" : "No";

        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);
        String concatString = A + " " + B;
        System.out.println(lengthSum);
        System.out.println(isGreater);
        System.out.println(concatString);
    }
}
