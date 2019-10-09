import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static HashMap<String, Integer> addWord(String word, HashMap<String, Integer> magazineWordCount) {
        int newCount = 1;
        if(magazineWordCount.containsKey(word)) {
            int currCount = magazineWordCount.get(word);
            newCount = ++currCount;
        }
        magazineWordCount.put(word, newCount);
        return magazineWordCount;
    }

    static HashMap<String, Integer> removeWord(String word, HashMap<String, Integer> magazineWordCount) {
        int currCount = magazineWordCount.get(word);
        int newCount = --currCount;
        if(newCount == 0) {
            magazineWordCount.remove(word);
        } else {
            magazineWordCount.put(word, newCount);
        }
        return magazineWordCount;
    }

    static void checkMagazine(String[] magazine, String[] note) {
        boolean possible = true;
        HashMap<String, Integer> magazineWordCount = new HashMap<String, Integer>();
        for(String word : magazine) {
            addWord(word, magazineWordCount);
        }
        for(String word : note) {
            if(!magazineWordCount.containsKey(word)) {
                possible = false;
                break;
            } 
            removeWord(word, magazineWordCount);
        }
        String result = possible ? "Yes" : "No";
        System.out.println(result);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
