package basicquiz2;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class quiz9 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		Random ran = new Random();
		
		while(set.size()<3) {
			set.add(ran.nextInt(1, 10));
		}
		Integer[] answer1 = new Integer[3];
		set.toArray(answer1);
		
		
		int count = 1;
		boolean isWin = false;
		while(count <= 9) {
			System.out.println(count+"회차");
			int[] inp = new int[3];
			System.out.println("숫자 3개를 입력 받으세요");
			System.out.println("첫번째 숫자");
			inp[0] = scan.nextInt();
			System.out.println("두번째 숫자");
			inp[1] = scan.nextInt();
			System.out.println("세번째 숫자");
			inp[2] = scan.nextInt();
			
			int ball = 0;
			int strike = 0;
			int out = 0;
			
		for (int i = 0; i < inp.length; i++) {
			int outCount = 0;
			for (int j = 0; j < answer1.length; j++) {
				if(i==j && inp[i]==answer1[j])strike++;
				if(i!=j && inp[i]==answer1[j])ball++;
				if(inp[i] != answer1[i])outCount++;
			}
			if(outCount == 3) out++;
		}	
		System.out.println("볼 : "+ball+" 스트라이크 : "+strike+ " 아웃 : "+out);
		if(strike == 3) {isWin = true; break;}
		count++;
		}
		if(isWin) {
			System.out.println("이겼습니다!");
		}else {
			System.out.println("졌습니다.");
		}
	}

}
