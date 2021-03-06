package com.ict03.class02;

public class Ex15 {
	int s1 = 100;
	
	// static 초기화 전 데이터는 초기화를 만나면 없어진다.
	static int s2 = 200;
	
	// static 초기화
	static {
		s2 = 2000;       // 기존값 200을 무시하고 2000으로 변경된다.
		s3 = 3000;
		s4 = 4000;
		// s5 = 5000;     -> 선언을 안해줬기 때문에 오류발생
	
	}
	// 초기화 이후 선언해도 오류 발생 안함
	static int s3 = 300;
	// 나중에 선언을 해줌
	static int s4;
	
	public static void main(String[] args) {
		// main()도 static이므로 전역변수가 instance이면 사용할 수 없다.
		// system.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
