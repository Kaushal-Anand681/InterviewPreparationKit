package stacks_and_queues;

import java.util.ArrayList;
import java.util.HashMap;

public class BalancedBrackets {

	public static void main(String[] args) {
		
		System.out.println(checkBalancedBrackets("{{[[(())]]}}"));

	}

	private static String checkBalancedBrackets(String string) {
		String openingBrackets = "({[";
		String closingBrackets = ")}]";
		HashMap<Character, Character> matchingBrackets = new HashMap<Character, Character>();
		matchingBrackets.put(')', '(');
		matchingBrackets.put('}', '{');
		matchingBrackets.put(']', '[');
		ArrayList<Character> stack = new ArrayList<Character>();
		for(int i = 0;i < string.length();i++) {
			char letter = string.charAt(i);
			if(openingBrackets.indexOf(letter) != -1) {
				stack.add(letter);
			}else if(closingBrackets.indexOf(letter) != -1) {
				if(stack.size() == 0) {
					return "NO";
				}
				if(stack.get(stack.size() -1) == matchingBrackets.get(letter)) {
					stack.remove(stack.size()-1);
				}else {
					return "NO";
				}
			}
		}
		if(stack.size() == 0) {
			return "YES";
		}else {
			return "NO";
		}
	}

}
