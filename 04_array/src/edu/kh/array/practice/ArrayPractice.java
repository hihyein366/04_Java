package edu.kh.array.practice;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1() {
		
		int sum = 0;
		int[] arr = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.print("\n 짝수 번째 인덱스 합 : " + sum);
		
	}
	
	
	public void practice2() {
		
		int sum = 0;
		int[] arr = new int[9];
		
		for(int i=8; i>=0; i--) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.println("\n 홀수 번째 인덱스 합 : " + sum);
	}
	
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int arr = sc.nextInt();
		
		int[] input = new int[arr];
		
		for (int i=0; i<input.length; i++) {
			input[i] = i+1;
			System.out.print(input[i] + " ");
		}
	}
	
	
	public void practice4() {
		
		int[] input = new int[5];
		
		for(int i=0; i<=input.length; i++) {
			System.out.printf("입력 %d : ", i);
			input[i] = sc.nextInt();
		}
			
		System.out.print("검색할 값 : ");
		int sea = sc.nextInt();
			
			for(int i=0; i<input.length; i++) {
			 
				if(input[i] == sea) {
				 System.out.println("인덱스 : " +i);
				 return;
				}
			 
			}
		 
		 // 검색할 값 배열 내 존재 X
		 // == for문 수행 중 return 구문 수행 X
		 // -> for문 다음코드가 수행.
		 System.out.println("일치하는 값 존재하지 않습니다");
		}

	
	public void practice5() {
		System.out.print("정수 : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("배열 %d번쩨 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		// 배열 요소 하나씩 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			sum += arr[i];
		}
		
		System.out.println("\n 총 합 : " + sum);
	}
		
		
	
	public void practice6() {
		
		char[] arr = new char[14];
		System.out.print("주민번호((=) -포함) : ");
		String input = sc.nextLine();
		
		for(int i=0, len = input.length(); i<len ; i++) {
			
			if(i <= 7) arr[i] = input.charAt(i);
			
			else arr[i] = '*';
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	
	public void practice7() {
		
		// while문으로 조건 맞는 수 입력될때까지 반복, ,break

		int len = 0;
		
		while(true) {
														// 3  
			System.out.print("정수 : ");
			len= sc.nextInt();
			
			// 입력 받은 정수가 3이상의 홀수이 경우 반복 종료
			if(len >= 3 && len % 2 == 1) {
				break;
			}
			
			// if문 수행 X == 3 이상이 아니거나 짝수인 경우
			System.out.println("다시 입력하세요.");
		}
		
		int[] arr = new int[len];
		
		int count = 0; // arr 배열 요소에 대입될 수
		
		for(int i=0; i<len; i++) {
			
			if(i <= len / 2) count--;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public void practice8() {
		
		int[] randoms = new int[10];
		
		String str = "";
		
		for (int i=0; i<randoms.length; i++) {
			randoms[i] = (int)(Math.random() * 10 + 1);
			str += randoms[i] + " ";
		}
		
		System.out.println("발생한 난수 : " + str);
		
		
	}

	
	
	public void practice9() {
		
		int[] randoms = new int[10];
		
		String str = "";
		
		int max = 0;
		int min = 0;
		
		for (int i=0; i<randoms.length; i++) {
			randoms[i] = (int)(Math.random() * 10 + 1);
			str += randoms[i] + " ";
			
			if(i == 0) { // 첫 반복인 경우 -> 첫번째 난수 비교 기준으로 삼음
				max = randoms[i];
				min = randoms[i];
				continue; // 다음 반복으로 이동
			}
			
			// 첫 반복 아닌 경우
			if(randoms[i] > max) max = randoms[i];
			
			if(randoms[i] < min) min = randoms[i];
			
		}
		System.out.println("발생한 난수 : " + str);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	
	public void practice10() {
		
		int[] randoms = new int[10];
		
		String str = "";
		
		// 난수 생성용 for문
		for (int i=0; i<randoms.length; i++) {
			randoms[i] = (int)(Math.random() * 10 + 1);
			
			// * 중복 검사 방법 *
			// 현재 인덱스에 대입된 난수와 같은 값이 
			// 앞쪽 인덱스에 존재하면 
			// 다시 현재 인덱스에 새로운 난수를 생성해서 대입
			// (중복 없을때까지 반복)
			
			for(int x=0; x<i; x++) {
				
				// 현재 인덱스에 저장된 값(지금 발생한 난수)
				// 앞쪽 인덱스에 저장된 값(이전에 발생한 난수)
				// 같을 경우 중복으로 판단
				if(randoms[i] == randoms[x]) {
					i--; // 바깥쪽 for문의 i 값 증가 막아서 현재 인덱스 요소에 다시 새로운 난수 대입
					break; // 중복 발견 했으니 추가 검사 필요X
				}
			}
			
		}
		
		// 출력 구문 만들기용 for문
		for (int i=0; i<randoms.length; i++) {
			str += randoms[i] + " ";
		}
		
		System.out.println("발생한 난수 : " + str);
		
		
	}
	
	
	/**
	 * [실습문제 11]
	 * 로또 번호 생성기
	 */
	public void practice11() {
		
		// 1. 크기가 6인 정수형 배열 생성
		int[] lotto = new int[6];
		
		// 2. 1~45 사이 중복없는 난수로 로또 배열 요소 초기화
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int x=0; x<i; x++) {
				if(lotto[i] == lotto[x]) {
					i--;
					break;
				}
			}
		}
		
		// 3. 오름차순 정렬(선택정렬)
//		for(int i=0; i<lotto.length-1; i++) { // 칸 지정(비교주체)
//			
//			for(int x=i+1; x < lotto.length; x++) { // 비교 대상
//				
//				if(lotto[i] > lotto[x]) { // 주체가 대상보다 크면 교체(swap)
//					int temp = lotto[i];
//					lotto[i] = lotto[x];
//					lotto[x] = temp;
//					
//				}
//			}
//			
//		}
		
		Arrays.sort(lotto); // 자바 제공. 배열 오름차순 정렬 가능
		
		
		// 결과 출력
		System.out.println(Arrays.toString(lotto));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
