package arrays;

public class NewYearChaos {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 4, 3 };
		minimumBribes(arr);

	}

	private static void minimumBribes(int[] arr) {
		int counter = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != i + 1) {
				if ((i - 1) >= 0 && arr[i - 1] == i + 1) {
					counter += 1;
					swap(arr , i , i-1);

				} else if ((i - 2) >= 0 && arr[i - 2] == i + 1) {
					counter += 2;
					swap(arr , i-1 , i-2);
					swap(arr , i , i-1);

				} else {
					System.out.println("Too chaotic");
					return;
				}
			}
		}
		System.out.println(counter);

	}
	private static void swap(int[] array , int i, int j) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
		
	}

}
