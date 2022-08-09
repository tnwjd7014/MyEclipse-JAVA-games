package basicquiz2;

import java.util.Scanner;

public class BookRentalMain {
	//실제 로직이 돌아가는 영역
	private Scanner scan = new Scanner(System.in);
	
	private Librarian  li;
	
	public BookRentalMain() {
		li = new Librarian();
		
		while(true) {
			li.getBookList();
			li.getMenuList();
			int i = scan.nextInt();
			
		if(i==1) {
			System.out.println("몇 번째 책을 대여하시겠습니까?");
			int num = scan.nextInt();
			if(li.isRental(num-1)) {li.setRental(num-1);}else {System.out.println("해당 책은 대여하실 수 없습니다.");}
		}else if(i==2) {
			System.out.println("몇 번째 책을 반납하시겠습니까?");
			int num = scan.nextInt();
			if(!li.isRental(num-1)) {li.setReturn(num-1);}else {System.out.println("해당 책은 반납할 수 있는 책이 아닙니다");
			}
		}else if(i==3) {
			scan.nextLine();
			System.out.println("책을 추가해주세요");
			System.out.println("책이름 : ");
			String name = scan.nextLine();
			System.out.println("출판사 : ");
			String pub = scan.nextLine();
			
			li.setBook(name, pub);
			System.out.println("책이 정상적으로 추가되었습니다 ["+name+"]:["+pub+"]");
		}else if(i==4) {
			System.out.println("몇 번째 책을 삭제하시겠습니까?");
			int num = scan.nextInt();
			li.removeBook(num-1);
			System.out.println("책이 정삭적으로 삭제되었습니다.");
		}else if(i==5) {
			System.out.println("시스템을 정삭적으로 종료합니다");
			break;
		}else {System.out.println("잘못 입력하셨습니다. 처음으로 돌아갑니다.");}
		
		}
	}
	
	public static void main(String[] args) {
		new BookRentalMain();
	}
}
