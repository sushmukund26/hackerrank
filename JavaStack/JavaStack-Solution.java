import java.util.*;
class Solution {
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Character> map = new HashMap<Character, Character>();
        	map.put('(', ')');
       		map.put('[', ']');
        	map.put('{', '}');
        	boolean valid;
		while (sc.hasNext()) {
			String input=sc.next();
            		valid = true;
            		Stack<Character> stack = new Stack<Character>();
            		for (int i = 0; i < input.length(); i++) {
                		char curr = input.charAt(i);
                		if (map.keySet().contains(curr)) {
		                    stack.push(curr);
                		} else if (map.values().contains(curr)) {
	                	    if (!stack.empty() && map.get(stack.peek()) == curr) {
        	                	stack.pop();
	                	    } else {
        		                valid = false;
                        		break;
                    			}
                		}
            		}		
	               System.out.println(stack.empty() && valid);
		}
	}
}
