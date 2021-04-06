package com.ict03.class04;

public class Ex03 extends Ex02 {

	String name = "차두리";
	int age = 34;
	private String hobby = "영화보기";
	
	public Ex03() {
		System.out.println("자식 클래스 생성자");
	}
	public void sound() {
		System.out.println("자식 클래스 메소드");
	}
	
	public void study() {
		// 객체 생성없이 부모클래스의 멤버를 사용한 것
		System.out.println("공부장소 : " + addr);
		
		// 전역변수에 있으면 전역변수에서 가지고옴
		System.out.println("name : " + this.name);    // 차두리 (자식은 this를 붙임)
		
		System.out.println("name : " + super.name);   // 차범근 (부모는 super를 붙임)
		
		// 상속관계라도 private은 사용할 수 없다.
		// System.out.println("우리집 애완동물 :" + dog);
	}
}
