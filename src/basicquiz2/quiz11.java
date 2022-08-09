package basicquiz2;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz11 {
	private Scanner scan = new Scanner(System.in);
	private ArrayList<String> bookname = new ArrayList<String>();
	private ArrayList<String> publisher = new ArrayList<String>();
	private ArrayList<Boolean> rantal = new ArrayList<Boolean>();
	private ArrayList<Integer> days = new ArrayList<Integer>();
	
	public quiz11() {
		bookname.add("Java의 정석");
		publisher.add("도우 출판");
		rantal.add(true);
		days.add(0);
		
		bookname.add("이것이 자바다");
		publisher.add("한빛미디어");
		rantal.add(false);
		days.add(2);
		
		bookname.add("이펙트 자바");
		publisher.add("인사이트");
		rantal.add(false);
		days.add(10);
		
		bookname.add("Head First 자바");
		publisher.add("한빛 미디어");
		rantal.add(false);
		days.add(13);
		
		while(true){
			System.out.println();
			System.out.println();
			System.out.println("------------대여 목록----------");
			System.out.println("  이름\t\t출판사\t대여가능여부\t대여일");
			for (int i = 1; i <= bookname.size(); i++) {
				System.out.println(i+":"+bookname.get(i-1)+"\t"+publisher.get(i-1)+"\t"+(rantal.get(i-1)?"O":"X")+"\t\t"+days.get(i-1));
			}
			System.out.println("------------선택 메뉴----------");
			System.out.println("1.대여하기");
			System.out.println("2.반납하기");
			System.out.println("3.책 추가하기");
			System.out.println("4.책 제거하기");
			System.out.println("5.종료하기");
			System.out.println();
			System.out.println("메뉴를 선택해주세요");
			int i = scan.nextInt();
			
			if(i==1) {
				System.out.println("몇번째 책을 대여하시겠습니까?");
				int num = scan.nextInt();
				if(rantal.get(num-1)) {
					System.out.println("["+bookname.get(num-1)+"]을 대여하셨습니다.");
					rantal.set(num-1,false);
					days.set(num-1, 0);
					}else {
					System.out.println("해당 책은 대여하실 수 없습니다.");
					}
				}else if(i==2) {
				System.out.println("몇번째 책을 반납하시겠습니까?");
				int num=scan.nextInt();
				if(!(rantal.get(num-1))){
					System.out.println("책이 정상적으로 반납되셨습니다.");
					if(days.get(num-1)>7) {
						System.out.println("책의 기한이 {"+(days.get(num-1)-7)+"]일 연체되셨습니다.");
						System.out.println("수수료는 ["+(days.get(num-1)-7)*200+"]원 입니다.");
					}
					rantal.set(num-1, true);
					days.set(num-1, 0);
					}else {System.out.println("해당 책은 반납할 수 있는 책이 아닙니다.");}
				}else if(i==3) {
					scan.nextLine();
					System.out.println("책을 추가해주세요");
					System.out.println("책이름 : ");
					String name = scan.nextLine();
					System.out.println("출판사 : ");
					String pub = scan.nextLine();
					
					bookname.add(name);
					publisher.add(pub);
					rantal.add(true);
					days.add(0);
					System.out.println("책이 정상적으로 추가되었습니다 ["+name+"]:["+pub+"]");
			}else if(i==4) {
				System.out.println("몇번째 책을 삭제하시겠습니까?");
				int num = scan.nextInt();
				
				bookname.remove(num-1);
				publisher.remove(num-1);
				rantal.remove(num-1);
				days.remove(num-1);
				
				System.out.println("책이 정상적으로 삭제되었습니다.");
			}else if(i==5) {
				System.out.println("시스템을 정상적으로 종료합니다");
				break;
			}else {
				System.out.println("잘못입력하셨습니다. 처음으로 돌아갑니다.");
			}
		}	
	}
	

	
	
	public static void main(String[] args) {
		new quiz11();

	}

}
