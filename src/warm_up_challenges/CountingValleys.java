package warm_up_challenges;

public class CountingValleys {

	public static void main(String[] args) {
		String s = "DDDUUDUU";
		System.out.println(countingValleys(s));
	}

	private static int countingValleys(String s) {
		int level = 0;
		int ans = 0;
		for(int x = 0; x < s.length() ; x++) {
			if(s.charAt(x) == 'U') {
				if(level == -1) {
					ans++;
				}
				level++;
			}
			if(s.charAt(x) == 'D') {
				level--;
			}
		}
		return ans;
	}

}
