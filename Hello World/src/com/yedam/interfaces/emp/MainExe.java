package com.yedam.interfaces.emp;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 사원관리 App v.1
 * 실행클래스 : MainExe
 * 인터페이스  활용. (배열, 컬렉숀)
 * Employee, EmpAryExe,EmpListExe,EmpDAO(인터페이쑤)
 */
public class MainExe {

	static Scanner scn = new Scanner(System.in);
	// 배열, 컬렉션.
	static EmpDAO dao = new EmpAryExe();
	
	public static void main(String[] args) {
		// 스캐너,run,
		boolean run = true;

		
		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 9.종료");
			System.out.print("선택하세용>> ");
			int menu = 0;
			try {
				menu = scn.nextInt();				
			} catch (InputMismatchException e) {
				System.out.println("메뉴를 확인하세요.");
				System.out.print("선택하세용>> ");
				scn.nextLine();
				continue;
			}
			scn.nextLine();
			
			switch (menu) {
			case 1:// 추가, 사원번호, 이름, 전화번호, 입사일자, 급여 등등
				
				int empNo = 0;
				while(true) {
				try {
					System.out.print("사원번호>> ");
					empNo = Integer.parseInt(scn.nextLine());	
					break; //정상값이면 종료 입력하면 while 종료
				} catch (NumberFormatException e) {
					System.out.println("사원번호를 확인하세요.");				
				}
				}//end of while
				System.out.print("이름>> ");
				String eName = scn.nextLine();
				System.out.print("전화번호>> ");
				String tel = scn.nextLine();

				if (dao.registerEmp(new Employee(empNo, eName, tel))) {
					System.out.println("등록성공!");
				}
				break; // case 1 end
			case 2: // 수정항목 : 전화번호, 입사일자, 급여. + 사원번호
				System.out.print("사원번호>> ");
				empNo = Integer.parseInt(scn.nextLine());
				System.out.print("전화번호>> ");
				tel = scn.nextLine();
				System.out.print("입사일자>> ");

				String hdate = scn.nextLine();
				if (hdate.equals("")) {
					hdate = "1900-01-01"; // 엔터치고 넘어가면 . . (1900년생으로 만들어주마 ㅋㅋ)
				}
				System.out.print("급여>> ");
				String salString = scn.nextLine();
				if (salString.equals("")) {// enter 넘어가면 0 인식 .
					salString = "0";
				}
				int sal = Integer.parseInt(salString);// "10" -> 10,/ "" -> ?

				if (dao.modifyEmp(new Employee(empNo, "", tel, hdate, sal))) {
					System.out.println("수정완료!");
				}
				break; // case 2 end
			case 3: // 삭제. 사원번호.
				try {
				remove();
				} catch (NumberFormatException e) {
					System.out.println("사원번호를 확인하세요");
				}
				break; // case 3 end

			case 4: // 조회
//				 조회조건(급여 이상)
//				System.out.print("조회 급여조건>> ");
//				sal = Integer.parseInt(scn.nextLine());
				//추가로 조회 이름조건++ 
				System.out.print("조회 이름조건>> ");
			    eName = scn.nextLine();
				
				Employee emp = new Employee();
				emp.setEmpName(eName);// empName 필드에 값을 저장.
//				emp.setSalary(sal);
				// 조회결과.
				Employee[] result = dao.search(emp);
				// 출력
				System.out.println("사 번  이 름    연락처   급 여");
				System.out.println("--------------------------");
				for (Employee empl : result) {
					if (empl != null) {
						System.out.println(empl.empInfo());
					}
				}
				break;

			case 9: // 종료
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
			}// end of switch


		} // end of while
			System.out.println("end of prog.");

	}// end of main.
	//예외 떠넘기기 예제
	static void remove() throws NumberFormatException {
		System.out.print("사원번호>> ");		
		int empNo = Integer.parseInt(scn.nextLine());

		if (dao.removeEmp(empNo)) {
			System.out.println("삭제완료!");
		}
	}// end of remove
}// end of class.
