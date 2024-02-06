package edu.kh.hehe;

import java.util.Scanner;

public class hhehe {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("2~9 사이 입력 : ");
			
			int input = sc.nextInt();
			
			if(input >= 2 && input <= 9) {
				for(int num=1; num<=9; num++) {
					System.out.printf("%d * %d = %d\n", input, num, input*num);
				}
				break;
			} else {
				System.out.println("2이상 9이하");
			}
		}
	}

}
