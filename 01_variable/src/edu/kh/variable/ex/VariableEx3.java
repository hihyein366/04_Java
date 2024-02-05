package edu.kh.variable.ex;

public class VariableEx3 {
	
	public static void main(String[] args) {
		
		/* ** 강제 형변환 ** 
		 * 1. 값의 범위가 큰 자료형 -> 작은 자료형으로 강제 변환
		 *  -> 데이터 손실 고려
		 * 
		 * 2. 의도적으로 자료형을 다른 자료형으로 변환 시킬 때
		 * 
		 * [작성법]
		 * 
		 * (자료형) 변수명or값; // 지정된 자료형으로 변경됨
		 */
		
		// 강제 형변환 확인1 
		// -> 자료형 변환 + 데이터 손실
		int num1 = 290;
		byte result1 = (byte) num1; // 강제 형변환
		
		System.out.println("num1 : " + num1);
		System.out.println("result1 : " + result1);
		
		
		// 강제 형변환 확인2
		// - 실수를 정수로 변환해서 소수점 없애기
		//	 (데이터 손실 활용)
		double num2 = 123.123456789;
		int result2 = (int) num2;
		
		System.out.println("num2 : " + num2);
		System.out.println("result2 : " + result2);
		
		
		/* 난수 + 강제형변환 */
		// 난수 : Math.random();    0.0이상 ~ 1.0이하
		
		// 1~10 사이 난수
		int random = (int)(Math.random() * 10 + 1);	 		// 1 ~ 11 (1부터 10사이인에 0부터시작이라 +1 해줌)
								// 난수에서 발생하는 소수 강제형변환으로 제거.
		
		System.out.println("random : " + random);
		
		
		// 강제 형변환 확인3
		// -> 의도적으로 강제 형변환
		System.out.println( 123 );
		System.out.println( (double)123 ); // 123.0
		
		
		// 강제 형변환 확인4
		// + 값 처리 원칙(같은 자료형 연산 -> 같은 자료형 결과)
		
		int num3 = 5;
		int num4 = 2;
		
		System.out.println(num3 / num4); // 5/2 == 2.5 지만 int 라 2 출력.
		
		System.out.println( (double)(num3 / num4)); // 2.0 이 됨. (결과만 double)
		
		System.out.println( (double)num3 / (double)num4 ); // 자료형을 바꿔버림. == 2.5
		
		// 강제 형변환 + 자동 형변환 + 값처리 원칙
		System.out.println( (double)num3 / num4 ); // double 범위가 더 커서 하나만 넣어도 됨
		// -> 강제로 형변환해서 나머지는 자동 형변환 되고 값처리 원칙 따라 결과도 double로 나옴
		
		
		// 강제 형변환 확인5
		// -> 문자(char) <-> 유니코드(int)
		
		System.out.println("A의 번호 : " + (int)'A'); // 홑따옴=char
		
		System.out.println("84의 문자 : " + (char)84); // T
		
		
		// ---------------------------------------------------------------------------------
		                                   
		// 오버플로우 : 연산으로 인해 자료형 값 범위 초과하는 경우 발생
		
		byte temp1 = 127;
		
		byte temp2 = (byte)(temp1 + 1); // int 결과 byte로 강제 형변환. ~127까지인 범위를 한칸 초과.
		
		System.out.println("temp1 : " + temp1); // 127
		System.out.println("temp3 : " + temp2); // -128
		
		
	}

}













