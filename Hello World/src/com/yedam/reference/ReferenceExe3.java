package com.yedam.reference;

import java.util.Scanner;


public class ReferenceExe3 {
public static void main(String[] args) {
	exe();
}//end of main.


public static void exe() {
	Scanner scn = new Scanner(System.in);
	boolean run = true;
	//이름, 연락처, 성별 => 100개 공간.
	String[][] friends = new String[100][3];
	friends[0] = new String[] { "홍길동","010-1313-1213", "남"};
	friends[1] = new String[] { "김민수","010-3333-1111", "남"};

	System.out.println("이름을 입력>>");
	String name = scn.nextLine();
	System.out.println("연락처를 입력>>");
	String phone = scn.nextLine();
	System.out.println("성별을 입력>>");
	String gender = scn.nextLine();
	while(run) {
		System.out.println("1.목록(이름,연락처,성별) 2.등록 3.조회(성별) 4.삭제 5.수정 9.종료");
		System.out.print("선택하세요 >>");
		int menu = Integer.parseInt(scn.nextLine());
	for(int i = 0; i < friends.length; i++) {
		if(friends[i] != null && friends[i][0] != null) {
			System.out.printf("이름은 $s, 연락처는 %s\n"//
					+friends[i][0],friends[i][1]);
		}
	  }
    }
  }
}
