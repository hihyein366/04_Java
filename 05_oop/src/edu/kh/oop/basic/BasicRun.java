package edu.kh.oop.basic;

public class BasicRun {
	
	public static void main(String[] args) {
		
		// 국민 객체 생성
		// == 국민(Nation) 클래스의 내용대로 Heap 영역에 할당하는 것
		
		Nation n1 = new Nation();
		
		// 온점, 하위 접근 연산자 (.)
		// - 객체의 속성/기능을 접근, 호출, 실행 시키는 연산자
		
		n1.name = "김민석";
		n1.age = 35;
		n1.gender = '남';
		
		System.out.printf("이름은 %s이고, %d세, %c성입니다. \n", n1.name, n1.age, n1.gender);
		
		// Nation 객체 참조 변수 n2에
		// Heap 영역에 Nation 클래스를 이용해 생성된 객체의 주소 대입
		Nation n2 = new Nation();
		
		n2.name = "김준면";
		n2.age = 34;
		n2.gender = '남';
		
		n2.introduce();
		
		Nation n3 = new Nation();
		n3.name = "정혜인";
		n3.age = 24;
		n3.gender = '여';
		
		n3.introduce();
		
		Nation n4 = new Nation();
		n4.name = "오세훈";
		n4.age = 5;
		n4.gender = '남';
		
		n4.introduce();
		
		// 납세의 의무 확인
		n1.납세의의무();
		n2.납세의의무();
		n3.납세의의무();
		n4.납세의의무();
		
		System.out.println("객체 생성 확인");
		
	}

}
