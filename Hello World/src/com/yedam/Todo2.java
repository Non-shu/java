package com.yedam;

import java.util.Scanner;

/*
 * 친구정보관리 앱 v.1
 * 이름,연락처,성별(남/여) => 홍길동,010-1234-2345,남 
 * 1.목록 (이름,연락처,성별) 2.등록 3.조회(성별) 4.삭제(이름) 5.수정(이름):연락처를수정 9.종료
 * String[] friendAry 크기는 100개 ;
 */
public class Todo2 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		String[] friendAry = new String[100];
		friendAry[0] = "홍길동,010-1234-1234,남";
		friendAry[1] = "김민석,010-3333-3221,남";
		friendAry[2] = "송선희,010-1212-3423,여";
		friendAry[3] = "김지영,010-3333-3555,여";

		while (run) {
			System.out.println("1.목록 2.입력 3.조회(성별) 4.삭제 5.수정 9.종료");
			System.out.print("메뉴를 선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 목록출력. 이름 연락처 성별
				System.out.println("이름    연락처       성별");
				System.out.println("========================");
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						System.out.printf("%s %s %s \n", //
								friendAry[i].split(",")[0], //
								friendAry[i].split(",")[1], //
								friendAry[i].split(",")[2]);
					}
				}
				System.out.println("========================");
				break;

			case 2: // 입력.
				System.out.println("정보입력> ex)홍길동,010-1111-2222,남");
				String newFriend = scn.nextLine();
				boolean isExist = false; // 존재여부의 값을 확인해서 입력처리.
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null && //
							friendAry[i].split(",")[0].equals(newFriend.split(",")[0])) {
						isExist = true;
					}
				}
				if (isExist) {
					System.out.println("이미 존재하는 이름입니다. 등록하겠습니까? (Y/N) ");
					if (scn.nextLine().equals("Y")) {
						isExist = false;
					}
				}
				// 등록하기.
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] == null) {
						friendAry[i] = scn.nextLine(); // 입력.
						System.out.println("등록완료.");
						break;
					}
				}
				break;

			case 3: // 조회(성별)
				System.out.print("조회할 성별 입력> ex)남 or 여");
				String gender = scn.nextLine();

				System.out.println("이름    연락처       성별");
				System.out.println("========================");
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null && //
							friendAry[i].split(",")[2].equals(gender)) {
						System.out.printf("%s %s %s \n", //
								friendAry[i].split(",")[0], //
								friendAry[i].split(",")[1], //
								friendAry[i].split(",")[2]);
					}
				}
				System.out.println("========================");
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}

		} // end of while.
		System.out.println("end of prog.");

	} // end of main.

}
