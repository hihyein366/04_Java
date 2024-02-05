package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {
	
	// 필드
	Scanner sc = new Scanner(System.in);

	/* 배열 (자료구조)
	 * 
	 * - Java 에서의 배열
	 *  -> 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 *  
	 * - 생성된 배열의 요소는 index를 이용해서 구분
	 * 
	 * - 생성된 배열을 활용하기 위해서는 배열을 참조하는 '참조형 변수' 이용
	 * 
	 * [참조형 변수]
	 * - 주소를 저장하는 변수
	 * 
	 * - 변수 사용 시 저장된 주소로 찾아가서 그곳에 위치한 배열, 객체를 참조함
	 * 
	 * - 기본 자료형 8개를 제외한 나머지는 모두 참조형 변수이다
	 * 
	 */
	
	
	/**
	 * 배열 선언, 할당, 초기화
	 */
	public void method1() {
		
		// 변수 선언
		int num; // stack 영역에 int 자료형 저장할 수 있는 변수 생성. 이름 num 으로 지정.
		
		// 배열 선언
		int[] arr; // stack 영역에 int[] 자료형을 참조할 변수 생성 후 (주소만 저장) 이름 arr로 지정
		
		// 배열 할당
		arr = new int[4]; // Heap 영역에 int 4개짜리 배열 할당 후 생성된 배열 주소 arr에 대입
		// -> arr 이용해서 배열 참고 가능!
		
		// 배열 초기화
		
		// 1) 초기화 전 -> 0이 대입되어 있는지 확인
		System.out.println("초기화 전");
		
		// * debug : 프로그램 수행 중 특정 시점에 어떤 값을 지니고 있나 확인하는 것
		//					-> 코드 상태, 오류 분석 할 수 있음
		
		// 2) 인덱스를 이용한 초기화
		arr[0] = 100;
		arr[1] = 2000;
		arr[2] = 9;
		arr[3] = 8898;
		
		System.out.println("초기화 후");
		
		/* [이클립스 디버그 모드 사용법]
		 * 
		 * 1) 확인하고 싶은 코드 다음 줄에 break point 추가
		 * 
		 * 2) 디버그 모드로 실행(단축 F11)
		 * 
		 * 3) 디버그 화면으로 switch
		 * 
		 * 4) resume(F8키) 눌러가며 순서대로 확인
		 * 
		 */
		
	}
	
	
	/**
	 * 정수 4개를 입력 받아
	 * 배열에 차례대로 대입 후
	 * 결과를 디버그 모드로 확인
	 */
	public void method2() {
		
		// 배열 선언 + 할당
		
		int[] arr = new int[4]; // 참조형 변수
		
		// i = 0, 1, 2, 3
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(i + "번째 인덱스 : ");
			
			arr[i] = sc.nextInt(); // i번째 인덱스 요소에 입력값 대입
			
			
		} 
		// 해당 구문 수행 전 break point 작성해서 멈춤
		System.out.println("결과 확인");
	}
	
	
	/**
	 * 배열 선언과 동시에 초기화
	 */
	public void method3() {
		
		// 과목이 작성되어 있는 배열 생성
		String[] subjects = {"java", "HTML", "CSS", "JavaScript"};
		
		// subjects 변수가 참조하는 배열에 있는 모든 요소의 값을 역순으로 출력
		
		for(int i=3; i>=0; i--) {
			System.out.printf("subjects[%d] : %s \n", i, subjects[i]);
		}
		
	}
	
	
	/**
	 * 길이를 입력 받아 입력 받은 길이 만큼의 배열 생성(할당) 한 후
	 * 모든 인덱스 요소에 0부터 배열 길이 미만의 난수를 대입
	 */
	public void method4() {
		
		// 길이를 입력 받아
		System.out.print("배열 길이 : ");
		int len = sc.nextInt();
		
		// 입력 받은 길이 만큼의 배열 생성(할당) 한 후
		int[] randoms = new int[len];
		
		// 모든 인덱스 요소에 0부터 배열 길이 미만의 난수를 대입
		// randoms.length == len
		for(int i=0; i<randoms.length; i++) {
			
			randoms[i] = (int)(Math.random() * len); // double을 int로 강제 형변환. 데이터 손실 이용한 소수점 제거
		}
		
		// Arrays.toString(배열참조변수)
		// -> 배열에 모든 요소를[a,b,c] 형태 문자열로 반환
		System.out.println(randoms); // 주소 비스무리한거
		System.out.println(Arrays.toString(randoms));
		
		
	}
	
	
}
