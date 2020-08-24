package arrays;

public class MinimumSwaps2 {

	public static void main(String[] args) {
		int[] x = {4,3,1,2};
		System.out.println(minimumSwap(x));

	}

	private static int minimumSwap(int[] arr) {
		int count = 0;
		int min = arr[0];
		int min_Index = 0;
		for(int i = 1; i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
				min_Index = i;
			}
		}
		if(min_Index != 0) {
			swap(0,min_Index,arr);
			count++;     //[1 3 4 2]  1
		}
		for(int i = 1;i < arr.length - 1;i++) { //i = 1
			int position = arr[i] -arr[0];  // pos = 2 3
			while(arr[position] != arr[i]) {  //true i = 1 true
				swap (i , position , arr); // [1 4 3 2] [1 2 3 4]
				count++; // 2 3
				position = arr[i] -arr[0]; // pos =  3 1
			}
		}
		
		return count;
	}

	private static void swap(int i, int j, int[] array) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
		
	}

}
