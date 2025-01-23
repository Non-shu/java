package com.yedam.reference;

public class ReferenceExe2 {
	public static void main(String[] args) {
		//배열[][] => 다차원배열 
	String[][] userAry= new String[5][2];	
	userAry[0][0] = "홍길동";
	userAry[0][1] = "80";
	userAry[1][0] = "김민수";
	userAry[1][1] = "85";
	userAry[2][0] = "박현수";
	userAry[2][1] = "88";
	userAry[3][0] = "심상현";
	userAry[3][1] = "90";
	userAry[4][0] = "최기동";
	userAry[4][1] = "75";
	int sum = 0;	
	String[] temp = { "","0"};
		for(int i = 0; i<userAry.length;i++) {
			System.out.println("점수=>"+userAry[i][1]);
			// sum값 누적 
			sum = sum + Integer.parseInt(userAry[i][1]);
			// 최고점수 구하기
			if(Integer.parseInt(temp[1]) 
				< Integer.parseInt(userAry[i][1])) {
				temp=userAry[i];
			}
		}
		System.out.printf("sum의 값은 %d\n", sum);
		System.out.printf("최고점 학생은 %s\n",  temp[0]);
		
	}
	 
}


// userAry[0] = new String[] ("홍길동","80") 배열예시1
//String[][] userAry = {{"홍길동","80"},
//{"김민수","85"},
//{"박현수","88"},
//{"심상현","90"},
//{"최기동","75"}};  배열예시2