package basicquiz2;

import java.util.Random;
import java.util.Scanner;

import quiz8bean.Quiz8Bean;

public class quiz8 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("블랙잭 게임 시작");
		Random ran = new Random();
		Quiz8Bean bean = new Quiz8Bean();
		String str = "졌습니다";
		
		while(true) {
			System.out.println("1.hit, 2. stand");
			int ch1 = scan.nextInt();
			if(ch1 == 1) {
				bean.addPlayer((int)(Math.random()*10)+1);
				System.out.println("현재 당신의 합은 : " + bean.getPlayerSum());
				if(bean.isUserOver() || bean.is21()) break;
			}else {break;}				
		}
		
		while(!(bean.is21() || bean.isUserOver())) {
			bean.addCom((int)Math.random()*10+1);
			if(bean.isComOver() || bean.isComOverPlayer()) break;
			}
		if(bean.is21() || bean.isComOver()) {
			str = "이겼습니다";}
		
		System.out.println(str + "  유저 : "+bean.getPlayerSum()+"  달러 : "+bean.getComSum());
	}	

}
