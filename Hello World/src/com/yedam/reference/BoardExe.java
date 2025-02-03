package com.yedam.reference;

import java.io.WriteAbortedException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* 실행클래스.
* 1. 글목록 2. 글등록 3. 삭제 9.종료
*/
public class BoardExe {
	static Board[] boardRepo = new Board[100]; // 게시글 등록 배열,
	static Scanner scn = new Scanner(System.in);
	static String loginId;

	public static void initData() throws ParseException {
		// 배열의 샘플데이터.
		// 1페이지 : 0-4, 2페이지: 5-9, 3페이지 : 10 - 14
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		boardRepo[0] = new Board("게시글 제목1", "내용입니다1", "user01", sdf.parse("2025-01-27"));
		boardRepo[1] = new Board("게시글 제목2", "내용입니다2", "user02", sdf.parse("2025-01-29"));
		boardRepo[2] = new Board("게시글 제목3", "내용입니다3", "user03", sdf.parse("2025-01-31"));
		boardRepo[3] = new Board("게시글 제목4", "내용입니다4", "user04", sdf.parse("2025-01-31"));
		boardRepo[4] = new Board("게시글 제목5", "내용입니다5", "user05", sdf.parse("2025-01-31"));

		boardRepo[5] = new Board("게시글 제목8", "내용입니다6", "user01", sdf.parse("2025-01-31"));
		boardRepo[6] = new Board("게시글 제목6", "내용입니다7", "user01", sdf.parse("2025-01-31"));
		boardRepo[7] = new Board("게시글 제목7", "내용입니다8", "user01", sdf.parse("2025-01-31"));
		boardRepo[8] = new Board("게시글 제목9", "내용입니다9", "user01", sdf.parse("2025-01-31"));
		boardRepo[9] = new Board("게시글 제목10", "내용입니다10", "user01", sdf.parse("2025-01-31"));

		boardRepo[10] = new Board("게시글 제목11", "내용입니다11", "user01", sdf.parse("2025-01-31"));
		boardRepo[11] = new Board("게시글 제목12", "내용입니다12", "user01", sdf.parse("2025-01-31"));
		boardRepo[12] = new Board("게시글 제목13", "내용입니다13", "user01", sdf.parse("2025-01-31"));

	}

	public static void boardList() {
		// 글 목록. 1p 0-4 2p 5-9 3p 10- 14
		int page = 1;
		int lastPage = (int) Math.ceil(getMaxCount() / 5.0);

		while (true) {
			int endCnt = page * 5;
			int startCnt = endCnt - 5;
			int loopCnt = 0;
			System.out.println("글번호  제목     내용    작성자   작성일시");
			System.out.println("-------------------------------------");
			for (int i = 0; i < boardRepo.length; i++) {
				if (boardRepo[i] != null) {
					loopCnt++;
					if (loopCnt > startCnt && loopCnt <= endCnt) {
						System.out.println(loopCnt + " " + boardRepo[i].showBoard());
					}
				}

//		int firstIdx = (page - 1)* 5;
//		int lastIdx = (page*5) -1;
//		for(int i = firstIdx; i<= lastIdx; i++) {
//			if(boardRepo[i] != null) {
//				System.out.println(boardRepo[i].showBoard());
//			} 
			} // 5건씩 출력이 되도록.
			System.out.println("이전페이지:p, 다음페이지:n, 종료: q ");
			String paging = scn.nextLine();
			if (paging.equals("n")) {
				// 마지막페이지보다는 작은 값.
				if (page < lastPage) {
					page++;
				}
			} else if (paging.equals("p")) {
				// 1보다 큰 페이지.
				if (page > 1) {
					page--;
				}
			} else if (paging.equals("q")) {
				return;
			}
		}
	}// end of boardList().
		// 배열의 매개값으로 전달하면 건수가몇건 변환 메소드

	public static int getMaxCount() {
		int count = 0; // 전체진수.
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null) {
				count = i++;
			}
		}
		return count;
	}

	public static void addBoard() {
		// 글 등록.
		// 제목:5글자 이상 ~ 15글자 이하 . 콘솔출력 ( "등록할 수 없습니다.");
		// 똑같은 제목이 있으면 콘솔출력 ("이미 등록된 제목입니다.");
		int min = 4;
		int max = 16;
		System.out.print("제목을 입력하세요 >> ");
		String title = scn.nextLine();
		System.out.print("내용을 입력하세요 >> ");
		String content = scn.nextLine();
		if (title.length() > min || title.length() < max) {
//		System.out.print("작성자를 입력하세요 >> ");
//		String writer = scn.nextLine();
//		System.out.print("작성일자를 입력하세요 >> ");
//		String writeDate = scn.nextLine();
			// 배열의 빈 공간에 등록.
			for (int i = 0; i < boardRepo.length; i++) {

				if (boardRepo[i] == null) {
					for (int j = 0; j < boardRepo.length; j++) {
						if (boardRepo[j].getTitle().equals(title)) {							
							System.out.println("이미 등록된 제목입니다.");
							return;
						}
					}
					boardRepo[i] = new Board(title, content, loginId, new Date());
					System.out.println("등록완료");
					break; // 한건만 등록
				}
			}
		} else {
			System.out.println("등록할 수 없습니다.");
		}

	}// end of addBoard

	public static void removeBoard() {
		// 글 삭제. 글제목입력 -> 삭제는 null 대입하면 삭제.
		System.out.print("제목을 입력하세요 >> ");
		String title = scn.nextLine();
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null && boardRepo[i].getTitle().equals(title)) {
				boardRepo[i] = null;
				System.out.println("삭제완료");
				break;
			}
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////main///////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// MemberExe getInstance()
		while (true) {
			// id. pw 일치하면 글목록기능 사용.
			System.out.print("ID를 입력하세요>> ");
			String id = scn.nextLine();
			System.out.print("PW를 입력하세요>> ");
			String pw = scn.nextLine();

			String name = MemberExe.login(id, pw);

			if (name != null) {
				// 환영문.
				loginId = id;
				System.out.println(name + "님, 환영합니다. ");
				break;// while 반복 종료.
			} else {
				System.out.println("ID와 PW을 확인하세요");
			}
		}

		boolean run = true;
		try {
			initData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		while (run) {
			System.out.println("1.글목록 2.글등록 3.삭제 9.종료");
			System.out.print("선택 >> ");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // 목록
				boardList();
				break;
			case 2: // 등록
				addBoard();
				break;
			case 3: // 삭제
				removeBoard();
				break;
			case 9: // 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default: // 1,2,3,9 외의 경우
				System.out.println("메뉴를 확인하세요.");
			}
		} // end of while
		System.out.println("end of prog");
	}// end of main

}// end of class
