package edu.kh.oop.basic;

/**
 * 계좌 클라스 보소 (계좌 클래스)
 */
public class Account {
	
	// [캡슐화]
	// - 객체의 속성(필드) 직접 접근을 제한하는 것이 원칙
	
	// - 직접 접근을 제한하기 위해서 모든 필드에 private 키워드 작성
	// (private : 현재 객체만 접근 가능한)
	
	// - 속성에 직접 접근을 할수 없으므로 대신 간접 접근 가능한 기능 작성해야 함
	
	
	// 속성(값)
	private String name; 
	private String accountNum;
	private long balance;
	private String password;
	
	
	// * 매개 변수 : 전달 받아온 값을 저장하는 변수 *
	
	// name 변수에 값을 세팅하는 간접 접근 기능
	public void setName(String inputName) {
		
		// 매개 변수 String inputName
		// -> String 타입의 데이터를 전달 받아 저장할 변수
		
		name = inputName; 
		
	}
	
	// name 변수의 값을 돌려 보내주는 간접 접근 기능
	
	// void : 반환할 값이 없다
	// <-> 반환할 값이 있을 경우 그 값의 자료형을 작성(반환형)
	public String getName() {
		return name; // Void methods cannot return a value
	}

	
	
	/* this : 현재 객체 */
	// 현재 객체가 가지고 있는 accountNum가져오겠다
	
	// accountNum 값 세팅하는 간접 접근
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;  
	}
	
	// accountNum 값을 반환하는 간접 접근 기능
	public String getAccountNum() {
		return accountNum;
	}
	
	// password 값 세팅하는 간접 접근 기능
	public void setPassword(String password) {
		this.password = password;
	}
	
	// balance 값을 반환하는 간접 접근 기능
	public long getBalance() {
		return balance;
	}
	
	
	/**
	 * 전달 받은 금액을 balance에 누적한 후 
	 * 현재 잔액을 콘솔에 출력
	 */
	public void deposit(long amount) {
		balance += amount;
		System.out.println(name + "의 현재 잔액 : " + balance);
	}
	
	
	
	
	/**
	 * 비번과 출금 금액 전달 받은 후 조건에 맞으면 잔액에서 차감 후 현재 잔액 출력
	 * 
	 * 조건 1 ) 비번 불일치 시  '비밀번호 불일치' 출력
	 * 조건 2 ) 출금할 금액이 잔액보다 크면 '잔액 부족' 출력
	 * 
	 * @params pw : 전달될 비번
	 * @params amount : 출금할 금액
	 */
	public void withdraw(String pw, long amount) {
		
		// 자바에서
		// - 기본(자료형) 비교는 ==
		// - 객체(참조형) 비교는 A.equals(B)
		
		// - 현재 계좌 비번과 전달 받은 비번 같을 경우 true. 아니면 false
		
		if(!password.equals(pw)) {
			System.out.println("비번 불일치");
			return;
		}
		
		// 출금 금액이 잔액보다 큰 경우
		if(amount > balance) {
			System.out.println("잔액 부족");
			return;
		}
		
		// 잔액 출금할 금액 만큼 차감 
		balance -= amount;
		
		System.out.printf("%s 계좌에서 %d원 출금 \n", accountNum, amount);
		System.out.println(name + "의 현재 잔액 : " + balance);
		
		
	}
	
	
}
