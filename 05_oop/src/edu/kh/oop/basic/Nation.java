package edu.kh.oop.basic;


// 클래스 : 객체가 가져야할 속성(값), 기능(메서드)를 글(코드)로 작성해둔 문서(설계도)
// 					== 객체를 정의한 것

/**
 * 국민 객체를 만들기 위한 클래스
 */
public class Nation {
	
	/* 속성(값) */
	String name;  
	int age;
	char gender;
	String juminNum;
	String tel;
	String address;
	
	/* 기능 */
	public void speakKorean() {
		System.out.println("가나 한국어 가능");
	}
	
	public void welfare() {
		System.out.println("한국 제공 복지 누리기");
	}
	
	public void 납세의의무() {
		// 만 19세 이상 성인만 세금을 내는 경우
		if(age >= 19) {
			System.out.printf("%s님은 세금 납부 대상자 입니다. \n", name);			
		} else {
			System.out.printf("%s님은 %d세 미성년자로 납부 대상자가 아닙니다. \n", name, age);
		}
		
	}
	
	public void introduce() {
		System.out.printf("이름은 %s이고, 나이는 %d살, %c성입니다. \n", name, age, gender);
	}

}
