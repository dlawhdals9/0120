import java.util.Random;

public class LottoNumberTest {

	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[45];
		for(int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = i + 1;
		}
		
		// 섞기 전 
		show(lotto);
		
		System.out.println();
		int temp;
		for(int i = 0 ; i < 100000 ; i++) {
			int r = random.nextInt(44) + 1;
			temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
		
		//	섞은 후 
		show(lotto);
		
		System.out.println();
		System.out.println("=============================================");
		System.out.print("로또 번호 : ");
		for(int i = 0 ; i< 6 ; i++) {
			System.out.printf("%2d ", lotto[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("보너스 : %2d ", lotto[6]);
		

	}

	public static void show(int[] lotto) {
		for(int i = 0 ; i< lotto.length ; i++) {
			System.out.printf("%02d ", lotto[i]);
			if ( i % 10 == 9 ) {
				System.out.println();
			}
		}
	}

}


// 구매 금액을 입력받아서 금액만큼 로또 번호 만들어주기
