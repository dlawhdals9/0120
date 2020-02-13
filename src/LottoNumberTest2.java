import java.util.*;

public class LottoNumberTest2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int money;
		int temp;
		System.out.print("구매 금액을 입력해주세요 : ");
		money = sc.nextInt();
		int[] lotto = new int[45];
		for(int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = i + 1;
		}
		
		
		while(money >= 1000) {
			for(int j = 0 ; j < 100000 ; j++) {
				int r = random.nextInt(44) + 1;
				temp = lotto[0];
				lotto[0] = lotto[r];
				lotto[r] = temp;
			}			
			System.out.print("로또 번호 : ");
			for(int i = 0 ; i< 6 ; i++) {
				System.out.printf("%02d ", lotto[i]);
			}
			System.out.println();
			System.out.println("=============================================");
			
			money -= 1000;
			
		}
		
		System.out.println("잔액 : " + money);
		

	

}
}

	// 구매 금액을 입력받아서 금액만큼 로또 번호 만들어주기

	


