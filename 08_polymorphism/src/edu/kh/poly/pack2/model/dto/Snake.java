package edu.kh.poly.pack2.model.dto;

public class Snake extends Animal {
	
	private boolean poison; // 독 유무
	
	// 생성자
	public Snake() {}
	
	public Snake(String type, boolean poison) {
		super(type);
		this.poison = poison;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / 독 유무 : " + poison;
	}
	
	
	@Override
	public void eat() {
		System.out.println("뱀은 널 한 입에 치즈처럼 집어넣어 천천히 소화시킴");
	}
	
	@Override
	public void sleep() {
		System.out.println("뱀은 또아아아아아리 틀고 잔다");
	}
                    

}
