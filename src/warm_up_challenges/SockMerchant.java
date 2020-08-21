package warm_up_challenges;

import java.util.HashSet;

public class SockMerchant {

	public static void main(String[] args) {
		int[] arr = {10, 20, 20 ,10, 10, 30, 50 ,10, 20};
		
		System.out.println(sockMerchant(arr));

	}
	
	public static int sockMerchant(int[] arr) {
		int counter = 0;
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int x : arr) {
			if(hs.contains(x)) {
				hs.remove(x);
				counter++;
			}else {
				hs.add(x);
			}
		}
		
		return counter;
    }

}
