package basicquiz2;

import java.util.ArrayList;
import java.util.List;

public class Librarian {
	//책의 모든 데이터 및 대여, 반납 등의 가능 여부들을 관리하는 창구 역할
	
	private List<Book> books = new ArrayList<Book>();
	
	public Librarian() {
		books.add(new Book("Java의 정석","도우 출판",true,0));
		books.add(new Book("이것이 자바다","한빛미디어",false,2));
		books.add(new Book("이펙트 자바","인사이트",false,10));
		books.add(new Book("Head Rifst","도우한빛 미디어",false,13));	
	}
	
	public void getBookList() {
		System.out.println();
		System.out.println();
		System.out.println("-------------대여 목록--------------");
		for(int i = 0; i < books.size(); i++) {
			System.out.println((i+1)+":"+books.get(i));
		}
	}
	
	public void getMenuList() {
		System.out.println("-------------선택 메뉴--------------");
		System.out.println("1.대여하기");
		System.out.println("2.반납하기");
		System.out.println("3.책 추가하기");
		System.out.println("4.책 제거하기");
		System.out.println("5.종료하기");
		System.out.println();
		System.out.println("메뉴를 선택해주세요");
	}
	
	public boolean isRental(int num) {
		return books.get(num).isRantal();
	}
	
	public void setRental(int num) {
		System.out.println("["+books.get(num).getName()+"]을 대여하셨습니다.");
		books.get(num).setRantal(false);
		books.get(num).setDays(1);
	}
	
	public void setReturn(int num) {
		System.out.println("책이 정상적으로 반납되셨습니다.");
		books.get(num).setRantal(true);
		books.get(num).setDays(0);
	}
	
	public void getFine(int num) {
		if(books.get(num).getDays() > 7) {
			System.out.println("책의 기한이 ["+ (books.get(num).getDays()-7)+"]일 연체되셨습니다.");
			System.out.println("수수료는 ["+((books.get(num).getDays()-7)*200)+"]원 입니다.");
		}
	}
	
	public void setBook(String name, String pub) {
		books.add(new Book(name,pub,true,0));
	}
	
	public void removeBook(int num) {
		books.remove(num);
	}
}
