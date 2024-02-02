package edu.kh.oop.cls.pack2;

import edu.kh.oop.basic.Account;
import edu.kh.oop.basic.Nation;

// ClassTest1과 다른 패키지에 존재하는 클래스
public class OtherClassTestRun {

	public static void main(String[] args) {
		
		// 1. public class인 Nation과 Account class 이용해서 객체 생성
		Nation n1 = new Nation();
		Account a1 = new Account();
		// -> 문제없음. import도 잘됨
		
		// 2. (default) class인 ClassTest1 클래스 이용해 객체 생성
//		ClassTest1 c1 = new ClassTest1();
		
		// -> 다른 패키지에 존재해서 imiport 불가
		// -> (default) 접근 제한자는 다른 패키지에서 접근 불가
		
	}
	
}
