package edu.kh.poly.pack3.model.dto;

// Interface : 접점 (클래스간의 접점을 만드는 용도)


public interface Machine {

	// 인터페이스는 상수형 필드(public static final)만 작성 가능!!
	// -> 작성하는 모든 필드가 public static final
	// -> public static final 구문을 명시적으로 작성하지 않아도 묵시적으로 그거로 인식됨
	
	// public static final VOLT = 220;
	int VOLT = 220; // 
	
	public abstract void powerOn();
	void powerOff();
}
