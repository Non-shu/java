package com.yedam.exception;

import com.yedam.reference.Student;

public class NullPointerExe {
	public static void main(String[] args) {

		Student student = null;
		String[] strAry = {"Hello", "World"};
		//예외처리
	try {	
		int menu= Integer.parseInt("a");
		strAry[2] = "Nice"; //배열의 범위 밖
		System.out.println(student.getStudentName());
		
	//} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
	}catch (NullPointerException e) {
		System.out.println("null값을 참조 또는 배열 범위를 초과했습니다.");
		e.printStackTrace(); // 자세한 오류 보기 좋다 이말이다 
//	} catch (ArrayIndexOutOfBoundsException e) {
//		System.out.println("배열 범위를 초과했습니다.");
	}catch (NumberFormatException e) {
		System.out.println("NumberFormat 예외발생.");
	}catch (RuntimeException e) {
		System.out.println("상위exception은 하위exception 처리.");
//	}catch (Exception e) {
//		e.printStackTrace();
	}
		System.out.println("end of prog");//끝 부 분 
	}
}
