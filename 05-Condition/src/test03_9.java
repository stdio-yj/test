public class test03_9 {
	public static void main(String[] args) {
		int[] price = { 38000, 20000, 17900, 17900 };
		int[] qty = { 6, 4, 3, 5 };
		int high_price = 0;

		for (int i = 0; i < price.length; i++) {
			if (high_price < price[i] * qty[i])
				high_price = price[i] * qty[i];
		}
		System.out.println("가장 높은 상품금액: " + high_price + "원");
	}
}