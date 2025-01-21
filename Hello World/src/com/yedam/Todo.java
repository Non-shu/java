package com.yedam;

import java.util.Scanner;

// com.yedam.todo
public class Todo {
	
	public static void main(String[] args) {
		 Scanner scn = new java.util.Scanner(System.in);
		 int balance = 0;
		 
		 while (true) {
			 System.out.println("1.입금 2.출금 3. 잔액조회 4.종료");
			 System.out.print("메뉴를 선택하세요.");			 		
		 //System.out.println("임의의 문자를 입력.");	
		 int num = Integer.parseInt(scn.nextLine());//문자타입변환. -> int 변환
		 //String num = scn.nextLine(); //문자타입변환. -> int 변환
		 if (num == 1) {//입금
			 System.out.print("입금액을 입력");
			 balance = Integer.parseInt(scn.nextLine());
		 } else if (num ==2) {//출금.
			 
		 } else if (num ==3) {//잔액조회.
			 System.out.printf("현재 잔액은 %d입니다.\n", balance);
		 } else if (num ==4) {//종료
		 
		 } 
	 }			 
		 System.out.printf("end of prog\n");
	}

}
