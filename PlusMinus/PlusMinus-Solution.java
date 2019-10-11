import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        int len = arr.length;
        for(int i: arr) {
            if(i == 0) {
                zeroCount++;
            } else if(i<0) {
                negativeCount++;
            } else {
                positiveCount++;
            }
        }
        System.out.println((float)positiveCount/len);
        System.out.println((float)negativeCount/len);
        System.out.println((float)zeroCount/len);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}