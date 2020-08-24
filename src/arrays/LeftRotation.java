package arrays;

public class LeftRotation {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5 };
		int[] ans = leftRotate(x, 4);
		for(int y : ans) {
			System.out.print(y+" ");
		}
		System.out.println();
	}

	private static int[] leftRotate(int[] a , int d) {
		int[] y =  new int[a.length];
		for(int i = 0;i < y.length;i++) {
			y[i] = a[(i+d) % a.length];
		}
		return y;
		
	}

}
