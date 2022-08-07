package basicquiz2;

import java.util.Random;
import java.util.Scanner;

public class quiz7 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("블랙잭 게임 시작");
		Random ran = new Random();
		int playerSum = 0;
		int comSum = 0;
		String str = "졌습니다";

		while (true) {
			System.out.println("1.hit, 2.stand");
			int ch1 = scan.nextInt();

			if (ch1 == 1) {
				playerSum += (int) (Math.random() * 10) + 1;
//				playerSum += ran.nextInt(1, 11);
				System.out.println("현재 당신의 합은 : " + playerSum);
				if(playerSum >21 || playerSum == 21) break;
			}else {break;}

		}
		while (!(playerSum >21 || playerSum == 21)) {
			comSum += ran.nextInt(1, 11);
			if (comSum > 21 || comSum > playerSum) break; 
		}
		
		if (playerSum == 21 || comSum > 21) {
			str = "이겼습니다";
		}
		System.out.println(str + "  유저 : " + playerSum + "  딜러 : " + comSum);
	}

}
