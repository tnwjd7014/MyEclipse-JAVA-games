package basicquiz2;

import java.util.Scanner;

public class quiz10_3 {
	//실제 게임
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		quiz10_2 ag = new quiz10_2();
		
		int count = 1;
		boolean isWin = false;
		while (count <=9 ) {
			System.out.println(count + "회차");
			int[] inp = new int[3];
			System.out.println("숫자 3개를 입력 받으세요");
			System.out.println("첫번째 숫자");
			inp[0] = scan.nextInt();
			System.out.println("두번째 숫자");
			inp[1] = scan.nextInt();
			System.out.println("세번째 숫자");
			inp[2] = scan.nextInt();
			
			ag.analysis(inp);
			System.out.println(ag.getResult());
			
			if(ag.isThreeStrike()) {
				isWin = true;
				break;
			}
			count++;
		}
		if(isWin) {
			System.out.println("이겼습니다!");
		}else {
			System.out.println("졌습니다.");
		}
	}

}
