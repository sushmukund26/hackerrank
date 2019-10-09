import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static long repeatedString(String s, long n) {
        long countOfA = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'a') {
                countOfA ++;
            }
        }
        
        long repetitions = n/s.length();
        countOfA *= repetitions;
        long mod = n%s.length();
        if(mod != 0) {
            String lastString = s.substring(0,(int)mod);
            for(int i=0;i<lastString.length();i++) {
                if(lastString.charAt(i) == 'a') {
                    countOfA ++;
                }
            }
        }
        return countOfA;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
