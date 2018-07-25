public class test03_4 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 9, 4, 2, 5 };
		int[] arr2 = { 5, 8, 6, 3, 1 };
		
		System.out.println("일치하는 데이터는 총" + compareArray(arr1, arr2) + "개 입니다.");
	}
	public static int compareArray(int[] arr, int[] brr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[i] == brr[j])
					count++;
			}
		}
		return count;
	}
}