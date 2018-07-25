
public class test03_3 {
	public static void main(String[] args) {
		int[] arr = { 1, 9, 4, 2, 5 };

		for (int i = 0; i < (arr.length) / 2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
		printArray(arr);
	}
	private static void printArray(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.println("arr[" + i + "]=" + data[i]);
		}
	}
}