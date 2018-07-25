
public class test03_5 {
	public static void main(String[] args) {
		boolean[] checkList = { true, false, false, true, false };
		System.out.println("----- before -----");
		printArray(checkList);

		reverseArray(checkList);

		System.out.println("----- after -----");
		printArray(checkList);
	}

	public static void printArray(boolean[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);

			if (i + 1 < data.length) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	public static void reverseArray(boolean[] data) {
		for (int i = 0; i < data.length; i++) {
				data[i] = !data[i];
		}
	}
}