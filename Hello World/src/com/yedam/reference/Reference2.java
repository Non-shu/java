package com.yedam.reference;

public class Reference2 {

	public static void main(String[] args) {
//		String[][] scores = new String[5][2];
		String[][] scores = { { "홍길동", "80" }, //
				{ "김민수", "85" }, //
				{ "박헌수", "88" }, //
				{ "심상현", "90" }, //
				{ "최기동", "75" },//
		};
		int sum = 0;
		String[] temp = { "", "0" };
		for (int i = 0; i < scores.length; i++) {
			System.out.println("점수=> " + scores[i][1]);
			// sum에 값을 누적.
			sum = sum + Integer.parseInt(scores[i][1]);
			// 최고점수를 받은 학생.
			if (Integer.parseInt(temp[1]) //
					< Integer.parseInt(scores[i][1])) {
				temp = scores[i];
			}
		}
		System.out.printf("sum의 값은 %d\n", sum);
		System.out.printf("최고점 학생은 %s\n", temp[0]);

	} // end of main.

	void b() {
		String[][] scores = new String[5][2];
		scores[0] = new String[] { "홍길동", "80" };
		scores[1] = new String[] { "김민수", "85" };
		scores[2] = new String[] { "박헌수", "88" };
		scores[3] = new String[] { "심상현", "90" };
		scores[4] = new String[] { "최기동", "75" };
	}

}
