public class test03_11 {
	public static void main(String[] args) {
		int[] money = { 209000, 109000, 119000, 109000, 94000 };

		System.out.print("상품가격 --> ");
		printArray(money);
		sortArray(money);
		System.out.print("낮은가격순 --> ");
		printArray(money);
	}
	private static void printArray(int[] money) {
		int i;
		for (i = 0; i < money.length - 1; i++)
			System.out.print(money[i] + ", ");
		System.out.println(money[i]);
	}
	private static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}