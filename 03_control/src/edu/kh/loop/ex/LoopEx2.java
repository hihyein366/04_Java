package edu.kh.loop.ex;

import java.util.Scanner;

/**
 * 중첩 반복문
 */
public class LoopEx2 {
	
	Scanner sc = new Scanner(System.in);
	
	/** <pre>
	 * 다음 모양 출력
	 * 1234
	 * 1234
	 * 1234
	 * </pre>
	 */
	public void method1() {
		for(int x=1; x<=3; x++) {
			for(int i=1; i<=4; i++) {
				System.out.print(i);
			}
			System.out.println(); // 줄바꿈
		}
		
	}

	/** <pre>
	 * 다음 모양 출력하기
	 * 4321
	 * 4321
	 * </pre>
	 */
	public void method2() {
		for(int x=1; x<=2; x++) {
			for(int i=4; i>=1; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	/** <pre>
	 * 다음 모양 출력하기
	 * (0,0) (0,1) (0,2)
	 * (1,0) (1,1) (1,2)
	 * (2,0) (2,1) (2,2)
	 * </pre>
	 */
	public void method3() {
		for (int row=0; row<=2; row++) {
			for(int col=0; col<=2; col++) {
				System.out.printf("(%d,%d) ", row, col);
			}
			System.out.println();
		}
		
	}
		
	
	/** <pre>
	 * 다음 모양 출력하기
	 * (2,2) (2,1) (2,0)
	 * (1,2) (1,1) (1,0)
	 * (0,2) (0,1) (0,0)
	 * </pre>
	 */
	public void method4() {
		for (int row=2; row>=0; row--) {
			for (int col=2; col>=0; col--) {
				System.out.printf("(%d,%d) ", row, col);
			}
			System.out.println();
		}
	}
	
	
	/**
	 * 2~9단 모두 출력
	 * 2x1=2 2x2=4 2x3=6 ... 2x9=18 
	 * 3x1=3 3x2=6 3x3=9 ... 3x9=27
	 * ...
	 * 9x1=9 9x2=18 ... 9x9=81
	 */
	public void method5() {
		
		for (int dan=2; dan<=9; dan++) {
			for (int i=1; i<=9; i++) {
				System.out.printf("%dx%d=%2d ", dan, i, dan*i);
			}
			System.out.println();
		}
		
	}
	
	
	/** <pre>
	 * 입력 받은 단 부터 9단까지 구구단 출력
	 * 단, 입력 값이 2~9 사이 아니면 '잘못 입력' 출력
	 * 
	 * ===== 7단 =====
	 * 7 x 1 =  7
	 * 7 x 2 = 14
	 * ...
	 * 7 x 9 = 63
	 * 
	 * ===== 8단 =====
	 * ...
	 * 
	 * 
	 * ===== 9단 =====
	 * </pre>
	 */
	
	public void method6() {
		System.out.print("단을 입력(2~9사이) : ");
		int dan = sc.nextInt();
		
		if(dan<2 || dan>9) {
			System.out.println("잘못 입력");
			return;
		}
		
		for(int i=dan; i<=9; i++) {
			System.out.printf("===== %d단 ===== \n", i);
			for(int x=1; x<=9; x++) {
				System.out.printf("%d x %d = %2d \n", i, x, i*x);
			}
			System.out.println();
		}
	}
		
	
	/** <pre>
	 * 1 2 3
	 * 4 5 6
	 * 7 8 9
	 * </pre>
	 */
	public void method7() {
		int count = 1;
		
		for (int i=0; i<=2; i++) {
			for (int x=1; x<=3; x++) {
				System.out.print(count++ + " "); 
			}
			System.out.println();
		}
	}
	
	
	/** <pre>
	  ****
	  ****
	  ****
	  ****

	 * </pre>
	 */
	public void method8() {
		
		for(int i=1; i<=4; i++) {
			for(int x=1; x<=4; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	/** <pre>
	 * *
	 * **
	 * ***
	 * ****
	 * </pre>
	 */
	public void method9() {
		for(int i=1; i<=4; i++) {
			for(int x=1; x<=i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/** <pre>
	 * ****
	 * ***
	 * **
	 * *
	 * </pre>
	 */
	public void method10() {
		for(int i=4; i>=1; i--) {
			for(int x=1; x<=i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
		









}