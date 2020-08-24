package arrays;

public class Array2DHourglass {

	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

		for (int[] x : arr) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

		System.out.println(hourGlassSum(arr));

	}

	private static int hourGlassSum(int[][] arr) {
		int maxResult = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr[0].length - 2; j++) {
				int result = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				if (result > maxResult) {
					maxResult = result;
				}

			}

		}
		return maxResult;
	}

}
