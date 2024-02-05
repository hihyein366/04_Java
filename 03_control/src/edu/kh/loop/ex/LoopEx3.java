package edu.kh.loop.ex;

import java.util.Scanner;

public class LoopEx3 {
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 문자열 한글자씩 출력하기 
	 */
	public void method1() {
		
		// 문자열.charAt(인덱스) : 인덱스번째 문자 하나 얻어와 반환
		// 문자열.length() : 문자열의 길이(method)
		
		String str = "Hello World!!!";
		
	//	int length = str.length(); // 미리 문자열 길이 카운트해서 저장.
															 // str.length() 구문 재호출 필요 없어져서 속도업.
		
		// 초기식, 증감식은 여러개 선언 가능
		for(int i=0, length=str.length() ; i<length; i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	
	// while(조건식) : 끝이 확실하지 않은 반복에 사용.
	
	
	/**
	 * -1이 입력될 때까지 정수를 계속 입력 받아
	 * 입력 받은 수 합계 구하기
	 */
	public void method2() {
		
		int input = 0; // 입력 값 저장
		
		int sum = 0; // 합계 누적용
		
		while(input != -1) { // 입력값 -1 아닌 동안. (-1이면 멈춤)
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			if(input != -1) sum += input; // -1 입력 경우 제외
			
		}
		
		System.out.println("합계 : " + sum);
	}
	
	
	// do ~ while문
	// - 조건식이 뒤에 작성된 while문
	// - 최소 1회 이상의 반복 보장
	
	/**
	 * 0이 입력될 때 까지 정수 계속 입력받고 0입력 시 누적 합계 출력
	 */
	public void method3() {
		int input = 0;
		int sum = 0;
		
		do {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			sum += input;
		} while(input != 0);
		
		System.out.println("합계 : " + sum);
		
	}
	
	/**
	 * 0 입력까지 정수 계속 입력받고
	 * 0 입력 시 누적된 합계 출력
	 */
	public void method4() {
		
		int sum = 0;
		int input = 0;
		
		while(true) {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			if(input == 0) break;
			
			sum+= input;
			
		}
		
		// Unreachable code : 도달할 수 없는 코드
		// == dead code(죽은 코드)
		System.out.println("합계 : " + sum);
		
	}
	
	

}
