import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases > 0){
			String pattern = in.nextLine();
            try {
          	    Pattern.compile(pattern);
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
                testCases -= 1;
                continue;
            }
            System.out.println("Valid");
            testCases -= 1;
		}
	}
}
