package edu.kh.poly.pack3.model.dto;

public class Washer implements Machine {
	
	@Override
	public void powerOn() {
		System.out.println("세탁기의 터치식 전원 버튼 누름");
	}
	
	@Override
	public void powerOff() {
		System.out.println("세탁기 켜져있을 때 전원 버튼 다시 누름");
	}

}
