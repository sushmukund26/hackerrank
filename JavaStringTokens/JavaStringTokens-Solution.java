import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if(s == null || s.equals("") || s.trim().equals("")) {
            System.out.println("0");
            return;
        }

        String delimiters = ("[ !,?.\\_'@]+");
        String[] tokens = s.trim().split(delimiters);

        System.out.println(tokens.length);

        for(String token : tokens) {
            System.out.println(token);
        }
        
	scan.close();
    }
}

