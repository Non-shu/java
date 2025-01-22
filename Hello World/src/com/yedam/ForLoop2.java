package com.yedam;

import java.util.Scanner;

public class ForLoop2 {
	public static void main(String[] args) {
//		String[] infoAry = "홍길동, 80".split(",");
//		System.out.println(infoAry[0]);
//		System.out.println(Integer.parseInt("80")*Integer.parseInt("70"));
//	ex1)System.out.println("이름, 점수 값을 입력");
//		String userVal = scn.nextLine();
//		String[] teamAry = userVal.split(",");
//		System.out.printf("이름은 홍길동이고 점수는 80입니다.", teamAry[0],teamAry[1]); // end of ex1)
		Scanner scn = new Scanner(System.in);

//		System.out.println("이름 입력> "); // 조회 방법
//		String searchName = scn.nextLine();
//		System.out.println("박우식".equals(searchName)); //"박우식" == searchName 

		String[] studentAry = new String[100];// ("","","")
		studentAry[0] = "고길동,99";
		studentAry[1] = "도우너,61";
		studentAry[2] = "희동이,79";
		studentAry[3] = "박우식,71";

		boolean run = true;

		while (run) {
			System.out.println("1.학생이름,점수 2.최고점수 3.학생입력(한건씩) 4.점수조회(이름)9.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 학생이름 점수
				for (int i = 0; i < studentAry.length; i++) {
					System.out.print("이름, 점수 값을 입력하세요>> ex)홍길동,85> ");
					studentAry[i] = scn.nextLine();

				}
				System.out.println("등록정보");
				break;
			case 2: // 최고점수
				int max = 0;
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) { // 값이 있을 경우, 밑의 함수를 계산하시오-
						int name = Integer.parseInt(studentAry[i].split(",")[1]);
						if (max < name) {
							max = name;
							break;
						}
					}
				}
				System.out.printf("최고점수는 %d\n", max);
				break;
			case 3: // 한칸씩 입력하기.
				System.out.println("이름, 점수 값을 입력 하세요 >> ex)고길동,99");
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] == null) {// 빈 공간에 등록 후 반복문 종료.
						studentAry[i] = scn.nextLine();
						break;
					}
				}
				break;
			case 4: // 조회 (이름)
				System.out.println("이름 입력> ");
				String searchName = scn.nextLine();
				int ab = 0;
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) {
						if(studentAry[i].split(",")[0].equals(searchName)) {
						ab =Integer.parseInt(studentAry[i].split(",")[1]);
							//System.out.println("".equals(searchName)); // "" == searchName
							System.out.printf("%s의 점수 %d점\n", searchName, ab);
						}break;//for 구문의 break
					}
				}
				break; // switch 구문의 break 
			case 9: // 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}// switch 종료

		} // end of while

		System.out.println("end of prog");
	}// end of main

}// end of class
