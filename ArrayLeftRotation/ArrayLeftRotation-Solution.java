import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static void rotateLeft(int[] a, int d) {
        int length = a.length;
        if(d == length) {
            //rotated array is the same as the original array
            printArray(a);
            return;
        }

        int[] rotatedArr = new int[length];
        int counter = 0;
        for(int i=0;i<length;i++) {
            if(i+d < length) {
                rotatedArr[i] = a[i+d];
            } else {
                rotatedArr[i] = a[counter];
                counter++;
            }
        }
        printArray(rotatedArr);
    }

    private static void printArray(int[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        rotateLeft(a, d);
        scanner.close();
    }
}
