package com.yedam.reference;

public class Book {
String bookName;
String bookWriter;
String bookPublisher;
int bookPrice;
Book(){	
}


Book(String 도서명, String 저자, String 출판사, int 판매가격 ){
	this.bookName = 도서명;
	this.bookWriter = 저자;
	this.bookPublisher = 출판사;
	this.bookPrice = 판매가격;
}

void printInfo() {
	System.out.printf("도서명은 %s, 저자는 %s, 출판사는 %s 판매가격은 %d\n", bookName, bookWriter, bookPublisher, bookPrice);
}


}
