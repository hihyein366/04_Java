package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<String>();
		
		while(true) {
			System.out.print("추가할 이름 입력 : ");
			String name = sc.next();
			
			if(name.equals("exit")) {
				System.out.println("<<입력 종료>>");
				for(String namee : nameList) {
					System.out.println(namee);
				}
				break;
			}
			
			if(name.equals("clear")) {
				System.out.println("이름 목록 초기화 함");
				nameList.clear();
			}
			
			if(nameList.contains(name)) {
				System.out.println("<이미 존재하는 이름임>");
				break;
			} else if (!name.equals("clear")) {
					
				nameList.add(name);
				System.out.println(name + " 추가 완료.");
				
			}
			
			
		}
		
	}

}
