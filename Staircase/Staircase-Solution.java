import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        int spaces = n-1, characters = 1;
        for(int i=0;i<n;i++) {
            for(int s=0;s<spaces;s++) {
                System.out.print(" ");
            }
            for(int c=0;c<characters;c++) {
                System.out.print("#");
            }
            spaces--;
            characters++;
            System.out.print("\n");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}