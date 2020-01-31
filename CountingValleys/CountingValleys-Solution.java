import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int countingValleys(int n, String s) {
        int valleysCount = 0;
        HashMap<Integer, Integer> path = new HashMap<Integer, Integer>();
        path.put(1,0);
        boolean isValley = false, isMountain = false;
        for(int i=0;i<s.length();i++) {
            int currentPath = path.get(1);
            if(s.charAt(i) == 'U') {
                if(currentPath == 0) {
                    isMountain = true;
                    isValley = false;
                }
                path.put(1,++currentPath);
            } else if(s.charAt(i) == 'D') {
                if(currentPath == 0) {
                    isValley = true;
                    isMountain = false;
                }
                path.put(1,--currentPath);
            }
            if(path.get(1) == 0 && isValley) {
                valleysCount++;
            }
        }
        return valleysCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
