package stringmanipulations;

public class AlternatingCharacters {

	public static void main(String[] args) {
		System.out.println(alternatingCharacters("AAABBB"));

	}

	private static int alternatingCharacters(String string) {
		int counter = 0;
		for(int i =1 ;i < string.length();i++) {
			if(string.charAt(i-1) == string.charAt(i)) {
				counter++;
			}
		}
		
		return counter;
	}

}
