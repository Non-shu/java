package com.yedam.inheritance;

public class CastingExe {
	public static void main(String[] args) {
		// byte < short < int < long
		int n1 = 100;
		long n2 = 0;
		n1 = (int)n2; //casting
		n2 = n1;// promotion
				//object <- Friend <- ComFriend, UnivFriend
		Friend f1 = new ComFriend("","","","");		
		//ComFriend f2 = (ComFriend) new Friend("", "");
		f1 = new Friend("honggildong","0101-1212");
		System.out.println(f1.toString()	);
		if ( f1 instanceof ComFriend) {
			ComFriend f2 = (ComFriend) f1;
			System.out.println(f2.showInfo());
		}else {
			System.out.println("형변환 못함.");
		}
	}

}
