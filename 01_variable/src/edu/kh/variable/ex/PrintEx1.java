package edu.kh.variable.ex;

public class PrintEx1 {
	
	public static void main(String[] args) {
		
		/* System.out == (eclipse 기준) console창
		 * 
		 * System.out.print();
		 * - () 내의 값을 출력 (출력 후 줄바꿈X)
		 * 
		 * System.out.println();
		 * - () 내의 값을 한 줄로 출력 (출력 후 줄바꿈 O)
		 * 
		 * System.out.printf("", 변수 또는 값);
		 * - 정해진 형식(패턴)에 맞게 문자열을 출력하는 구문
		 * 
		 * - 첫번째 매개변수 ""
		 *  -- 패턴이 적용된 문자열을 작성
		 *  -- 패턴 종류
		 *  
		 *  %d : 정수(byte, short, int, long)
		 *  %c : 문자(char)
		 *  %s : 문자열(String)
		 *  %b : 논리형(boolean)
		 *  %f : 실수형(float/double)
		 *  
		 *  양수 : 오른쪽 정렬
		 *  음수(-) : 왼쪽 정렬
		 *  %숫자d : 정수가 출력된 칸 숫자 만큼 확보
		 *  
		 *  %.숫자f : 소수점 아래 몇째 자리 까지 표시할지 지정
		 *  
		 *  - 두번째 매개 변수
		 *   -- 첫번째 매개 변수 문자열 중 패턴에 들어감 변수 or 값을 순서대로 작성
		 *  
		 * 
		 */
		
		System.out.print("이름 : ");
		System.out.print("정혜인 ");
		System.out.println("이다.");
		System.out.println("오늘 자바공부");
		
		System.out.println(); // 줄만 바꿈
		
		String name = "김준면";
		int age = 31;
		double height = 172.46;
		char gender = '남';
		boolean javaStudy = true;
		
		System.out.printf("%s은 %d세 %c성으로 키는 %.1fcm이고, 자바 공부 여부 : %b",
																					name, age, gender, height, javaStudy);
		
		System.out.println("\n-----------------------------------------------------");
		
		// 20240125  도경수        10000원 입금
		// 20240125  변백현       120000원 출금
		// 20240125  엑소콘서트   120000원 출금
		
		// \n == 개행 문자(줄바꿈)
		System.out.printf("%8s  %-6s   %7d원 %s \n",
											"20240125", "도경수", 10000, "입금"); 
		
		System.out.printf("%8s  %-6s   %7d원 %s \n",
											"20240126", "변백현", 120000, "출금"); 
		
		System.out.printf("%8s  %-6s   %7d원 %s \n",
											"20240127", "엑소콘서트", 120000, "출금"); 
		
		
		
		
		
		
		
		
		
		
	}

}
