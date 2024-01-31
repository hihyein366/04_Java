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
			System.out.printf("입력 %d : ", input[i]);
			input[i] = sc.nextInt();
		}
			
		System.out.println("검색할 값 : ");
		int sea = sc.nextInt();
			
		if(true) {
		System.out.printf("인덱스 : ", sea);
		} else {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	
	}
		
		
		
	
	
	
	

}
