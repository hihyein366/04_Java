package edu.kh.inheritance.model.dto;

// Object 클래스
// - 모든 클래스의 최상위 부모
// - class 선언부에 상속 구문이 하나도 작성되지 않으면
// 	 컴파일러가 extends Object 구문을 추가해준다

public class Parent /* extends Object */ {
	
	
	
	public String lastName = "정";
	protected String address = "서울시 중구 남대문로 120";
	
	private int money = 100000_000; // 1억. 언더바는 자릿수 구분으로 넣은거 상관 없
	private String car = "그랜져";
	
	// 기본 생성자
	public Parent() {
		System.out.println("기본 생성자로 부모 객체 생성");
	}
	
	// 매개 변수 생성자
	public Parent(String lastName, String address, int money, String car) {
		this.lastName = lastName;
		this.address = address;
		this.money = money;
		this.car = car;
		
		System.out.println("매개변수 생성자로 부모 객체 생성됨");
	}
	
	
	// money의 getter/setter
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getCar() {
		return car;
	}
	
	public void setCar(String car) {
		this.car = car;
	}
	
	
	// 현재 객체의 필드를 문자열로 반환하는 메서드
	public String inform() {
		return String.format("%s / %s / %d / %s", lastName, address, money, car);
	}
	
	
	// 공통된 규약(코드) 추가/수정
	public void testMethod() {
		System.out.println("부모에게 메서드 추가함");
	}
	
	
	/* Overriding (오버라이딩) : 
	 * 부모 메서드 위에 자식 메서드가 올라탐
	 * == 부모 메서드를 자식이 덮어 씌움
	 * == 재정의
	 *  */
	
	// Over : 위에 있다, 넘어서다
	// ride : 타다
	// + super 참조 변수 확인하기
	
	public String introduce() {
		return "Parent 입니다람쥐";
	}
	
	
	
	// 반환형 클래스명.메서드명()
	
	// String Object.toString()
	// - 객체의 필드를 문자열로 표현하기 위해서 사용하는 메서드
	// - Object에 정의된 toString()을 오버라이딩해서 사용
	
	
	@Override
	public String toString() {
		return String.format("Parent.toString() : %s / %s / %d / %s", lastName, address, money, car);
	}
	
	
	

	

}
