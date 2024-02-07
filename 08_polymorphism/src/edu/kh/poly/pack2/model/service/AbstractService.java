package edu.kh.poly.pack2.model.service;

import edu.kh.poly.pack2.model.dto.Animal;
import edu.kh.poly.pack2.model.dto.Dog;
import edu.kh.poly.pack2.model.dto.Snake;

public class AbstractService {
	
	
	
	/**
	 * 추상 클래스는 진짜 객체로 못만들까? Yes...
	 */
	public void method1() {
		
//		Animal a = new Animal();
		// Cannot instantiate(객체화) the type Animal
		// -> 추상 클래스 Animal을 이용해서 객체 생성 불가!
		
	}
	
	
	/**
	 * 추상 클래스를 상속 받은 클래스를 이용해 객체 생성
	 * + 다형성(업캐스팅, 동적 바인딩) + 객체 배열 
	 */
	public void method2() {
		
		/* 추상 클래스는 객체 생성은 안되지만 
		 * 부모 타입의 참조 변수 역할은 할수 있다~!
		 * 
		 * -> 동적 바인딩으로 인해 
		 * 		자식 객체 내 부모 추상 메서드가 호출될 일은 
		 * 		절대로 없습니데이 (컴파일 오류 발생 X) 
		 *  
		 *  */
		
		Animal a1 = new Dog("포유류", false);
		Animal a2 = new Snake("파충류", true);
		Animal a3 = new Dog("포유류", true);
		Animal a4 = new Snake("파충류", false);
		
		
		// 부모 타입(Animal) 객체 배열 생성
		
//		Animal[] arr = new Animal[4];
		Animal[] arr = {a1, a2, a3, a4}; // 배열 생성과 동시에 초기화
		
		
		// 향상된 for문 + 동적 바인딩 + print 구문의 특징
		
		for(Animal a : arr) {
			
			System.out.println("-------------------------------");
			
			// 아래 구문 모두 동적 바인딩 수행
			System.out.println(a.toString());
			a.eat();
			a.sleep();
		}
		
		
		
	}

}
