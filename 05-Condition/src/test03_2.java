public class test03_2 {
	public static void main(String[] args) {
		int[] arr = { 1, 9, 4, 2, 5 };
		int[] copy = new int[5];

		for (int i = 0; i < 5; i++) {
			copy[i] = arr[i];
			System.out.println("copy[" + i + "]=" + copy[i]);
		}
	}
}