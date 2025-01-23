package com.yedam;

import java.util.Scanner;

/*
*친구정보관리 앱 v.1
*친구의 이름, 연락처, 성별(남/여) = 홍길동,010-1234-3234,남
*1.목록 (이름, 연락처, 성별) 2.등록 3.조회(성별) 4.삭제(이름), 5.수정(이름):연락처수정 9.종료
*String[] friendAry 크기는 100개 ;
*
*/
public class Todo2 {

	public static void main(String[] args) {
		String[] friendAry = new String[100];
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		friendAry[0] = "데스윙,010-4444-4444,남";
		friendAry[1] = "이세라,010-2424-7777,여";
		friendAry[2] = "알렉스트라자,010-8888-1515,여";
		friendAry[3] = "칼렉고스,010-7777-1111,남";
		friendAry[4] = "말리고스,010-0101-0001,남";
		friendAry[5] = "레기온,010-3333-8888,남";

		while (run) {
			System.out.println("1.목록(이름,연락처,성별) 2.등록 3.조회(성별) 4.삭제 5.수정 9.종료");
			System.out.print("선택하세요 >>");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:// 친구목록(이름.연락처.성별)
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						System.out.printf("%s\n", friendAry[i]);
					}
				}
				break;
			case 2:// 등록
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] == null) {
						System.out.println("이름, 연락처, 성별을 입력하세요>> ");
						friendAry[i] = scn.nextLine();
						break;
					}
				}
				break;
			case 3:// 조회(성별)
				System.out.println("성별 입력>> ");
				String searchGender = scn.nextLine();

				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						if (friendAry[i].split(",")[2].equals(searchGender)) {
							String name = friendAry[i].split(",")[0];
							String phone = friendAry[i].split(",")[1];
							String gender = friendAry[i].split(",")[2];
							System.out.printf("%s %s %s \n", name, phone, gender);
						}
					}
				}
				break;
			case 4:// 삭제
				System.out.println("삭제 할 이름을 입력하세요. >>");
				String delName = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						String dd = friendAry[i].split(",")[0];
						if (dd.equals(delName)) {
							friendAry[i] = null;
						}
					}
				}break;
			case 5:// 수정
				System.out.println("수정 할 번호를 입력하세요. >>");
				String pixPhone = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						String pp = friendAry[i].split(",")[1];
						if (pp.equals(pixPhone)) {
							System.out.println("바꿀 번호를 입력하세요 >> ");
							String newNumber = scn.nextLine();
						friendAry[i]=friendAry[i].split(",")[0]+newNumber+friendAry[i].split(",")[2];
						}
					}
				}break;
			case 9:// 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
			}// switch 종료

		} // while 종료

	}// end of main
} // end of class
