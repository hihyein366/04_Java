package edu.kh.hehe;

import java.util.Scanner;

public class hhehe {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] memberArr = {"홍길동", "김성훈", "윤웅식", "윤성우", "남궁인"};
	
		System.out.print("검색 회원 입력 : ");
		
		String searchName = sc.next();
		
		boolean result = false;
		
		for(int i=0; i < memberArr.length; i++) {
			if(memberArr[i].equals(searchName)) {
				result = true;
				break;
			}
		}
			
		if(result) {
			System.out.println("회원 존재함");
		} else {
			System.out.println("회원 안존재");
			
		}
	}

}
