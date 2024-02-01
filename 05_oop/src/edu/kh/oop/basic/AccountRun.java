package edu.kh.oop.basic;

public class AccountRun {
	
	public static void main(String[] args) {
		
		// Account 객체 생성
		Account a1 = new Account();
		
		// private이 설정된 값과 안된 값 접근 가능 여부 확인
		// is not visibal 오류뜸. 외부에서 보이지X(정보 은닉)
		
//		a1.accountNum = "1234";
//		a1.name = "홍길동";
//		a1.balance;
//		a1.password;
		
		
		// 간접 접근 기능을 이용해서 값을 세팅
		a1.setName("김종인");
		
		
		// 간접 접근 기능을 이용해서 객체의 속성을 얻어와 출력
		String name1 = a1.getName();
		System.out.println(name1);
		
		
		a1.setAccountNum("123-32-4324");
		a1.setPassword("7890");
		
		
		Account a2 = new Account();
		a2.setName("변백현");
		a2.setAccountNum("92-0506-408");
		a2.setPassword("0906");
		
		
		// 각 계좌에 입금
		a1.deposit(1000000L);
		a1.deposit(2345L);
		
		a2.deposit(50000L);
		a2.deposit(30000L);
		
		
		System.out.println("-----------------------");
		// 각 계좌에서 출금
		a1.withdraw("5667", 2000000); // 비번 불일치
		a1.withdraw("7890", 200000000); // 잔액부족
		a1.withdraw("7890", 5000); // 출금성공
		
		System.out.println("----------------------");
		a2.withdraw("5667", 2000000); // 비번 불일치
		a2.withdraw("0906", 200000000); // 잔액부족
		a2.withdraw("0906", 5000); // 출금성공
		
	}

}
