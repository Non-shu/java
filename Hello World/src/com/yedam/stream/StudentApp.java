package com.yedam.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
	Scanner scn = new Scanner(System.in);
	boolean run = true;
	// 임시저장
	List<Student> students = new ArrayList<>();

	public StudentApp() {
		init(); // 초기값.
	}

	public void start() {
		while (run) {
			System.out.println("1.목록 2.추가 3.삭제 9.종료");
			System.out.print("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				studentList();
				break;
			case 2:
				addStudent();
				break;
			case 3:
				removeStudent();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				save();
				run = false;
				break;
			}
		}
		System.out.println("end of prog.");
	}// end of start

	public void studentList() {
		// 이 름 점수
		// --------
		// 홍길동 90
		System.out.println("이 름     점수");
		System.out.println("------------");
		for (Student std : students) {
			System.out.println("" + std.getName() + "     " + std.getScore() + "");
		}
	}// end of studentList

	public void addStudent() {
		System.out.print("학생의 이름을 입력>> ");
		String name = scn.nextLine();

		double height = 0;
		while (true) {
			try {
				System.out.print("학생의 키를 입력>> ");
				height = Double.parseDouble(scn.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 키는 숫자를 입력해 주세요.");
			}
		}
		double weight = 0;
		while (true) {
			try {
				System.out.print("학생의 몸무게를 입력>> ");
				weight = Double.parseDouble(scn.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 몸무게는 숫자를 입력해 주세요.");
			}
		}	
			
		System.out.print("학생의 점수를 입력>> ");
		int score = Integer.parseInt(scn.nextLine());

		students.add(new Student(name, height, weight, score));// 추가
		System.out.println("등록완료.");
	}// end of addStudent

	public void removeStudent() {
		System.out.print("학생의 이름을 입력>> ");
		String name = scn.nextLine();

		// 삭제
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				students.remove(i);
				System.out.println("삭제완료.");
				return;
			}
		}
	}// end of removeStudent

	public void save() {
		// c:/Temp/studentList.txt
		try {
			Writer writer = new FileWriter("C:/Temp/studentList.txt");
			// 갯수만큼 반복저장.
			for (Student std : students) { // 공백 아니면 , 구분
				writer.write(
						std.getName() + " " + std.getHeight() + " " + std.getWeight() + " " + std.getScore() + "\n");
			}
			writer.flush();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("save ok.");
	}// end of save
		// 파일읽어서 컬렉션저장.

	public void init() {
		// c:/temp/studentList.txt
		try {
			Reader reader = new FileReader("C:/Temp/studentList.txt");
			BufferedReader br = new BufferedReader(reader);
			while (true) {
				String str = br.readLine();
				if (str == null)
					break; // 반복문 종료.
				String[] ary = str.split(" "); // 이름 키 몸무게 점수
				Student student = new Student(ary[0], // 이름
						Double.parseDouble(ary[1]), // 키
						Double.parseDouble(ary[2]), // 몸무게
						Integer.parseInt(ary[3]));// 점수

				students.add(student); // 컬렉션추가.
			}
			br.close();
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
