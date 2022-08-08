package basicquiz2;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz6 {

	private Scanner scan = new Scanner(System.in);
	private ArrayList<Menus> menus = new ArrayList<Menus>();

	public quiz6() {
		menus.add(new Menus("레쓰비",1000));
		menus.add(new Menus("비타500",1500));
		menus.add(new Menus("레드불",2000));
		menus.add(new Menus("바나나우유",1800));
		
		
		System.out.println("----자판기 메뉴----");
		
		for (int i = 1; i <= menus.size(); i++) {
			System.out.println(i+"."+menus.get(i-1)+"원");
		}
	
		System.out.println("----------------");
		System.out.println("메뉴를 골라주세요");
		int num = scan.nextInt();
		int price = 0;
		String menu = "";
		
		System.out.println("음료가 나왔습니다>"+menus.get(num-1));
		}
	
	
	public static void main(String[] args) {
		new quiz6();
	}

}
