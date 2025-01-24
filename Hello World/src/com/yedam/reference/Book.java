package com.yedam.reference;

public class Book {
//필드
private	String bookName;
private	String bookWriter;
private	String bookPublisher;
private	int bookPrice;

//public, default, private =>접근제한자 (access.modifier)
//생성자
	Book(String 도서명, String 저자, String 출판사, int 판매가격) {
		this.bookName = 도서명;
		this.bookWriter = 저자;
		this.bookPublisher = 출판사;
		this.bookPrice = 판매가격;
	}

	void printInfo() {
		System.out.printf("도서명은 %s, 저자는 %s, 출판사는 %s 판매가격은 %d\n", bookName, bookWriter, bookPublisher, bookPrice);
	}

// String showbookinfo(){
// return bookName + " " + bookWriter+ " " + bookPrice;
//}
	void showDetailInfo() {
		// 도서명 : 이것이 자바다 출판사 : 한빛미디어
		// 저 자 : 신용권 가 격 : 25000원
		String strfomet = "도서명 : %10s\t출판사 : %6s\n저 자 : %3s\t가 격 : %5d원\n";
		System.out.printf(strfomet, bookName, bookPublisher, bookWriter, bookPrice);
	}

// setter. 
	void setBookPrice(int bookPrice) {
		if (bookPrice < 0) {
			this.bookPrice = 0;
			return;
		}
		this.bookPrice = bookPrice;
	}

	void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

//getter
	public String getBookName() {
		return bookName;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public int getBookPrice() {
		return bookPrice;
	}

}
