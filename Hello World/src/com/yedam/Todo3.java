package com.yedam;

import java.util.Scanner;

public class Todo3 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		String[][] friendAry = new String[100][3];
		friendAry[0] = new String[] { "홍길동1", "010-1111-1111", "남" };
		friendAry[1] = new String[] { "홍길동2", "010-2222-1111", "남" };
		friendAry[2] = new String[] { "홍길동3", "010-3333-1111", "남" };
		friendAry[3] = new String[] { "홍길동4", "010-4444-1111", "남" };
		friendAry[4] = new String[] { "홍길동5", "010-5555-1111", "남" };
		friendAry[5] = new String[] { "홍길동6", "010-6666-1111", "남" };
		friendAry[6] = new String[] { "김미순1", "010-1111-2222", "여" };
		friendAry[7] = new String[] { "김미순2", "010-1111-3333", "여" };
		friendAry[8] = new String[] { "김미순3", "010-1111-4444", "여" };
		friendAry[9] = new String[] { "김미순4", "010-1111-5555", "여" };
		friendAry[10] = new String[] { "김미순5", "010-1111-6666", "여" };
		friendAry[11] = new String[] { "김미순6", "010-1111-7777", "여" };
		friendAry[12] = new String[] { "김미순7", "010-1111-8888", "여" };

		while (run) {
			System.out.println("1.목록 2.입력 3.조회(성별) 4.삭제 5.수정 9.종료");
			System.out.print("메뉴를 선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 목록출력. 이름 연락처 성별
				System.out.println("이름      연락처       성별");
				System.out.println("========================");
				for (int i = 0; i < friendAry.length; i++) {
					// 값을 담고 있는 요소만 출력.
					if (friendAry[i][0] != null) {
						System.out.printf("%s %s %s\n", friendAry[i][0]//
								, friendAry[i][1], friendAry[i][2]);
					}
				}
				System.out.println("========================");
				break;

			case 2: // 입력.
				System.out.println("이름을 입력>>");
				String name = scn.nextLine();
				System.out.println("연락처를 입력>>");
				String phone = scn.nextLine();
				System.out.println("성별을 입력>>");
				String gender = scn.nextLine();
				// 등록하기.
				for (int i = 0; i < friendAry.length; i++) {
					// 빈값을 판단하기.
					if (friendAry[i][0] == null) {
						friendAry[i] = new String[] { name, phone, gender };
						break;
					}
				}
				break; // switch 구문의 break;

			case 3: // 조회(성별)
				System.out.print("조회할 성별 입력> ex)남 or 여");
				gender = scn.nextLine();

				System.out.println("이름    연락처       성별");
				System.out.println("========================");
				for (int i = 0; i < friendAry.length; i++) {
					// 값을 담고 있는 요소만 출력.
					if (friendAry[i][0] != null && friendAry[i][2].equals(gender)) {
						System.out.printf("%s %s %s\n", friendAry[i][0]//
								, friendAry[i][1], friendAry[i][2]);
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
