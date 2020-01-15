import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len = A.length();
        for(int i=0;i<A.length()/2;i++) {
            if(A.charAt(i) == A.charAt(len-1)) {
                len--;
                continue;
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
