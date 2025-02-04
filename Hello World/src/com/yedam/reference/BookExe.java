package com.yedam.reference;
/*
 * << 도서명, 저자, 출판사, 판매가격 >>
 */

import java.util.Scanner;

public class BookExe {

	static Book[] bookRepository = new Book[100];

	// 저장공간에 값을 초기값을 생성.
	public static void init() {
		// 초기데이터.
		bookRepository[0] = new Book("이것이   자바다", "신용권", "한빛미디어", 30000);
		bookRepository[1] = new Book("자바스크립트기초", "김기초", "한빛미디어", 20000);
		bookRepository[2] = new Book("혼자공부하는자바", "김자바", "자바출판사", 25000);
	} // end of init()

	// 목록출력.
	public static void printList() {
		System.out.println("도서명        저자    가격");
		System.out.println("========================");
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null) {
				System.out.println(bookRepository[i].showBookInfo());
			}
		}
		System.out.println("========================");
	} // end of printList()

	static Scanner scn = new Scanner(System.in);

	// 도서등록.
	public static void addBook() {
		// 등록하기.
		System.out.print("도서명 입력>>");
		String name = scn.nextLine();
		System.out.print("저자 입력>>");
		String author = scn.nextLine();
		System.out.print("출판사 입력>>");
		String press = scn.nextLine();
		System.out.print("가격 입력>>");
		int price = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] == null) {
				bookRepository[i] = new Book(name, author, press, price);
				System.out.println("등록완료.");
				break; // for 종료.
			}
		}
	} // end of addBook()

	// 목록(출판사)
	public static void searchList() {
		System.out.print("출판사 입력>>");
		String press = scn.nextLine();

		System.out.println("도서명        저자    가격");
		System.out.println("========================");
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && //
					bookRepository[i].getBookPress().equals(press)) {
				System.out.println(bookRepository[i].showBookInfo());
			}
		}
		System.out.println("========================");
	} // end of searchList()

	// 가격수정.
	public static void modifyBook() {
		System.out.print("도서명 입력>>");
		String name = scn.nextLine();
		System.out.print("가격 입력>>");
		int price = Integer.parseInt(scn.nextLine());
		// 도서명으로 검색 => 입력값으로 필드변경.
		boolean isExist = false; //
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null //
					&& bookRepository[i].getBookTitle().equals(name)) {
				bookRepository[i].setBookPrice(price);
				System.out.println("수정완료.");
				isExist = true;
				break; // 수정완료되면 반복문 종료.
			}
		} // end of for.
		if (!isExist) {
			System.out.println("찾는 도서가 없습니다.");
		}
	} // end of modifyBook()

	// 상세조회.
	public static void showDetail() {
		System.out.print("도서명 입력>>");
		String name = scn.nextLine();
		Calculator cal = new Calculator();
		cal.getBookInfo(name, bookRepository).showDetailInfo();
		System.out.println("======================================");

	} // end of showDetail()

	public static void main(String[] args) {
		init(); // 기초데이터 생성.

		boolean run = true;
		while (run) {
			System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 4.금액수정 5.상세조회 9.종료");
			System.out.print("메뉴를 선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 목록출력. 도서명, 저자, 가격
				printList(); break;

			case 2: // 입력.
				addBook(); break; // switch case 종료.

			case 3: // 조회(출판사)
				searchList(); break;

			case 4: // 수정.
				modifyBook(); break;

			case 5: // 상세조회.
				showDetail(); break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false; break;

			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}

		} // end of while.
		System.out.println("end of prog.");

	} // end of main.

}
