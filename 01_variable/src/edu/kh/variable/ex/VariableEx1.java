package edu.kh.variable.ex;

public class VariableEx1 {
	
	public static void main(String[] args) {
		
		// 변수 : 메모리에 값을 저장하기 위한 공간
		//				이때, 저장되는 값이 변할수 있어 변수
		
		// 자료형(data type)
		// 변수 또는 값의 크기와 형식
		
		/* 자바 기본 자료형(Java Primitive Types) !!!외우세요 * 
		 * 
		 * [논리형]
		 * boolean (1byte) - true / false
		 * 
		 * [정수형]
		 * byte (1byte)
		 * short (2byte)
		 * int (4byte)   * 정수 기본형 *
		 * long (8byte)  - 숫자 뒤에 L 붙여라
		 * 
		 * [실수형]
		 * float (4byte) - 숫자 뒤에 f
		 * double (8byte)  * 실수 기본형 *
		 * 
		 * [문자형]
		 * char (2byte) - 문자 하나, 문자 양옆에 ''
		 * 
		 */
		
		// 변수 선언 : 메모리에 공간 할당
		boolean isTrue; // 메모리에 boolean 저장 공간 1byte 할당, isTrue라고 부르겠다.
		
		double number1; // double 8byte. 
		
		
		// 값 대입 : 변수에 값 집어 넣는 것
		//					(이미 값이 있는 변수에 대입하면 --> 덮어쓰기)
		isTrue = true;
		System.out.println("isTrue : " + isTrue);
		
		isTrue = false;
		System.out.println("isTrue : " + isTrue);
		
		// 변수 선언 + 초기화 + 값의 범위 확인
		int number2 = 2100000000;  // 21억 오류 X,
		long number3 = 2200000000L;  // int 22억은 오류 O,
		// int 범위 초과. -> int 보다 범위 큰 자료형으로 변경
		// long number3 = 2200000000L; 오류 해결
		
		// 'L' 같은 리터럴 표기법은 컴이 자료형 구분 위한 기호일뿐. 출력시 안보임
		
		System.out.println("number2 : " + number2);
		System.out.println("number3 : " + number3);
		
		/* 다른 리터럴 표기법 확인 */
		char temp1 = '가';
		float temp2 = 1.23f;
		
		// float temp2 = 1.23; (숫자 뒤 f 안붙였을때)
		// Type mismatch: cannot convert from double to float
		
		double temp3 = 3.12;
		
		// -------------------------------------------------------------
		
		/* String (문자열) 
		 * - 기본 자료형이 아닌 객체
		 * - String을 저장하는 변수는 객체 대신 주소를 저장하기 때무네
		 *   "참조형" 이라고 한다
		 *   
		 * (저장된 주소에 위치한 객체를 참조)
		 * 
		 * 
		 * - String의 리터럴 표기법 : 쌍따옴표("")
		 * 
		 */
		
		String str1 = "쌍따옴표가 String 리터럴 표기법이다";
		
		
	}

}
