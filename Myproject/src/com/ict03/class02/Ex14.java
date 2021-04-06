package com.ict03.class02;

public class Ex14 {
	// static : 객체 생성과 상관없이 미리 만들어지는 필드와 메소드
	//          클래스와 지역변수에는 사용할 수 없음
	//          공유개념(모든 객체가 사용할 수 있다.)
	//          접근제한자가 private이면 static이라도 접근할 수 없다
	
	int su1 = 10;
	static int su2 = 10;
	
	public Ex14() {
		su1++;
		su2++;
		
	}
	public void prn() {
		int su3 = 10;
		// static int su4 = 10;     -> 지역변수자리이기 때문
	}
	// static 메소드는 instance 변수 참조안됨(static 변수만 사용가능)
	public static void prn2() {
		// System.out.println(su1);
		System.out.println(su2);
		int su4 = 10;
		// static int su5 = 10;     -> 지역변수자리이기 때문(메소드를 실행할 때 만들어짐) 
	}
	
	
	
	
	
	
	
}
