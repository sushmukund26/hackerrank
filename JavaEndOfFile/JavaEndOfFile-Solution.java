import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        while(input.hasNext()) {
            System.out.println(++counter + " " + input.nextLine());
        }
        input.close();
    }
}
