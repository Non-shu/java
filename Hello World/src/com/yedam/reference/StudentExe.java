package com.yedam.reference;

import java.util.Scanner;

/*
 * main 담고있는 실행클래스.
 */
public class StudentExe {

	public static void main(String[] args) {

		Student[] students = new Student[5];

		// 상수선언 final.
		final Student std1 = new Student("홍길동", 80); // 인스턴스 생성.
		std1.mathScore = -85;
		std1.mathScore = 77;
		std1.gender = Gender.MEN;
//		std1 = new Student("Hong", 88); // 새로운 인스턴스 대입 불가.

		Student std2 = new Student();
		std2.studentName = "김민수";
		std2.engScore = 85;
		std2.mathScore = 88;
		std2.gender = Gender.MEN;

		// 홍정학, 75, 90
		Student std3 = new Student();
		std3.studentName = "홍정학";
		std3.engScore = 75;
		std3.mathScore = 90;
		std3.gender = Gender.WOMEN;

		students[0] = std1;
		students[1] = std2;
		students[2] = std3;
		students[3] = new Student("김민지", 88, 92);

		// 학생의 이름을 입력받는 변수: studName
		// 학생의 평균을 출력하는 프로그램을 작성.
		Scanner scn = new Scanner(System.in);
//		System.out.println("학생의 이름을 입력>>> ");
//		String studName = scn.nextLine();

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null //
					// && students[i].studentName.equals(studName)
					&& students[i].gender == Gender.MEN) {
				students[i].printInfo();
//				System.out.printf("학생의 평균은 %.2f입니다.\n"//
//						, students[i].getAverage());
			}
//			if (students[i] != null && students[i].getAverage() >= 85) {
//				students[i].printInfo();
//			}

		}

	}
}
