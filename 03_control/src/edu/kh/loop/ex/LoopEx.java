package edu.kh.loop.ex;

import java.util.Scanner;

public class LoopEx {
	
	// 필드 (객체의 속성 == 객체의 변수)
	Scanner sc = new Scanner(System.in);
	
	
	/**
	 * 1~10 출력하기
	 */
	public void method1() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	
	/**
	 * 첫 번째 입력 받은 수 부터
	 * 두 번째 입력 받은 수 까지
	 * 1씩 증가하며 출력하기
	 */
	public void method2() {
		System.out.print("첫, 둘 입력 : ");
		int input1 = sc.nextInt();		// 첫 입력
		int input2 = sc.nextInt();		// 둘 입력
		
		for(int i=input1; i<=input2; i++) {
			System.out.println(i);
		}
	}
	
	/**
	 * 10부터 1까지 1씩 감소하며 출력 
	 */
	public void method3() {
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
	}
	
	/**
	 * 두 수를 입력 받아서 반복 출력하는 구문 작성
	 * (첫 입력 A, 둘 입력 B)
	 * 조건1) B가 A보다 큰 경우 -> A~B 까지 1씩 증가하며 출력
	 * 조건2) A가 B보다 큰 경우 -> A~B 까지 1씩 감소하며 출력
	 * 조건3) A, B 같으면 -> 같은 수 입력됨
	 */
	public void method4() {
		
		System.out.print("첫 입력 : ");
		int A = sc.nextInt();
		
		System.out.print("둘 입력 : ");
		int B = sc.nextInt();
		
		if(A == B) {
			System.out.println("같은 수 입력됐어");
			return;
		}
		
		// 예외의 상황. if문으로 따로 빼줌.
		
		
		if(A > B) {
			for(int i=A; i>=B; i--) {
				System.out.println(i);
			}
		}	else {
				for(int i=A; i<=B; i++) {
					System.out.println(i);
			}
		}
		
	}
	
	/**
	 * 두 수를 입력 받아 1씩 증가하며 반복 출력
	 * 첫 A, 둘 B
	 * 
	 * - 입력 받은 두 수 중 작은 값이 초기식, 큰 값이 조건식에 사용되게
	 * - 같은 경우는 초기식 A, 조건식 B
	 */
	public void method5() {
		System.out.print("첫 : ");
		int A = sc.nextInt();
		
		System.out.print("둘 : ");
		int B = sc.nextInt();
		
		if (A==B) {
			for(int i=A; i<=B; i++) {
				System.out.println(i);
			}
		}
		
		if (A>B) {
			for(int i=B; i<=A; i++) {
						System.out.println(i);
			}

		} else {
			for(int i=A; i<=B; i++) {
				System.out.println(i);
			}
		}
		
	}
	
	public void method5a() {
		System.out.print("입력 1 2 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min;
		int max;
		
		if(a <= b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		
		for(int i = min; i<=max; i++ ) {
			System.out.println(i);
		}
		
	}
	
	
	/**
	 * 최대, 최소값 구하기 (Math)
	 * - Java API 이용한 방법
	 */
	public void method5b() {
		System.out.print("입력 1 2 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min = Math.min(a, b); // 두 수중 작은 값 반환
		int max = Math.max(a, b); // 두 수중 큰 값 반환
		
		for(int i=min; i<=max; i++) System.out.println(i);
	}
	
	
	/**
	 * 변수 값 교환(swap)
	 */
	public void method5c() {
		System.out.print("입력 1 2 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			int temp = a; // temp 같이 빈 상자 만들어줘. 그래야 교환 가능
			a = b;
			b = temp;
		}
		
		
		for(int i=a; i<=b; i++) System.out.println(i);
	}
	
	/**
	 * 1~100 사이 7의 배수 개수 세기
	 */
	public void method6() {
			int count = 0;
			
			for(int i = 1; i<=100; i++) {
				if(i % 7 == 0) count++;
			} System.out.println(count);

		
	}
	
	public void method6a() {
		int count = 0;
		for(int i = 7; i<=100; i+=7) count++;
		System.out.println(count);
	}
	
	
	/**
	 * 1~100 사이 정수 중 3의 배수의 개수.
	 * 3의 배수를 제외한 수들의 입력
	 */
	public void method7() {
		int count = 0;
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				count++;
			} else {
				sum += i;
			}
			System.out.println("count : " + count);
			System.out.println("sum : " + sum);
		}
		
	}
	
	
	/**
	 * 구구단 5단 출력
	 * 5 x 1 = 5
	 * ...
	 * 5 x 9 = 45
	 */
	
	public void method8() {
		int result;
		
		for (int i = 1; i<=9; i++) {
			result = (5*i);
			System.out.printf("5 x %d = %2d \n", i, result); // %2d로 자리 두자릿수로 만들어 오른정렬
		}
		
	}
	
	

}
