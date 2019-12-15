import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static Stack<Long> stack = new Stack();
    private static Stack<Long> maxStack = new Stack();

    static void insertElement(long element) {
        stack.add(element);
        if (stack.size() == 1)
        {
            maxStack.push(element);
            return;
        }
        if (element > maxStack.peek())  
            maxStack.push(element);  
        else
            maxStack.push(maxStack.peek());  
    }

    static void deleteTopElement() {
        stack.pop();
        maxStack.pop();
    }

    static void printMaxElement() {
        System.out.println(maxStack.peek());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] st = scanner.nextLine().split(" ");
        int cases = Integer.parseInt(st[0]);
        for (int i = 0; i < cases; i++) {
            String[] input = scanner.nextLine().split(" ");
            int operation = Integer.parseInt(input[0]);
            switch(operation) {
                case 1: long element = Integer.parseInt(input[1]);
                        insertElement(element);
                        break;
                case 2: deleteTopElement();
                        break;
                case 3: printMaxElement();
                        break;
                default: continue;
            }
        }
    }
}
