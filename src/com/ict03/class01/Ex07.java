package com.ict03.class01;

public class Ex07 {
	private String name = "둘리";
	private int age = 13;
	private double height = 135.15;
	private boolean gender = true;
	private char rank = 'A';
	
	// getter / setter 호출  => 메뉴 - Source
	
	public String getName() {
		return name;
	}
	// set
	// 지역변수이름과 전역변수 이름이 같을때     -> 전역변수에는 this를 붙인다.
	// 지역변수이름과 전역변수 이름이 같을때 우선순위 : 지역변수 > 전역변수
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	public char getRank() {
		return rank;
	}
	public void setRank(char rank) {
		this.rank = rank;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
