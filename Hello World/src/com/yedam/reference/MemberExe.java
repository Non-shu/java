package com.yedam.reference;

public class MemberExe {
	// 싱글톤객체 생성.
	// 1. 필드를 static 선언.
	private static MemberExe instance = new MemberExe(); // static 필드.

	// 2. 생성자 은닉.
	private MemberExe() {
	}

	// 3. 인스턴스를 제공해주는 메소드. getInstance();
	public static MemberExe getInstance() {
		return instance;
	}

	static Member[] members = { //
			new Member(), //
			new Member(), //
			new Member() };

	// 기본생성자. MemberExe(){}
	public static String login(String id, String password) {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null //
					&& members[i].getMemberId().equals(id)//
					&& members[i].getPassword().equals(password)) {
				return members[i].getMemberName(); // id, password 일치.
			}
		}
		return null; // 일치하는 값이 없음.
	} // end of login().
}

