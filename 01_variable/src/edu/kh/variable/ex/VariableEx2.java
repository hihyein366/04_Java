package edu.kh.variable.ex;

public class VariableEx2 {
	
	// main method (프로그램 실행)
	public static void main(String[] args) {
	
		/* ** 컴퓨터의 값 처리 원칙 **
		 * - 같은 자료형끼리 연산, 결과도 같은 자료형
		 * 
		 * ** 형 변환 **
		 * - 다른 자료형끼리 연산하는 경우 자료형을 맞게 변환
		 * 
		 * ** 자동 형변환 **
		 * - 연산 시 값의 범위가 작은 자료형을 큰 자료형으로 변환.
		 * 
		 */
		
		// 자동 형변환 확인1
		int num1 = 9;
		long num2 = 10_000_000_000L; // 100억
		
		// int result1 = num1 + num2;
		long result1 = num1 + num2;
		
		System.out.println("result1 : " + result1);
		
		// Type mismatch: cannot convert from long to int
		// -> int + long
		// -> long + long 자동 형변환
		// -> 결과도 long
		//		그런데 int형 변수에 long 대입하려고 해서 오류 발생
		
		
		// 자동 형변환 확인 2
		int num3 = 300;
		double num4 = 12.34;
		
		// (int)300 + (double)12.34 
	  // -> (double)300.0 + (double)12.34
		double result2 = num3 + num4;
		System.out.println("result2 : " + result2);
		
		// 자동 형변환 확인3
		long num5 = 20L;
		float num6 = 3.14f;
		
		// long + float
		// -> float + float (크기는 long이 커도 범위가 float 더 큼)
		// -> 20.0f + float = (float) 23.14f
		
		double result3 = num5 + num6;
		System.out.println("result3 : " + result3);
		
		// (참고)
		// double, float는 실수를 근사치로 표현한 자료형 -> 정확X (부동 소수점의 문제)
		
		// -> 은행이나 숫자에 민감한 프로젝트 사용 X
		
		
		
		
	}

}
