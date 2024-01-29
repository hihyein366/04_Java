package edu.kh.javatest;

// 한 줄 주석
/* 범위 주석 */


public class JavaTest {

	// class : - 자바 코드를 작성하는 영역
	// 				 - 객체의 내용(속성, 기능)을 정의함
	// 				   (JS의 생성자 함수와 비슷한 형태)
	
	
	// alt + shift + j : class/method 설명용 주석 (html 방식으로 작성)
	
	/** main 메서드 
	 * <p>
	 * 자바 프로그램을 실행 시키기 위해서 반드시 필요한 구문(기능)
	 * </p>
	 * @param args
	 */
	public static void main(String[] args) {
		
		// java 실행 방법
		// 1) 위에 run 버튼
		// 2) 실행 단축키 : ctrl + F11
		
		
		
		// System.out.println();
		// -> () 안의 문자열. 콘솔에 출력 후 줄바꿈하는 기능
		
		System.out.println("Hello World");
		
		System.out.println("Java는 코드 끝에 꼭 세미콜론; 있어야함");
		
		System.out.println("println() 구문 자동와성은 sysout -> ctrl + space ");
		
		System.out.println(100 + 200); // 숫자 연산 가능
		
		System.out.println(100 + 30 + "입니다"); // 이어쓰기
		
		// 사칙연산 우선순위 적용
		// 먼저 연산하고 싶으면 소괄호로 묶가ㅣ
		System.out.println("합계 : " + (2222+3333)+" 원");
		
		
	}
}
