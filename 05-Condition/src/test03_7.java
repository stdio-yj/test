public class test03_7 {
	public static void main(String[] args) {
		int[][] inven = { { 500, 291 }, { 320, 586 }, { 100, 460 }, { 120, 558 }, { 92, 18 }, { 30, 72 } };
		int total = 0; // 아이템 판매 금액의 총 합

		for (int i = 0; i < inven.length; i++) {
			total += inven[i][0] * inven[i][1] * 0.9;
		}
		System.out.println("총 골드의 합: " + total + "G");
	}
}
