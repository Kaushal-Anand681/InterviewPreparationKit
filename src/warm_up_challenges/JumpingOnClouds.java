package warm_up_challenges;

public class JumpingOnClouds {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 1, 0,0 };
		System.out.println(jumpingOnClouds(arr));

	}

	private static int jumpingOnClouds(int[] arr) {
		int jump = 0;
		int i = 0;
		while( i < arr.length-1) {
			if (i+2 == arr.length || arr[i+2] == 1) {
				jump++;
				i++;
			}else {
				jump++;
				i+=2;
			}
		}
		return jump;
	}

}
