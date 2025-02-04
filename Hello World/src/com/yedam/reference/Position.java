package com.yedam.reference;

import java.util.Scanner;

public class Position {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String[] seats = new String[16];
		for (int i = 0; i < seats.length; i++) {
			seats[i] = "(" + (i + 1) + ")"; // "●";
		}
		int num = -1;
		while (true) {
			System.out.println("====================");
			for (int i = 0; i < seats.length; i++) {
				if (seats[i] == "0") {
					System.out.printf("%4s", "(●)");
				} else {
					System.out.printf("%4s", seats[i]);
				}
				if (i % 4 == 3) {
					System.out.println();
				}
			}
			System.out.print("\n번호입력>>");
			num = Integer.parseInt(scn.nextLine());
			seats[num - 1] = "0";
		}
	}
}
