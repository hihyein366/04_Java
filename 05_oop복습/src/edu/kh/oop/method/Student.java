package edu.kh.oop.method;


// 정보 저장하는 곳
public class Student {
	
	public static String schoolNama = "젤리대학교";
	
	public static final int MAX_VALUE = 100;
	public static final int MIN_VALUE = 0;
	
	private String name;
	private String studentNum;
	private char gender;
	private int java; 
	private int html;
	
	public Student() {}
	
	public Student(String name, String studentNum, char gender) {
		this.name = name;
		this.studentNum = studentNum;
		this.gender = gender;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setStudentNum (String studentNum) {
		this.studentNum = studentNum;
	}
	
	public void setGender (char gender) {
		this.gender = gender;
	}
	
	public void setJava (int java) {
		this.java = java;
	}
	
	public void setHtml (int html) {
		this.html = html;
	}
	
	
	public String getName() {
		return name;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getJava() {
		return java;
	}
	
	public int getHtml() {
		return html;
	}
	
}


