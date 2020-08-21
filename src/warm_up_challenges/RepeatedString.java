package warm_up_challenges;

public class RepeatedString {

	public static void main(String[] args) {
		String s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
		long i = 7367789064001l;
		System.out.println(i % (long)s.length());
		System.out.println(repeatedString(s, i));

	}

	private static long repeatedString(String s, long n) {
		long length = s.length();
		long whole = n /length;
		int rem = (int) (n % length);
		long found = 0;
		for (char ch : s.toCharArray()) {
			if (ch == 'a') {
				found++;
			}
		}
		long total = found * whole;
		if (rem == 0) {
			return total;
		} else {
			String part = s.substring(0, rem);
			for (char ch : part.toCharArray()) {
				if (ch == 'a') {
					total++;
				}
			}
		}
		return total;

	}

}
