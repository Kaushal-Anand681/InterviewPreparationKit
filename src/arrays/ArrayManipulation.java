package arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		int[][] query = {{1, 2, 100},{2, 5, 100} , {3 ,4 ,100}};
		//System.out.println(arrayManipulation1(5, query));
		System.out.println(arrayManipulation2(5, query));

	}
	private static long arrayManipulation2(int n, int[][] query) {
		long[] array = new long[n]; 
		long max = Long.MIN_VALUE;
		for(int i = 0;i < query.length;i++) {
			int a = query[i][0] - 1; 
			int b = query[i][1] -1; 
			int k = query[i][2]; 
			array[a] += k;
			if(b+1 < n) array[b+1] -= k;
		}
		for(int i = 1;i < n;i++) {
			array[i] += array[i-1];
			max = Math.max(max, array[i]);
		}
		return max;
	}
	private static long arrayManipulation1(int n, int[][] query) {
		long[] array = new long[n];
		for(int i = 0;i < query.length;i++) {
			int a = query[i][0] - 1;
			int b = query[i][1] - 1;
			int k = query[i][2];
			while(a <= b) {
				array[a] += k;
				a++;
			}
		}
		long max = Integer.MIN_VALUE;
		for(int i = 0;i < array.length;i++) {
			long temp = array[i];
			if(temp > max) {
				max = temp;
			}
		}
		
		return max;
	}

}
