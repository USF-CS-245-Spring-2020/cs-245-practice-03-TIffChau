public class BinaryIterativeSearch implements Practice03Search
{
	public int search(int [] arr, int target) {
		int min = 0;
		int max = arr.length - 1;
		while (min<=max) {
			int mid = (min+max) / 2;
			if (target == arr[mid]) {
				return mid;
			}
			else if (target < arr[mid]) {
				max = mid - 1;
			}
			else if (target > arr[mid]) {
				min = mid + 1;
			}
		}
		return -1;
	}

	public String searchName() {
		return "Binary Iterative Search";
	}
}