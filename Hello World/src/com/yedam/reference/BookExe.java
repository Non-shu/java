package com.yedam.reference;

import java.util.Scanner;

/*
 * <<도서명, 저자, 출판사, 판매가격(int) >>
*/
public class BookExe {

	public static void main(String[] args) {
		Book[] bookRepository = new Book[100];

		Scanner scn = new Scanner(System.in);
		boolean run = true;

		// 1.전체목록 2.도서등록 3.조회(출판사) 9.종료
		while (run) {
			System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 9.종료");
			System.out.print("선택하세요 >>");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {

			case 1:// 전체목록
				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] != null) {
						bookRepository[i].printInfo();
					}
				}
				break;
			case 2:// 도서등록
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
						break;
					}
				}
				System.out.print("등록완료");
				break;

			case 3:// 조회(출판사)
				System.out.println("출판사 입력>> ");
				String searchPublisher = scn.nextLine();

				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] != null && bookRepository[i]//
							.bookPublisher.equals(searchPublisher)) {
						bookRepository[i].printInfo();
					}
				}
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
