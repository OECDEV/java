
public class KioskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculationTotal mykiosk = new  CalculationTotal();
		int totalPrice = mykiosk.getTotalPrice(2,1,0,1);
		System.out.println("=== 주문 내역 ===");
        System.out.println("총 결제 금액: " + totalPrice + "원");
	}

}
