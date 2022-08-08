package basicquiz2;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz5 {
	private Scanner scan = new Scanner(System.in);
	private ArrayList<String> menus = new ArrayList<String>();
	private ArrayList<Integer> prices = new ArrayList<Integer>();
	
	public quiz5() {
		menus.add("레쓰비");
		menus.add("비타500");
		menus.add("레드불");
		menus.add("바나나우유");
		
		prices.add(1000);
		prices.add(1500);
		prices.add(2000);
		prices.add(1800);
		
		System.out.println("----자판기 메뉴----");
		for (int i = 1; i <= menus.size(); i++) {
			System.out.println(i+"."+menus.get(i-1)+" : "+prices.get(i-1)+"원");
		}
		System.out.println("----------------");
		System.out.println("메뉴를 골라주세요");
		int num = scan.nextInt();
		int price = 0;
		String menu = "";
		
		price = prices.get(num-1);
		menu = menus.get(num-1);
		
		if(price != 0) {
			System.out.println("음료가 나왔습니다>"+menu+":"+price);
		
		}
	}
	public static void main(String[] args) {
		new quiz5();
	}
}
