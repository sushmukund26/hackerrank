import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution {

    private static int calculatePowerValue(int i, int b) {
        int value = 0;
        for(int c=0;c<i;c++) {
            value += (int)Math.pow(2,c) * b;
        }
        return value;
    }

    private static void printSeries(int a, int b, int n) {
        for(int i=1;i<=n;i++) {
            int powerValue = calculatePowerValue(i,b);
            int value = a + powerValue;
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printSeries(a,b,n);
        }
        in.close();
    }
}
