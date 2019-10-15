import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        int len = s.length();
        int hours = Integer.parseInt(s.substring(0,2));
        boolean pm = s.substring(len-2, len).toLowerCase().equals("pm");
        String output = s.substring(0,len-2);
        if(hours == 12 && !pm) {
            output = "00" + output.substring(2, output.length());
        } else if(hours != 12 && pm) {
            int new_hours = hours + 12;
            output = new_hours + output.substring(2, output.length());
        }
        return output;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}