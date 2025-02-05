package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.inheritance.ComFriend;
import com.yedam.inheritance.Friend;
import com.yedam.reference.Student;

/*
 * String[] strAry;
 * Collection 1) List 2) Set 3) Map 
 */
public class Exe {
	public static void main(String[] args) {
		System.out.println("홍길동".indexOf("길동"));
		
	// 학생정보를 저장하는 컬렉션 선언.
	///	3명추가 
		List<Student> stdList= new ArrayList<Student>();
		stdList.add(new Student("김민수",85,88));
		stdList.add(new Student("홍정학",75,90));
		stdList.add(new Student("홍길동",80,77));
		
	//삭제
		for (int i=0; i<stdList.size(); i++) {
			if(stdList.get(i).getStudentName().equals("김민수")) {
				//students[i];
				stdList.remove(i);
				break;
			}
		}	
	
	// 출력
		for(int i =0; i<stdList.size();i++) {
			System.out.println("이름: " + stdList.get(i).getStudentName());
		}
	}
	
		void method() {
		String[] strAry = new String[10]; //배열.
		List<String> strList = new ArrayList<String>();//컬렉션.
		List<Friend> friends = new ArrayList<Friend>();
		
		friends.add(new Friend("홍길동", "010-1111-1111"));
		friends.add(new ComFriend("김길동", "010-2222-2222","국민은행","신용보증팀"));
		
		friends.remove(new Friend("홍길동","010-1111-1111"));
		System.out.println("strList크기: "+ friends.size());
		
		System.out.println(friends.get(1).showInfo());
		
		//추가.
		strList.add("하이용");
		strList.add("Hello");
		strList.add("방가용");
		System.out.println("strList크기: "+ strList.size());
		
		
		//삭제
		strList.remove(0); //0번째 위치 지우기. 
		strList.remove("Hello"); // 객체 지우기. 
		System.out.println("strList크기: "+ strList.size());
		for(int i =0; i<strList.size();i++) {
			System.out.println(strList.get(i));
		}
	}
}
