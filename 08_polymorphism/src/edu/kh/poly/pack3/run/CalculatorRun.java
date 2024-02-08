package edu.kh.poly.pack3.run;

import edu.kh.poly.pack3.model.dto.Calculator;
import edu.kh.poly.pack3.model.dto.JHICalculator;

public class CalculatorRun {
	
	public static void main(String[] args) {
		
		Calculator cal = new JHICalculator();
		
		System.out.println(cal.plus(1, 2));
		System.out.println(cal.minus(10, 7));
		System.out.println(cal.multi(10, 7));
		System.out.println(cal.div(3, 1));
		System.out.println(cal.mod(9, 2));
		System.out.println("-------------------------------");
		System.out.println("sum : " + cal.sum(1,2,3,4,5,6,7,8,9,10));
		System.out.println("areaOfCircle : " + cal.areaOfCircle(5));
		System.out.println("rngeCheck : " + cal.rangeCheck(500));
		System.out.println("rngeCheck : " + cal.rangeCheck(200_000_000));
		System.out.println("pow : " + cal.pow(2,10));
		System.out.println("2진수 : " + cal.toBinary(15));
		System.out.println("16진수 : " + cal.toHexadecimal(15));;
		
	}

}
