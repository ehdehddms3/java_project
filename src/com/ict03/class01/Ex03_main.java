package com.ict03.class01;

public class Ex03_main {
public static void main(String[] args) {
	// Ex03 클래스를 객체로 만들자
	
	Ex03 test = new Ex03();
	
	// plus01는 void이므로 받을 데이터 없다.
	System.out.println(1);
	test.plus01();                   // 호출하게되면 실행하게됨
	System.out.println(3);
	System.out.println(test.result); // 호출하지않으면 원래 결과값이 나옴
	
	// sub01은 반환형이 int이므로 저장변수도 int로 만든다.
	int sub = test.sub01();
	System.out.println(sub);
}
}
