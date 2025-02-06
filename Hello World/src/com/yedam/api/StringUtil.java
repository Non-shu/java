package com.yedam.api;

public class StringUtil {

	static void 연결하기(String str, String strl) {
		// 두 문장을 연결함.
		System.out.println(str.concat(",").concat(strl));
	}

	static void checkGender(String ssn) {
		// 성별을 출력. "남자입니다 또는 여자입니다."
		/*int pos = 6;
		 * if (ssn.length() == 14) {
		 * pos = 7;
		 * }
		 * 
		 * char chr = ssn.charAt(pos); // 찾고자하는 위치의 문자.
		 * switch (chr) {
		 * case'1':
		 * case'3':
		 * 	system.out.println("남자입니다.");
		 * break;
		 * case'2':
		 * case'4':
		 * 	system.out.println("여자입니다.");
		 * break;
		 * default:
		 */

		switch (ssn.charAt(7+((ssn.length() - 13)) - 1)) {
		case '1', '3': {

			System.out.println("남자입니다.");
			break;
		}
		case '2', '4': {
			System.out.println("여자입니다.");
			break;
		}
		default:

		}
	}

	static void checkExtesion(String file) {
		// 파일의 확장자는 jpg(또는 mp3, hwp) 입니다.
		System.out.println("확장자는: " + file.substring(file.indexOf(".") + 1) + "입니다.");
	}

	static void getLength(String str) {
		// 글자의 크기는 ??? 입니다.
		int length = str.trim().length();
		System.out.println("길이는 " + length + "글자 입니다.");
	}

}// end of StringUtil
