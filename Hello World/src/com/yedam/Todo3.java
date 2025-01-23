package com.yedam;

import java.util.Scanner;

public class Todo3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		String[][] friendAry = new String[100][3];

		friendAry[0] = new String[] { "데스윙", "010-4444-4444", "남" };
		friendAry[1] = new String[] { "이세라", "010-2424-7777", "여" };
		friendAry[2] = new String[] { "알렉스트라자", "010-8888-1515", "여" };
		friendAry[3] = new String[] { "칼렉고스", "010-7777-1111", "남" };
		friendAry[4] = new String[] { "말리고스", "010-0101-0001", "남" };
		friendAry[5] = new String[] { "레기온", "010-3333-8888", "남" };

		while (run) {
			System.out.println("1.친구목록(이름.연락처.성별) 2.입력 3.조회(성별) 4.삭제 5.수정 9.종료");
			System.out.print("선택하세요 >>");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:// 친구목록(이름.연락처.성별)
				System.out.println("이름         연락처            성별");
				System.out.println("================================");
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i][0] != null) {
						System.out.printf("%s %s %s \n", friendAry[i][0], friendAry[i][1], friendAry[i][2]);

					}
				}
				break;
			case 2:// 입력
				System.out.println("이름을 입력>>");
				String name = scn.nextLine();
				System.out.println("연락처를 입력>>");
				String phone = scn.nextLine();
				System.out.println("성별을 입력>>");
				String gender = scn.nextLine();

				System.out.println();

				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i][0] == null) {
//						System.out.println("i의 값 [" + i + "] = >" + friendAry[i]);
						friendAry[i] = new String[] { name, phone, gender };
						System.out.print("등록완료");
						break;
					}
				}
				break;
			case 3:// 조회(성별)
				System.out.println("성별 입력>> ");
				String searchgender = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i][0] != null) {
						if (friendAry[i][2].equals(searchgender)) {
							System.out.printf("이름 : %s 연락처 : %s 성별 : %s \n", friendAry[i][0], friendAry[i][1],
									friendAry[i][2]);
						}
					}
				}
				break;
//			case 4:// 삭제
//				System.out.println("삭제 할 이름을 입력하세요. >>");
//				String delName = scn.nextLine();
//				for (int i = 0; i < friendAry.length; i++) {
//					if (friendAry[i] != null) {
//						String dd = friendAry[i].split(",")[0];
//						if (dd.equals(delName)) {
//							friendAry[i] = null;
//						}
//					}
//				}break;
//			case 5:// 수정
//				System.out.println("수정 할 번호를 입력하세요. >>");
//				String pixPhone = scn.nextLine();
//				for (int i = 0; i < friendAry.length; i++) {
//					if (friendAry[i] != null) {
//						String pp = friendAry[i].split(",")[1];
//						if (pp.equals(pixPhone)) {
//							System.out.println("바꿀 번호를 입력하세요 >> ");
//							String newNumber = scn.nextLine();
//						friendAry[i]=friendAry[i].split(",")[0]+newNumber+friendAry[i].split(",")[2];
//						}
//					}
////				}break;
			case 9:// 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
			}// switch 종료

		} // while 종료

	}// end of main
} // end of class
