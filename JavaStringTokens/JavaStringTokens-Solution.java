import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String delimiters = "[ .,?!']+";
        String[] tokens = s.split(delimiters);
        
        int tokensLen = tokens.length;
        System.out.println(tokensLen);
        for(int i=0;i<tokensLen;i++) {
            System.out.println(tokens[i]);
        }
        scan.close();
    }
}

