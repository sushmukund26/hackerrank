import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> numList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            numList.add(num);
        }

        int queriesCount = scan.nextInt();
        for (int i = 0; i < queriesCount; i++) {
            String action = scan.next();
            if (action.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                numList.add(index, value);
            } else if (action.equals("Delete")) {
                int index = scan.nextInt();
                numList.remove(index);
            }
        }
        scan.close();
        
        for (Integer num : numList) {
            System.out.print(num + " ");
        }
    }
}
