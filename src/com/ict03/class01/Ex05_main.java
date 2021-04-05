package com.ict03.class01;

public class Ex05_main {
public static void main(String[] args) {
	// static은 객체 생성과 상관없이 사용가능
	// 클래스이름.멤버펠드, 클래스이름.멤버메소드
	
	System.out.println(Ex05.s3);
	 // System.out.println(Ex05.s4);    // static이지만 private이기 때문에 접근불가
	
	Ex05 test = new Ex05();
	System.out.println(test.s1);
	// System.out.println(test.s2);     // private이기 때문에 접근불가
	
	System.out.println(test.s3);
	
	test.add();
	// 접근 안됨
	// test.add2();
	test.add3();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
