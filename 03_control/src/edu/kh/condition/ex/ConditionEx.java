package edu.kh.condition.ex;

import java.util.Scanner;

/**
 * 조건문 기능용 클래스
 */
public class ConditionEx {
	
	// 필드 (객체의 속성 == 객체가 가지고 있는 값/변수)
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 나이를 입력 받아
	 * 19세 이상은 '성인', 미만은 '성인이 아닙니다.'
	 */
	public void method1() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age >= 19) {
			System.out.println("성인");
		} else {
			System.out.println("성인이 아니무니다");
		}
		
	}
	
	
	/**
	 * 나이를 입력 받아
	 * 13세 이하면 '어린이'
	 * 13세 초과 18세 이하 '청소년'
	 * 19세 이상 '성인'
	 */
	public void method2() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age <= 13) result = "어린이";
			
		else if (age >= 19) result = "성인";
			
		else result = "청소년";
		
		System.out.println(result);
		
	}
	
	/**
	 * month 입력받아 해당 계절 출력하기
	 * <ul>
	 *  <li>봄 : 3~5</li>
	 *  <li>여름 : 6~8</li>
	 *  <li>가을 : 9~11</li>
	 *  <li>겨울 : 12~2</li>
	 * </ul>
	 */
	public void method3() {
		
		System.out.print("무슨 달의 계절이 궁금해? : ");
		
		int month = sc.nextInt();
		
		
		if (month < 1 || month > 12) {
			System.out.println("잘못 입력");
			return; // 메서드 종료. 호출한 곳 돌아감
		}
		
		String result;
		if(month >= 3 && month <= 5) result = "봄";
		else if(month >= 6 && month <= 8) result = "여름";
		else if(month >= 9 && month <= 11) result = "가을";
		else result = "겨울";
		
		
//		if(month >= 1 && month <= 2 || month == 12) result = "겨울";
//		else if(month >= 3 && month <= 5) result = "봄";
//		else if(month >= 6 && month <= 8) result = "여름";
//		else if(month >= 9 && month <= 11) result = "가을";
//		else result = "1월부터 12월까지 있습니다";
		System.out.println(result);
		
	}
	
	public void method3c() {
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
		switch(month) {
			case 3, 4, 5: result = "봄"; break;
			case 6, 7, 8: result = "여름"; break;
			case 9, 10, 11: result = "가을"; break;
			case 12, 1, 2: result = "겨울"; break;
			default : result = "잘못 입력";
		}
		System.out.println(result);
	}
	
	
	/**
	 * P/F 판별하기
	 * <pre>
	 *  중간, 기말, 과제 점수 입력 받아
	 *  총점 60 이상 PASS, 아니면 FAIL
	 *  - 중간(40%), 기말(50%), 과제(10%)
	 *  - 각각 100점 만점
	 *  
	 *  + pass인 경우
	 *  90점 이상 A
	 *  80점 이상 B
	 *  70점 이상 C
	 *  60점 이상 D
	 * </pre>
	 */
	public void method4() {
		
		
		System.out.print("중간 고사 점수 : ");
		int jtest = sc.nextInt();
		
		if (jtest < 0 || jtest > 100) {
			System.out.println("0점 ~ 100점 사이 입력해");
			return;
		}
		
		System.out.print("기말 고사 점수 : ");
		int gtest = sc.nextInt();
		if (gtest < 0 || gtest > 100) {
			System.out.println("0점 ~ 100점 사이 입력해");
			return;
		}
		
		System.out.print("과제 점수 : ");
		int hw = sc.nextInt();
		if (hw < 0 || hw > 100) {
			System.out.println("0점 ~ 100점 사이 입력해");
			return;
		}
		
		double score = (0.4 * jtest) + (0.5 * gtest) + (0.1 * hw);
		
		
		// 변수에 아무런 값 대입되지 않은 경우 사용 불가능(에러)
		// 해결 1) 모든 경우에 변수에 값 대입
		// 해결 2) 변수 선언 시 특정 값으로 초기화 진행
		//				 -> 숫자는 0, String은 (null / ""), boolean은 false. 이 외 객체는 null
		String result;
		
		// switch문 매개변수로는 정수, 문자열, 문자만 가능. 강제형변환 하셈 !!
//		switch((int)(score/10)) {
//		case 9, 10 : result = "A"; break;
//		case 8 : result = "B"; break;
//		case 7 : result = "C"; break;
//		case 6 : result = "D"; break;
//		}
		
		if (score >= 90) result = "A";
		else if (score >= 80) result = "B";
		else if (score >= 70) result = "C";
		else if (score >= 60) result = "D";
		else result = "FAIL";
		
		System.out.printf("점수 : %.1f, 등급은 : %s", score, result);
		
	}
	
	/** <pre>
	 * 국어, 영어, 수학, 사탐, 과탐 점수 입력 받아
	 * 40점 미만 과목 있다? FAIL
	 * 평균이 60점 미만이다? FAIL
	 * 모든 과목 40점 이상, 평균 60점 이상인 경우 PASS
	 * 
	 * [출력 예시]
	 * 1) 40점 미만 과목 존재하는 경우
	 * FAIL [40점 미만 과목 : 국어 영어]
	 * 
	 * 2) 평균 60점 미만인 경우
	 * FAIL [점수 : 50.4 (평균 미달)]
	 * 
	 * 3) PASS인 경우
	 * PASS [점수 : 89.4 / 100]
	 * 
	 * </pre>
	 */
	
	public void method5() {
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		if (kor < 0 || kor > 100) {
			System.out.println("0점 ~ 100점 사이 입력해");
			return;
		}
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		if (eng < 0 || eng > 100) {
			System.out.println("0점 ~ 100점 사이 입력해");
			return;
		}
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		if (math < 0 || math > 100) {
			System.out.println("0점 ~ 100점 사이 입력해");
			return;
		}
		
		System.out.print("사탐 점수 : ");
		int soc = sc.nextInt();
		if (soc < 0 || soc > 100) {
			System.out.println("0점 ~ 100점 사이 입력해");
			return;
		}
		
		System.out.print("과탐 점수 : ");
		int sci = sc.nextInt();
		if (sci < 0 || sci > 100) {
			System.out.println("0점 ~ 100점 사이 입력해");
			return;
		}
		
		boolean flag = false;
		String result = "";
		
		if(kor < 40) {result += "국어"; flag = true;}
		if(eng < 40) {result += "영어"; flag = true;}
		if(math < 40) {result += "수학"; flag = true;}
		if(soc < 40) {result += "사탐"; flag = true;}
		if(sci < 40) {result += "과탐"; flag = true;}
		
		if(flag) {
			System.out.printf("FAIL [40점 미만 과목 : %s]", result);
			return;
		}
		
		double score = (double)(kor + eng + math + soc + sci) / 5;

		if (score < 60) {
			System.out.printf("FAIL [점수 : %.1f (평균 미달)]", score);
			return;
		}
			
		
			System.out.printf("PASS [점수 : %.1f / 100]", score);
		}

	}

	
