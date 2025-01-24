package com.yedam.reference;

import java.util.Scanner;

/*
 * <<도서명, 저자, 출판사, 판매가격(int) >>
*/
public class BookExe {

	static Book[] bookRepository = new Book[100];

	// 저장공간에 값을 초기값을 생성.
	public static void init() {
		// 초기데이터
		bookRepository[0] = new Book("가나디", "듀", "카카오", 8000);
		bookRepository[1] = new Book("짱구는못말려", "나카츠키탓페이", "대원미디어", 5500);
		bookRepository[2] = new Book("혼자공부하는자바", "김자반", "자바출판사", 19000);
	}// end of init()

	// 목록출력
	public static void printList() {
		System.out.println("=============================================================");
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null) {
				bookRepository[i].printInfo();
			}
		}
		System.out.println("=============================================================");
	}// end of printList()

	static Scanner scn = new Scanner(System.in);

	// 도서 등록.
	public static void addBook() {
		System.out.println("도서명을 입력>>");
		String 도서명 = scn.nextLine();
		System.out.println("저자를 입력>>");
		String 저자 = scn.nextLine();
		System.out.println("출판사를 입력>>");
		String 출판사 = scn.nextLine();
		System.out.println("판매가격을 입력>>");
		int 판매가격 = Integer.parseInt(scn.nextLine());

		Book newBook = new Book(도서명, 저자, 출판사, 판매가격);
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] == null) {
				bookRepository[i] = newBook;
				System.out.print("등록완료");
				break;
			}
		}
	}// end of addBook()

	// 목록(출판사)
	public static void searchList() {
		System.out.println("출판사 입력>> ");
		String searchPublisher = scn.nextLine();
		System.out.println("=============================================================");
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i]//
					.getBookPublisher().equals(searchPublisher)) {
				bookRepository[i].printInfo();
			}
		}
		System.out.println("=============================================================");
	}// end of searchList()

	// 수정
	public static void modifyBook() {
		System.out.println("도서명 입력>>");
		String 도서명 = scn.nextLine();
		System.out.println("가격 입력>>");
		int 판매가격 = Integer.parseInt(scn.nextLine());
		// 도서명으로 검색 -> 입력받은 값으로 필드변경
		boolean isExist = false;//
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookName().equals(도서명)) {
				bookRepository[i].setBookPrice(판매가격);
				System.out.println("수정완료.");
				isExist = true;
				break; // 수정완료시 반복문종료
			}
		} // end of for
		if (isExist) {
			System.out.println("찾는 도서가 없습니다.");
		}
	}// end of modifyBook()

	// 상세조회
	public static void detailList() {
		System.out.println("도서명 입력>>");
		String 도서명 = scn.nextLine();
		System.out.println("=============================================================");
//		Calculator cal = new Calculator();
//		cal.getBookInfo(도서명, bookRepository).showDetailInfo();
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookName().equals(도서명)) {
				bookRepository[i].showDetailInfo();// 상세출력.
				System.out.println("=============================================================");

				break;
			}
		}

	}// end of detailList()

	public static void main(String[] args) {
		init(); // 기초데이터 생성.
		boolean run = true;

		// 1.전체목록 2.도서등록 3.조회(출판사) 9.종료
		while (run) {
			System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 4.금액수정 5.상세조회 9.종료");
			System.out.print("선택하세요 >>");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:// 전체목록
				printList();
				break;
			case 2:// 도서등록
				addBook();
				break;
			case 3:// 조회(출판사)
				searchList();
				break;
			case 4:// 금액수정
				modifyBook();
				break;
			case 5:// 상세조회
				detailList();
				break;

			case 9:// 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못된 메뉴 선택입니다.");
			}// end of switch

		} // end of while
		System.out.println("end of prog.");
	}// end of main.

}// end of class
